package com.foundation;
//Java语言提供了很多修饰符，主要分为以下两类：
//        访问修饰符
//        非访问修饰符

public class E_Qualifier {
    /*
    访问控制修饰符
        Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。
        default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
        private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
        public : 对所有类可见。使用对象：类、接口、变量、方法
        protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
     访问控制和继承
        请注意以下方法继承的规则：
            父类中声明为 public 的方法在子类中也必须为 public。
            父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
            父类中声明为 private 的方法，不能够被子类继承。
     */


//    接口里的变量都隐式声明为 public static final,
    String version = "2.0.1";
//    接口里的方法默认情况下访问权限为 public
    boolean a(){
        return true;
    }

//    private
    private int a1;
//    声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。
//    Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。
    public int getA1(){
        return 1; //返回 a1的值
    }
    public void setA1(int a){
        this.a1 = a;  ////设置 a1的值
    }
    private int a11(){
        return 1;
    }


//    protected
//    基类的 protected 成员是包内可见的，并且对子类可见；
//    若子类与基类不在同一包中，那么在子类中，子类实例可以访问其从基类继承而来的protected方法，而不能访问基类实例的protected方法。
    /*
    访问控制和继承
        请注意以下方法继承的规则：
        父类中声明为 public 的方法在子类中也必须为 public。
        父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
        父类中声明为 private 的方法，不能够被子类继承。
     */




    /*
    非访问修饰符
        为了实现一些其他的功能，Java 也提供了许多非访问修饰符。
        static 修饰符，用来修饰类方法和类变量。
        final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
        abstract 修饰符，用来创建抽象类和抽象方法。
        synchronized 和 volatile 修饰符，主要用于线程的编程。
     */

//    静态变量：
//    static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。
//              静态变量也被称为类变量。局部变量不能被声明为 static 变量。
//    静态方法：
//    static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。

    private static int numIns=0;

    public static void addIns(){
        numIns++;
    }

//    final 变量：
//        final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
//        final 修饰符通常和 static 修饰符一起使用来创建类常量。
//        父类中的 final 方法可以被子类继承，但是不能被子类重写。
//        final 类不能被继承，没有类能够继承 final 类的任何特性。
    public static final int BOX =6;
    public final class Test{
    }

//    abstract 修饰符
//    抽象类：
//    抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。
//    一个类不能同时被 abstract 和 final 修饰。
//    抽象方法:
//    抽象方法是一种没有任何实现的方法，该方法的具体实现由子类提供。
//    抽象方法不能被声明成 final 和 static。
//    任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
//    如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。
//    抽象方法的声明以分号结尾，例如：public abstract sample();。

    public abstract class Car{  //抽象类
        public abstract void goF();  //抽象方法
    }

    class Cars extends Car{
        @Override
        public void goF() {  //实现抽象方法

        }
    }
//    synchronized 修饰符
//    synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
    public synchronized void sD(){

    }
//    transient 修饰符
//    序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
//    该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。
    public transient int limit = 55;  //不会持久化
    public int b; //持久化

//    volatile 修饰符
//    volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
//              而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
//    一个 volatile 对象引用可能是 null。

//    public class MyRunnable implements Runnable
//    {
//        private volatile boolean active;
//        public void run()
//        {
//            active = true;
//            while (active) // 第一行
//            {
//                // 代码
//            }
//        }
//        public void stop()
//        {
//            active = false; // 第二行
//        }
//    }

//    在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。
//      如果 第一行 中缓冲区的 active 值被使用，那么在 第二行 的 active 值为 false 时循环不会停止。
//    但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。

    public static void main(String[] args) {
        System.out.println("Java修饰符");
    }
}
