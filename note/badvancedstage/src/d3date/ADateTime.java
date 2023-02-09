package d3date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Eva   Email:
 * @Description JDK 8之前的时间和日期的API测试
 * @data 2023/2/9 14:01
 */
public class ADateTime {
//    1、System类中的currentTimeMillis()
    @Test
    public void test01(){
//        返回当前时间戳与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
//        时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    /*
    2、
    java.util.Date类
        |---java.sql.Date类 （都代表时间，还是子父类关系）
    1. 两个构造器的使用
        > 构造器一：Date(): 创建一个对应当前时间的Date对象
        > 构造器二：创建指定毫秒数的Date对象

    2. 两个方法的使用
        > toString(): 显示当前的年、月、日、时、分、秒
        > getTime(): 获取当前Date对象对应的毫秒数。（时间戳）

    3. java.sql.Date对应着数据库中的日期类型的变量
        > 如何实例化
        > 如何将java.lang.Date对象转换为java.lang.Date对象
     */
    @Test
    public void test02(){
//        构造器一：Date(): 创建一个对应当前时间的Date对象
        Date date01 = new Date();
        System.out.println(date01.toString()); //Thu Feb 09 14:25:37 CST 2023

        System.out.println(date01.getTime()); //1675923964041

//        构造器二：创建指定毫秒数的Date对象
        Date date02 = new Date(167592396404L);
        System.out.println(date02);

//        创建java.sql.Date对象
        java.sql.Date date03 = new java.sql.Date(167592396404L);
        System.out.println(date03); // 1975-04-25

//        如何将java.lang.Date对象转换为java.sql.Date对象
//        情况一： (这样也可以，比较勉强)
//        Date date04 = new java.sql.Date(167592396404L);
//        java.sql.Date date05 = (java.sql.Date) date04;

//        情况二：
        Date date6 = new Date();
        java.sql.Date date07 = new java.sql.Date(date6.getTime());
    }

    /*
    3、
    Date类的API大部分不利于国际化，大部分被废弃了，需要转换
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1. 两个操作：
    1.1 格式化：日期 ----> 字符串
    1.2 解析：格式化的逆过程，字符串 ---> 日期

    2. SimpleDateFormat的实例化
     */
    @Test
    public void test03() throws ParseException {
//   ------实例化SimpleDateFormat: 使用默认构造器-----
        SimpleDateFormat sdf1 = new SimpleDateFormat();

//        格式化：日期-->字符串
        Date date = new Date();
        System.out.println(date); // Thu Feb 09 15:16:37 CST 2023

        String format = sdf1.format(date);
        System.out.println(format);  // 2023/2/9 15:16

//        解析：格式化的逆过程，字符串 --> 日期
        String str = "2023/2/9 15:16";
        Date date01 = sdf1.parse(str); // 为了防止字符串格式错误
        System.out.println(date01);

//        -----------------按照指定的方式格式化和解析：调用带参的构造器-------------------
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss");

//        格式化：
        String f1 = sdf2.format(date);
        System.out.println(f1); // 2023.二月.09 公元 03:23 下午

//        解析：要求字符串必须是符合SimpleDateFormat识别的格式（通过构造器参数实现）
//        否则，抛异常
        Date date2 = sdf2.parse("2018-01-01 11:45:55");
        System.out.println(date2);
//
//        练习题一：将”2015-01-02“ 转换为java.sql.Date
//        练习题二：”三天打鱼两天筛网“ 1970-01-01 ****-**-**是打鱼？筛网（面试题）
//
//            方式一：总天数计算（毫秒数相减 /1000/60/60/24 +1）；%5: 0 4 晒网  1 2 3打鱼
//          方式二：先减去年数

    }

    /*
    4、
    Calendar日历类（抽象类）的使用
    比Date要强大，涉及日期之间的一些操作
    注意：月份，一月是0 ；周日是1
     */
    @Test
    public void test04(){
//        1. 实例化
//        方式一：创建其子类（GregorianCalendar）的对象
//        Calendar g1 = new GregorianCalendar();
//        方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass()); // GregorianCalendar


//        2. 常用方法
//        get()
        int n = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(n); // 这个月的第几天

//        set()
//        calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH,5); // 设置为这月的第5天
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 从星期天开始算

//        add()
        calendar.add(Calendar.DAY_OF_MONTH,-1); // 获取到的天数加几天
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 从星期天开始算

//        getTime() 日历类--->Date
        Date date01 = calendar.getTime();
        System.out.println(date01);

//        setTime()  Date--->日历类    (前面的练习题就会简单点)
        Date date02 = new Date();
        calendar.setTime(date02);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

    }
}
