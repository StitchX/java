package com.foundation;

import java.util.Scanner;

public class P_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
    next():
        1、一定要读取到有效字符后才可以结束输入。
        2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
        3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
        next() 不能得到带有空格的字符串。
    nextLine()：
        1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
        2、可以获得空白。
     */
//        System.out.println(scan.next()+"buzhid");
//        System.out.println(scan.nextLine());
//        scan.nextInt();

 /*       System.out.println("输入整数:");
        if (scan.hasNextInt()){
            System.out.println(scan.nextInt());
        }else {
            System.out.println("输入的不是整数");
        }

        System.out.println("输入小数：");
        if (scan.hasNextFloat()){
            System.out.println(scan.nextFloat());
        }else {
            System.out.println(scan.nextFloat());
        } */

        System.out.println("请输入数字：");
        double sum = 0;
        while (scan.hasNextDouble()){
            double x= scan.nextDouble();
            sum += x;
        }

        System.out.println(sum);

        scan.close();
    }
}
