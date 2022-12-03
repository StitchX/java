package cainiao;

// 方法
public class C4Method {
    private Object object;
    /*
    什么是方法？
    Java方法是语句的集合，它们在一起执行一个功能。
        方法是解决一类问题的步骤的有序组合
        方法包含于类或对象中
        方法在程序中被创建，在其他地方被引用

    优点：
        1. 使程序变得更简短而清晰。
        2. 有利于程序维护。
        3. 可以提高程序开发的效率。
        4. 提高了代码的重用性。

    命名规则：
        名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。
        下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件

    方法的定义：
        修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
        返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。
                    在这种情况下，returnValueType 是关键字void。
        方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
        参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。
                参数是可选的，方法可以不包含任何参数。
        方法体：方法体包含具体的语句，定义该方法的功能

     */

//    main 方法是被 JVM 调用的，除此之外，main 方法和其它方法没什么区别
    public static void main(String[] args) {
//        println() 是一个方法。   System 是系统类。   out 是标准输出对象。
//        这句话的用法是调用系统类 System 中的标准输出对象 out 中的方法 println()。
        System.out.println("hello world");
        Sys.ou.pl();

        C4Method c4 = new C4Method(1);
        c4.kebian(1.3,4.2);

//        垃圾回收机制
        c4 = null;
        System.gc();

    }


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