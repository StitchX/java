package cainiao;

import java.text.SimpleDateFormat;
import java.util.Date;

// 日期和时间
public class C1Date {
    /*
    1、
    java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。
    第一个构造函数使用当前日期和时间来初始化对象     Date( )
    第二个构造函数接收一个参数，该参数是从 1970 年 1 月 1 日起的毫秒数。  Date(long millisec)
    2、
    使用 SimpleDateFormat 格式化日期
    3、
    使用printf格式化日期
    4、休眠
    5、测量时间

     */
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(data.toString());
        System.out.println(data.getTime());
        System.out.println(data.hashCode());

//        2、使用 SimpleDateFormat 格式化日期
//        System.out.println(sdf.format(data));

//        3、使用printf格式化日期
//        System.out.printf("%tR",data);  //24小时制；10:50
        System.out.printf("%tr%n",data);  //12小时制；10:51:00 上午
//        遇到的问题，必须使用new Data()；即时获取时间
        System.out.printf("%tr%n",new Date());

//      5、测量时间长短
        long start  = System.currentTimeMillis();

//        4、sleep一下
        try {
            Thread.sleep(1000*2);
        }catch (Exception e){
            System.out.println("got an exception");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);


    }
}
