package cn.ch07;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import static java.util.Calendar.*;   // 导入后直接使用

//cla

public class B2_data {

    public static void main(String[] args) {
        /*
        Calendar
            得到一个实例 Calendar.getInstance() //Locale.ZH
            .get(DAY_OF_MONTH) .getDisplayName(DAY_OF_WEEK)
            .set .add(HOUR,1) .roll(MONTH, 5),
            .setTime(date), .getTime()
        Date
            new Date(), new Date(System.currentTimeMillis())
            .setTime(long), .getTime()
        SimpleDateFormat(“yyyy-MM-dd HH:mm:ss”)
            .format, .parse
         */
        Calendar calendar = Calendar.getInstance();
        calendar.roll(Calendar.MONTH, 1);  // 月份加1
        System.out.println(calendar.get(Calendar.MONTH)+"月"+calendar.get(Calendar.DATE)+"日");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(date));

//        date = new SimpleDateFormat("yyyy-MM-dd").parse("2011-1-1");
//        calendar.setTime(date);
        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.CHINA));


        /*
        Java8中的time api
        java.time.*
        java.time.format.*
        主要的类
            Instant 时刻 Clock 时区 Duration 时间段
            常用的类 LocalDateTime LocalDate LocalTime .of .parse .format .plus .minus
        DateTimeFormatter
         */

        System.out.println("---------------分割线-----------------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 自定义时区
        LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(now2);  //  会以相应的时区显示日期

//        构造一个对象
        LocalDateTime d1 = LocalDateTime.of(2013,12,31,23,59,59);


//        解析String -->LocalDateTime
        LocalDateTime d4 = LocalDateTime.parse("2022-05-02T16:37:49");
        System.out.println(d4);


        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        System.out.println(formatter3);
//        LocalDateTime d6 = LocalDateTime.parse("2011/12/31 23:59:59",formatter3);  // 具体参考代码
    }
}
