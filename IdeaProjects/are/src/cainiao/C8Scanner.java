package cainiao;

import java.util.Scanner;

//java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入
public class C8Scanner {
    /*
    next() 与 nextLine() 区别
    next():
        1、一定要读取到有效字符后才可以结束输入。
        2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
        3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
    next() 不能得到带有空格的字符串。
    nextLine()：
        1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
        2、可以获得空白。
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("sca方式接收：");
//        Scanner 类的 next() 与 nextLine() 方法获取输入的字符串
        if(scn.hasNext()){
            System.out.println(scn.next());
            System.out.println(scn.nextLine());
        }else {
//            System.out.println("没啦");
        }

//        循环输入，输入到非数字结束
        while (scn.hasNextInt()){
            System.out.println(scn.next());
        }
        scn.close();
    }
}
