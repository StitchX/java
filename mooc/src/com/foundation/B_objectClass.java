package com.foundation;
//1、如果一个类定义在某个包中，那么 package 语句应该在源文件的首行。  package com;
//   包主要用来对类和接口进行分类。


/*2、
    Java作为一种面向对象语言。支持以下基本概念：
        多态   继承    封装
        抽象    类    对象
        实例   方法    重载
     */
//

//3、
//如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面。
//import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。

import java.util.Scanner;

//4、
//        一个源文件中只能有一个 public 类
//        一个源文件可以有多个非 public 类
//        源文件的名称应该和 public 类的类名保持一致。B_objectClass
public class B_objectClass {

    String breed = "雪纳瑞";
    int size;
    String colour;
    int age;

    public B_objectClass(String puppyName){
//        5、
//        构造方式
//        每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法。
//        在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
        /*
        构造方法，是一种特殊的方法，它是一个与类同名的方法。对象的创建就是通过构造方法来完成，其功能主要是完成对象的初始化。
        当类实例化一个对象时会自动调用构造方法。构造方法和其他方法一样也可以重载。
        在Java中，任何变量在被使用前都必须先设置初值，如无显式赋值，则编译器会为其进行隐性赋值。Java提供了为类的成员变量赋初值的专门方法。
         */
        System.out.println("小狗的名字是："+ puppyName);

    }



//    eat()是B_objectClass的类的方法
    void eat(){
        System.out.println("访问类中的方法");
    }

    public void setAge(int newage){
        age = newage;
    }

    public int getSize(int newsize){
        size = newsize;
        System.out.println("小狗的年龄："+age);
        return size;
    }



/* 程序都是从main方法开始执行。为了能运行这个程序，必须包含main方法并且创建一个实例对象。 */
    public static void main(String[] args) {
//        6、
//        创建对象：
//        对象是根据类创建的。在Java中，使用关键字 new 来创建一个新的对象。创建对象需要以下三步：
//        声明：声明一个对象，包括对象名称和对象类型。
//        实例化：使用关键字 new 来创建一个对象。
//        初始化：使用 new 创建对象时，会调用构造方法初始化对象

        /* 实例化对象 */
        B_objectClass pn = new B_objectClass("tommy");
        /* 访问类中的变量 */
        System.out.println(pn.breed);
        //    一个类可以包含以下类型变量：
        //    局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
        //    成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
        //    类变量：类变量也声明在类中，方法体之外，但必须声明为 static 类型

        /* 通过方法来设定age */
        pn.setAge(3);
        /* 调用另一个方法获取age */
        pn.getSize(7);
        System.out.println("新的年假访问方法："+pn.age);

        Scanner scan = new Scanner(System.in);
    }

}
