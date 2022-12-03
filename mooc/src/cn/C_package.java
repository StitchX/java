package cn;
// 包及子包的定义，实际上是为了解决名字空间、名字冲突

//包有两方面的含义
//        一是名字空间、存储路径（文件夹）、
//        一是可访问性（同一包中的各个类，默认情况下可互相访问)

//包层次的根目录是由环境变量CLASSPATH来确定的;没有package语句，这时称为无名包（unnamed package）

import java.util.*;
//星号(*)只能表示本层次的所有类，不包括子层次下的类。

//Java编译器自动导入包java.lang.*      math,number,string

public class C_package {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.round(3.4));
    }
}
