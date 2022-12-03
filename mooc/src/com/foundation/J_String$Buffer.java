package com.foundation;
//string和stringbuffer

public class J_String$Buffer {

    public static void main(String[] args) {

//        String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上
        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建

        System.out.println(s1.toLowerCase());
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

//        String 类有 11 种构造方法，这些方法提供不同的参数来初始化字符串，

        char[] charArray={'a','b','c','d'};
        String helloStr= new String(charArray);
        System.out.println(helloStr);

        String site = "www.runoob.com";
        String site2 = "hello";
        int len = site.length();
        System.out.println(len);
        System.out.println(site.concat(site2)); //site+site2

//        创建格式化字符串
//        String 类使用静态方法 format() 返回一个String 对象而不是 PrintStream 对象。
//        String 类的静态方法 format() 能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出。

        System.out.printf("格式化输出：%s",site);
        System.out.println();
//        String fs = String.format("%d",len);


//        和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象
//        Java 5 中被提出，StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象
        StringBuffer sb = new StringBuffer(10);
        sb.append("Bus..");
        System.out.println(sb);
        sb.insert(2,'p');
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);
    }
}
