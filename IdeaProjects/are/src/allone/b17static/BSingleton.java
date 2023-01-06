package allone.b17static;
/*
单例（Singleton）设计模式；笔试可能手写

1、所谓类的单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例。

2、如何是实现？
    饿汉式 VS 懒汉式

3、区分饿汉式和懒汉式
    饿汉式：坏处，对象加载时间过长。
        好处，饿汉式是线程安全
    懒汉式：好处，延迟对象的创建。
        目前的写法坏处，线程不安全  -- >多线程内容时，再修改
 */

public class BSingleton {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank2==bank1);


        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order2 == order1);
    }


}

// 饿汉式设计模式
class Bank{
//    1、私有化类的构造器
    private  Bank(){

    }

//    2、内部创建类的对象
//    4、要求此对象也必须声明为静态的
    private static Bank instance = new Bank();
//    public static final Bank instance = new Bank();  // 防止恶意修改；Bank.instance = null

//    3、提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}

// 懒汉式设计模式
class Order{

//    1、私有化类的构造器
    private Order(){

    }
//    2、声明当前类对象，没有初始化
//    4、要求此对象也必须声明为静态的
    private static Order instance = null;

//    3、声明public static的返回当前类对象的方法
    public static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}