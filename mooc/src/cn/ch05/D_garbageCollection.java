package cn.ch05;
// 垃圾回收的判断机制
// 手动操作垃圾回收的三种方式

/*
垃圾回收(garbage collection ）
    对象回收是由 Java虚拟机的垃圾回收线程来完成的。
    为什么系统知道对象是否为垃圾
        任何对象都有一个引用计数器，当其值为0时，说明该对象可以回收。
 */

public class D_garbageCollection {
    //举例
    String method(){
        String a,b;
        a = new String("");
        b = new String("");
        System.out.println(a+b+"OK");
        a = null;  // 垃圾回收
        a = b;   // 重新创建并指向新对象
        return a;
    }

//     System.gc()方法
//     它是System类的static方法
//     它可以要求系统进行垃圾回收
//     但它仅仅只是”建议(suggest)”

//    Java中没有“析构方法(destructor)”，但Object的finalize() 有类似功能
//    系统在回收时会自动调用对象的finalize() 方法。
//    protected void finalize() throws Throwable{}
//    子类的finalize()方法
//    可以在子类的finalize()方法释放系统资源
//    一般来说，子类的finalize()方法中应该调用父类的finalize()方法，以保证父类的清理工作能够正常进行。

//    由于finalize()方法的调用时机并不确定，所以一般不用finalize()
//    关闭打开的文件、清除一些非内存资源等工作需要进行处理
//    可以使用try-with-resources语句（JDK1.7以上）
//    对于实现了java.lang.AutoCloseable的对象
//    try( Scanner scanner= new Scanner( … ) ){
//    。。。。。。
//    }
//    会自动调用其close()方法,相当于
//    finally{
//    Scanner.close();
//    }


}
