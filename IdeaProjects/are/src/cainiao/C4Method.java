package cainiao;

// 方法
public class C4Method {
    private Object object;


//    命令行参数的使用
//    有时候你希望运行一个程序时候再传递给它消息。这要靠传递命令行参数给main()函数实现。
//    java cainiao.C4Method this is a command line

    C4Method(int x){  // 构造方法没有返回值;默认构造方法的访问修饰符和类的访问修饰符相同;定义了自己的构造方法，默认构造方法就会失效
        System.out.println("你好");
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

