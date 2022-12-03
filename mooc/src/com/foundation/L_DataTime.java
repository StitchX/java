package com.foundation;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L_DataTime {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); //获取格式化时间
        System.out.println(date.getTime());  //获取时间戳

//        使用 SimpleDateFormat 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));

        /*
        日期和时间的格式化编码
        时间模式字符串用来指定时间格式。在此模式中，所有的 ASCII 字母被保留为模式字母，定义如下：

        字母	    描述	示例
        G	    纪元标记	AD
        y	    四位年份	2001
        M	    月份	July or 07
        d	    一个月的日期	10
        h	     A.M./P.M. (1~12)格式小时	12
        H	    一天中的小时 (0~23)	22
        m	    分钟数	30
        s	    秒数	55
        S	    毫秒数	234
        E	    星期几	Tuesday
        D	    一年中的日子	360
        F	    一个月中第几周的周几	2 (second Wed. in July)
        w	    一年中第几周	40
        W	    一个月中第几周	1
        等等
         */

//        使用printf格式化日期
        System.out.printf("%tF%n",date);
        System.out.printf("%tc%n",date);
        System.out.printf("%tD%n",date);
        System.out.println("----------------------");

//        休眠
//        try {
//            Thread.sleep(1000*3);
//        }catch (Exception e){
//            System.out.printf("休眠必须结合try-catch");
//        }

//        测量时间
        try {
            long star = System.currentTimeMillis();
            System.out.println(new Date()+"\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date()+"\n");
            long end = System.currentTimeMillis();
            System.out.println(end-star);
        }catch (Exception e){
            System.out.println("报错啦");
        }
        System.out.println("----------------===");

//        Calendar类：
//        格式化并创建一个日期对象,设置和获取日期数据的特定部分,在日期的这些部分加上或者减去值
//        创建一个代表系统当前日期的Calendar对象
        Calendar c = Calendar.getInstance();
        c.set(2008,1,1);  //创建一个代表2008年1月1日的Calendar对象
        c.add(Calendar.DATE,1);  //c对象的日期加上10
        System.out.println(c.get(Calendar.DATE));  //对象信息的获得
        System.out.println("================------------------");


//        GregorianCalendar类

    }
}
