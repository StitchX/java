package cainiao;

//多态就是同一个接口，使用不同的实例而执行不同操作
public class D3Polymorphism {
    /*
    多态的优点
        1. 消除类型之间的耦合关系
        2. 可替换性
        3. 可扩充性
        4. 接口性
        5. 灵活性
        6. 简化性
    多态存在的三个必要条件
        继承
        重写
        父类引用指向子类对象：Parent p = new Child();
     */

    /*
    虚函数
    虚函数的存在是为了多态。
    Java 中其实没有虚函数的概念，它的普通函数就相当于 C++ 的虚函数，动态绑定是Java的默认行为。
        如果 Java 中不希望某个函数具有虚函数特性，可以加上 final 关键字变成非虚函数。
     */

    public static void main(String[] args) {
        A2 a2 = new B2();   // 调用子类方法
        A2 b2 = new B2();   // 调用子类方法
        a2.aa1();
        b2.aa1();

    }
}

class A2{
    void aa1(){
        System.out.println("1");
    }
}
class B2 extends A2{
    void aa1(){
        System.out.println("2");
    }
}

/*
多态的实现方式
    方式一：重写：
    方式二：接口
    方式三：抽象类和抽象方法
 */