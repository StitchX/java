package cn.ch08;


import java.util.concurrent.atomic.AtomicInteger;

/*
java.util.concurrent包及其子包
    从JDK1.5开始
    提供了一系列的工具，更好、更方便地使用线程
这里介绍几个实用的类
    单变量、集合、Timer、线程池
 */
public class D1_concurrent {
    /*
    原子变量
    线程访问同一个变量需要同步控制，自己写比较麻烦，控制不好
    java.util.concurrent.atomic 包
        AtomicInteger 类
        getAndIncrement（）方法
     */
    static int n=0;
    static AtomicInteger cnt = new AtomicInteger(0);

    public static void main(String[] args) {
        final int NUM = 1000;
//        注意这个 []
        Thread [] threads = new Thread[1000];
        for (int i=0;i<NUM;i++){
            threads[i] = new Thread(){
                public void run(){
                    n++;
                    cnt.getAndIncrement();
                }
            };
        }
        for (int i=0;i<NUM;i++) threads[i].start();
        try{Thread.sleep(3000);}
        catch (InterruptedException ex){}

//        1、print：将信息显示在命令窗口中，输出光标定位在最后一个字符之后。
//        2、printf：将信息进行格式化显示在命令窗口中，输出光标定位在最后一个字符之后。
//        3、println：将信息显示在命令窗口中，输出光标换行定位在下一行开头。
        System.out.printf("%d %b\n", n ,n==NUM);
        System.out.printf("%d %b\n", cnt.get(), cnt.get()==NUM);

    }

    /*
    集合与线程：
    在JDK1.5以前
        ArrayList/HashMap不是线程安全的
        Vector及Hashtable是线程安全的
    产生一个线程安全的集合对象
        Collections.synchronizedArrayList(list)

    并发的集合类：
    java.util.concurrent包中增加了一些方便的类
    CopyOnWriteArrayList、 CopyOnWriteArraySet
        适合于很少写入而读取频繁的对象
    ConcurrentHashMap
        putIfAbsent(), remove(), replace()
    ArrayBlockingQueue
        生产者与消费者，使用put()及take()
     */

//    还有代码


}
