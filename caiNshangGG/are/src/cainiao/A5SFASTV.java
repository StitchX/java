package cainiao;

// 非访问修饰符
public class A5SFASTV {
    /*
    为了实现一些其他的功能，Java 也提供了许多非访问修饰符。
    static 修饰符，用来修饰类方法和类变量。
    final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
        final 修饰符通常和 static 修饰符一起使用来创建类常量
        父类中的 final 方法可以被子类继承，但是不能被子类重写。
        final 类不能被继承，没有类能够继承 final 类的任何特性。
    abstract 修饰符，用来创建抽象类和抽象方法。
        一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误
        抽象方法不能被声明成 final 和 static。
        任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
        抽象类可以不包含抽象方法
    synchronized 和 volatile 修饰符，主要用于线程的编程。
        synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
        volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
            而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
            一个 volatile 对象引用可能是 null。
    transient 修饰符
        序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
        该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。

     */
    public transient int limit = 55;   // 不会持久化
    public int b; // 持久化

    static int pp = 90;
    A5SFASTV(){
        pp--;
    }
    static void who(){
        System.out.println("nihao"+pp);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new A5SFASTV();
//            System.out.println(pp);
        }
        System.out.println(pp);
    }
}

abstract class A3{
    public abstract void kk();
}

class A4 extends A3{
    public void kk(){

    }
}

abstract class A5 extends A3{
    public void ll() {

    }
}
