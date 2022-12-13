package cainiao;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Calendar类的功能要比Date类强大很多，而且在实现方式上也比Date类要复杂一些。
// 设置和获取日期数据的特定部分呢;在日期的这些部分加上或者减去值

//GregorianCalendar类：Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现
public class C2Calendar {
    /*
    Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。

     */
    public static void main(String[] args) {
//        创建一个代表系统当前日期的Calendar对象
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime()); //Tue Nov 08 11:17:05 CST 2022

//        创建一个指定日期的Calendar对象
        c1.set(2012,6-1,12);
        System.out.println(c1.getTime());  //Tue Jun 12 11:17:05 CST 2012
//        c1对象代表的日期设置为10号
        c1.set(Calendar.DATE,10);
        System.out.println(c1.getTime());  //Sun Jun 10 11:19:50 CST 2012

//        Add设置，把c1对象的日期加上10
        c1.add(Calendar.DATE,10);
        System.out.println(c1.getTime());  //Wed Jun 20 11:20:53 CST 2012

//        获取年份
        System.out.println(c1.get(Calendar.YEAR));


    /*
    GregorianCalendar定义了两个字段：AD和BC。这是代表公历定义的两个时代。
     */
        GregorianCalendar greCa = new GregorianCalendar();
        System.out.println(greCa.getTime());  // Tue Nov 08 11:32:12 CST 2022
        System.out.println(greCa.get(Calendar.MONTH));

//        是否是闰年
        System.out.println(greCa.isLeapYear(Calendar.YEAR));

    }

}
