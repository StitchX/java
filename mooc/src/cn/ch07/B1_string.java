package cn.ch07;

import java.util.StringTokenizer;

public class B1_string {
    /*
    字符串可以分为两大类
        String类
            创建之后不会再做修改和变动，即 immutable
        StringBuffer、StringBuilder类
            创建之后允许再做更改和变化
            其中 StringBuilder是JDK1.5增加的，它是非线程安全的 （不考虑多线程同时访问情况，相对说StringBuilder效率高）
        特别注意
            在循环中使用String的+=可能会带来效率问题 （由于immutable，使用 += 重新生成新的实例）

     */

    public static void main(String[] args) {
//        下面证明string效率低
        char a = 'q';
        String s = "";
        StringBuffer sb = new StringBuffer();
        final int N=100000;

        long t1 = System.currentTimeMillis();

        for (int i = 0; i<N; i++) s +=a ;  // 1、生成StringBuffer 2、append 3、 toString

        long t2 =System.currentTimeMillis();

        for (int i = 0; i<N; i++) sb.append(a);
        long t3 = System.currentTimeMillis();

        System.out.println(t2-t1);
        System.out.println(t3-t2);
        System.out.println(System.currentTimeMillis());



        /*
        String 类对象保存不可修改(immutable)的Unicode字符序列
        String类的下述方法能创建并返回一个新的String对象实例: concat, replace, replaceAll, substring, toLowerCase,
                        toUpperCase, trim,toString.
        查找: endsWith, startsWith, indexOf,，lastIndexOf.
        比较: equals, equalsIgnoreCase,
        字符及长度: charAt ，length.
         */

        System.out.println("---------------分割线 string方法-----------------");
        String s2 = new String("Hello World");
        System.out.println(s2.length());
        System.out.println(s2.indexOf('o'));   // 4
        System.out.println(s2.startsWith("He"));
        System.out.println(s2.equals("Hello world"));
        System.out.println(s2.equalsIgnoreCase("Hello world"));
        System.out.println(s2.charAt(1));  // e
        System.out.println(s2.substring(0,2));  //  He
        System.out.println(s2.substring(2));   //  llo World
        System.out.println(s2.concat("!!!"));   // Hello World!!!


        /*
        Jdk1.5 增加了format函数
            %1$,8.5f %序号$ 标识 宽度及精度 转换方式    宽度8，小数点后5位，f表实数
         */
        System.out.println("---------------------分割线 format的使用---------------------");

//        System.out.println("%1$,8.5f",(189384.8403740));



        /*
        除了immutable特点外，还要注意String常量的内部化（interned）
        问题
        即同样的字符串常量是合并的（是指向同一个引用的）
        以保证 “abc”==“abc”
            但是 “abc” != new String(“abc”)
         */
        System.out.println("abc" == "abc");
        System.out.println("abc" == new String("abc"));


        /*
         StringBuffer类对象保存可修改的Unicode字符序列:
         StringBuilder类似，它效率更高，不考虑线程安全性
         构造方法
            StringBuffer()
            StringBuffer(int capacity)
            StringBuffer(String initialString)
         实现修改操作的方法:
            append, insert, reverse, setCharAt, setLength.
         */


        /*
        字符串的分割
        java.util.StringTokenizer类提供了对字符串进行分割的功能。
        构造
            StringTokenizer(String str, String delim);
        该类的重要方法有：
            public int countTokens()；// 分割串的个数
            public boolean hasMoreTokens()；// 是否还有分割串
            public String nextToken()；// 得到下一分割串
        另String类的 matches, replaceAll, split可以使用正则表达式（以后讲）
         */
        System.out.println("-----------------分隔符 分割字符串-------------------");

        StringTokenizer st = new StringTokenizer("this is a test", " ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        st  = new StringTokenizer("123,4,3,6,3,2",",");
        double sum = 0;
        while (st.hasMoreTokens()){
            sum += Double.parseDouble(st.nextToken());
        }
        System.out.println(sum);

    }
}
