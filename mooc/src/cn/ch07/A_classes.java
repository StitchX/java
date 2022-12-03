package cn.ch07;

//常见编程任务的类，学习和掌握最基本的，编程任务常用的类
//API文档查看和源码查看（了解相关类）
//    在线查阅:http://docs.oracle.com/javase/8/docs/api/index.html
//    文档下载：http://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html
//    更多文档：http://docs.oracle.com/javase/8/docs/index.html  网上有chm格式的，有中文版
//    JDK的源代码
//      安装JDK后即有 src.zip
//      例如：在 C:\Program Files\Java\jdk\下

import java.util.Enumeration;
import java.util.Properties;

public class A_classes {
    /*
    Java基础类库
    java.lang Java语言的核心类库
        Java是自动导入java.lang.*的
    java.util 实用工具
    java.io 标准输入/输出类库
    java.awt javax.swing 图形用户界面(GUI)的类库
    java.net 网络功能的类库
    java.sql 数据库访问的类库
    等等
     */

    //    Object类
//      Object类是所有类的直接或间接父类
//      让所有的类有了一致性


//        1、equals
    public static void equals1(){
//        “==”与equals的区别：==是引用是否相等，equals是内容（含义）相等
//        如果覆盖equals()方法，一般也要覆盖hashCode()方法
//            先用hashCode()判断，对象生成或计算出整数，先使hashCode()相等
        Integer one  = new Integer(1);
        Integer anotherone = new Integer(1);
        if (one == anotherone){
            System.out.println("值相等");
        }else if (one.equals(anotherone)){
            System.out.println("引用相等");
        }else {
            System.out.println("啥都不等");
        }
    }

//    2、getclass()
//    getClass ( )方法是final方法，它不能被重载
//    它返回一个对象在运行时所对应的类的表示

    static void printClassName(Object obj){
        System.out.println(obj.getClass().getName());
    }


//    3、toString( )
//    toString( )方法用来返回对象的字符串表示
//    常用于显示:System.out.println ( person ) 和 “current person is “ + person
//    通过重载toString ( )方法，可以适当地显示对象的信息以进行调试

//    4、finalize( )
//    用于在垃圾收集前清除对象，前面已经讲述

//    5、notify( )、 notifyAll( )、 wait( )  与线程相关，以后讲解


//    基本数据类型的包装类
    /*
    Java的基本数据类型用于定义简单的变量和属性将十分方便，但为了与面向对象的环境一致，
    Java中提供了基本数据类型的包装类（wrapper），它们是这些基本类型的面向对象的代表
    与8种基本数据类型相对应，基本数据类型的包装类也有8种，分别是：
    Character，Byte，Short，Integer，Long，Float，Double，Boolean
     */

    /*
    包装类的特点
    （1）这些类都提供了一些常数
        如Integer.MAX_VALUE（整数最大值）， Double.NaN(非数字)，Double. POSITIVE_INFINITY（正无穷）等。
    （2）提供了valueOf(String)，toString()
        用于从字符串转换及或转换成字符串。
    （3）通过xxxxValue()方法可以得到所包装的值
        Integer对象的intValue()方法。
    （4）对象中所包装的值是不可改变的（immutable）。
        要改变对象中的值只有重新生成新的对象。   //保证包装的值的稳定性，不能任意改变
    （5）toString(), equals()等方法进行了覆盖。
        除了以上特点外，有的类还提供了一些实用的方法以方便操作。
        例如，Double类就提供了parseDouble(), max, min方法等。
     */
//    JDK1.5以上，有包装（boxing)及拆包(unboxing)
    Integer I = 5;  //I = Integer.valueOf(5)
    int i = I;  // i = I.intValue();


//    Math类
//    random()  sqrt(double a)；// 平方根  sin(double a)；// 正弦    cos(double a)；// 余弦

//    System类
    /*
     在Java中，系统属性可以通过环境变量来获得
        System.getProperty(String name)方法获得特定的系统属性值
        System.getProperties()方法获得一个 Properties类的对象，其中包含了所有可用的系统属性信息
     在命令行运行Java程序时可使用-D选项添加新的系统属性
        如 java –Dvar=value MyProg

     */
    public static void main(String[] args) {
        equals1();

        Properties prop = System.getProperties();
        Enumeration keys = prop.propertyNames();
        while (keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            System.out.println(key + "=" + prop.getProperty(key));
        }
        System.out.println(System.currentTimeMillis());
    }
    
}

//凭空敲的一些东西
//public class Demo1 {
//    public static void main(String[] args) {
//        Emo2 em = Emo2.print();
////        System.out.println(em);
//    }
//}
//
//class Emo2{
//    public static Emo2 print(){
//        System.out.println("you you");
//        return null;
//    }
//    static int evil(){
//        return 1;
//    }
//}

