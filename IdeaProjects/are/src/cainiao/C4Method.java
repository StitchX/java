package cainiao;

// 方法
public class C4Method {
    private Object object;



//    方法的重载 overload
//    重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
//    最常用的地方就是构造器的重载。
    /*
    重载规则:
        改变参数列表(参数个数或类型不一样)；
        可以改变返回类型；
        可以改变访问修饰符；
        可以声明新的或更广的检查异常；
        方法能够在同一个类中或者在一个子类中被重载。
        无法以返回值类型作为重载函数的区分标准。
     */



//    命令行参数的使用
//    有时候你希望运行一个程序时候再传递给它消息。这要靠传递命令行参数给main()函数实现。
//    java cainiao.C4Method this is a command line

//    构造方法
    /*
    当一个对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。
    通常会使用构造方法给一个类的实例变量赋初值，或者执行其它必要的步骤来创建一个完整的对象。
    不管你是否自定义构造方法，所有的类都有构造方法，因为 Java 自动提供了一个默认构造方法，
        默认构造方法的访问修饰符和类的访问修饰符相同(类为 public，构造函数也为 public；类改为 protected，构造函数也改为 protected)。
    一旦你定义了自己的构造方法，默认构造方法就会失效。
     */
    C4Method(int x){  // 构造方法没有返回值;默认构造方法的访问修饰符和类的访问修饰符相同;定义了自己的构造方法，默认构造方法就会失效
        System.out.println("你好");
    }

//    可变参数
//    JDK 1.5 开始，Java支持传递同类型的可变参数给一个方法

//    一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。

    public void kebian(double... ff){
        for (int i=0;i<ff.length;i++){
            System.out.println(ff[i]);
        }
    }


//    finalize() 方法
    /*
    Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。
    例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。
    在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。
     */

//    finalize() 一般格式是：
//    protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。
//    Java 的内存回收可以由 JVM 来自动完成。如果你手动使用，则可以使用上面的方法
    protected void finalize() throws java.lang.Throwable{
        System.out.println("disposed");
    }

}


// 复原 System.out.println
class Sys{

    static Ou ou;
}

class Ou{
    static void pl(){
        System.out.println("qwe");
    }
}



class New{
    /*
    可变参数的形参:Java 5 新特性
    使用：sql多条件查询
     */

//    两种使用方法
//    new New().demo01(new String[]{"1"})  // 兼容旧版本
//    new New().demo01("11")

    void demo01(String...aa){
        System.out.println("String...aa");
    }

//    void demo01(String[] bb){  // 就版本的可变参数的形参
//        System.out.println("不构成重载，因为之前版本的可变参数传递就是这样的");
//    }

    void demo01(String aa){
        System.out.println("构成重载");
    }

    void demo02(int a,double...b){
        System.out.println("可变参数的形参必须声明在末尾");
    }
}