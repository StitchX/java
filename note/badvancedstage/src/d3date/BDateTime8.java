package d3date;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author Eva   Email:
 * @Description jdk 8中新日期时间API
 * @data 2023/2/9 16:18
 */
public class BDateTime8 {
    /*
    localDate,localTime,localDateTime的使用
    说明：
        1、localDateTime相较于localDate(日期)，localTime（时间点），使用频率要高
        2、类似于Calendar
        3、 分别使用ISO-8611（国际化组织制定的现代公民的日期和时间的表示，也是公历）日历系统的时间
     */
    @Test
    public void test01(){
//        now(): 获取当前的日期、时间、日期+时间
        LocalDate localDate01 = LocalDate.now();
        LocalTime localTime01 = LocalTime.now();
        LocalDateTime localDateTime01 = LocalDateTime.now();
        System.out.println(localDate01);
        System.out.println(localTime01);
        System.out.println(localDateTime01);
        System.out.println("--------------------------");
//        of()：设置指定的年、月、日、时、分、秒，没有偏移量
        LocalDateTime localDateTime02 = localDateTime01.of(2020,10,9,10,10,10);
        System.out.println(localDateTime02);
        System.out.println("================================");
//        getXxx()：获取相关的属性
        System.out.println(localDateTime02.getDayOfMonth());
        System.out.println(localDateTime02.getDayOfWeek());
        System.out.println(localDateTime02.getMinute());
        System.out.println(localDateTime02.getMonthValue()); // 10
        System.out.println(localDateTime02.getMonth()); // OCTOBER

//        体现不可变性
//        withXxx()：设置相关的属性
        LocalDate localDate02 = localDate01.withDayOfMonth(22);
        System.out.println(localDate01); // 2023-02-09
        System.out.println(localDate02); // 2023-02-22

        LocalDateTime localDateTime03 = localDateTime01.withHour(4);
        System.out.println(localDateTime01); // 2023-02-09T17:15:17.577821300
        System.out.println(localDateTime03); // 2023-02-09T04:15:17.577821300

//        不可变性
        LocalDateTime localDateTime04 = localDateTime01.minusDays(6); // 当前日期减6天
        LocalDateTime localDateTime05 = localDateTime01.plusDays(2); // 当前日期加2天
        System.out.println(localDateTime04); // 2023-02-03T17:15:17.577821300
        System.out.println(localDateTime05);

    }
    /*
    java.time包通过值类型Instant提供机器视图，不提供处理人类意义上的时间单位。
    从1970年1月1日0时0分0秒（UTC）开始的秒数
    计算世界时间的主要标准有：
        UTC（Coordinated Universal Time）
        GMT（GreenwichMean Time）
        CST（Central Standard Time）
    Instant使用
        类似与java.util.Date类
     */
    @Test
    public void test02(){
        // 静态方法，默认返回UTC时区的时间
        Instant instant01 = Instant.now(); // 对应本初子午线
//        静态方法，返回1970.1.1 00:00:00基础上加上指定毫秒数之后的Instant类的对象
        Instant instant02 = Instant.ofEpochMilli(1000);

        System.out.println(instant01);
        System.out.println(instant02);

//        添加时间的偏移量
        System.out.println(instant01.atOffset(ZoneOffset.ofHours(8)));

//        从1970年1月1日0时0分0秒（UTC）开始的毫秒数
        long t1 = instant01.toEpochMilli(); // DateTime中的getTime方法
        System.out.println(t1);

    }
    /*
    DateTimeFomatter类：格式化或解析日期、时间
    类似于：SimpleDateFormat

     */
    @Test
    public void test03(){
//        三种声明方式
//        方式一：预定义的标准格式，如：ISO_LOCAL_DATE_TIME，ISO_LOCAL_DATE，ISO_LOCAL_TIME
        DateTimeFormatter dtf01 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        格式化：日期———>字符串
        String str = dtf01.format(LocalDateTime.now());
        System.out.println(str);

//        解析：字符串-->日期
        TemporalAccessor t1 = dtf01.parse("2023-02-13T10:38:59.784912");
        System.out.println(t1);

//        方式二：
//        本地化相关的格式。如：ofLocalizedDateTime()
//        FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT
        DateTimeFormatter dtf02 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //        格式化：日期———>字符串
        System.out.println(dtf02.format(LocalDateTime.now()));

//        本地化相关的格式。如：ofLocalizedDateTime()
//        FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT/FormatStyle.FULL：适用于LocalDate
        DateTimeFormatter dtf03 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dtf03.parse("2023/2/13"));

//        重点：方式三：自定义的格式：如：ofPattern("yyyy-MM-dd hh:mm:ss")
        DateTimeFormatter dtf04 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        格式化
        String s1 = dtf04.format(LocalDateTime.now());
        System.out.println(s1);
//
    }
}


    /*
    Calendar和Date的问题：
    1、可变性：像日期和时间这样的类应该是不可变的
    2、偏移性：Date中年份是会加上1900，月份从0开始算
    3、格式化：格式化只对Date有用，Calendar则不行
    此外，它们也不是线程安全的：不能处理闰秒

    总结：对日期和时间的操作一直是Java程序员最痛苦的地方之一

    第三次引入API是成功的，并且java 8中引入的java.time API已经纠正了过去的缺陷，将来很长一段时间它都会为我们服务
    Java 8 吸收了Joda-Time的精华
     */
    /*
    新日期的API：
    java.time
    java.time.chrono
    java.time.format
    java.time.temporal
    java.time.zone

    说明：大多数开发者只会用到基础包format包，也可能会用到temporat包，因此，尽管有69个新公开类型，
        大多数开发者，大概将指挥用到其中的三分之一
     */
