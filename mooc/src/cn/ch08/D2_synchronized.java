package cn.ch08;
//理解为：流水号，流线式具有一系列的任务

//线程：解决独立的任务，并发运行；每开一个对象创建内存等，开销大
//线程池：执行一些任务，不被消费，之后一些线程使用

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class D2_synchronized {
    public void init(){

    }

    public static void main(String[] args) {

//        ExecutorService pool = Executors.newCachedThreadPool();
//        MyTask mt1 = new MyTask(5);
//        MyTask mt2 = new MyTask(7);
//        MyTask mt3 = new MyTask(8);
//        pool.execute(mt1);
//        pool.execute(mt2);
//        pool.execute(mt3);
//        pool.shutdown();



        Timer timer = new Timer();
        TimerTask task = new MyTask2();
        timer.schedule(task,1000,1000);
    }

}
/*
线程池相关的类
    ExecutorService 接口、ThreadPoolExecutor 类
    Executors 工具类
常见的用法
    ExecutorService pool = Executors.newCachedThreadPool();
    使用其execute( Runnable r)方法
 */
class MyTask implements Runnable{
    int n=10;
    public MyTask(int n){
        this.n =n;
    }
    public void run(){
        for (int i=0; i<n;i++) System.out.println(i);
    }

}
/*
使用Timer
    使用 java.util.Timer 类
重复某件事
    示例：TimerTest.java
使用 javax.swing.Timer 类
    重复执行ActionListener    // 代码底层为线程，重复执行
    示例：TimerSwing.java

 */
class MyTask2 extends TimerTask{
    int n=0;
    public void run(){
        n++;
        System.out.println(new Date());
        System.out.println("----" + n);
    }
}


/*
使用变量注意原子变量；使用集合要用并发集合
特别注意：
在线程中更新图形化界面，要调用
    SwingUtilites.invokeLater
    示例 ThreadDrawJ.java
 */


/*
显式锁
    java.util.concurrent.locks包
    Lock接口、ReentrantLock类
lock() tryLock() unlock()
    例：NoDeadLockDemo.java
ReadWriteLock接口、ReentrantReadWriteLock类
    .writeLock().lock(), .readLock().unlock()
    例：ArrayList2.java


Executor与Future
    执行与任务分开，使用线程池
    Future异步取得结果


异步编程
    Executor执行与任务分开，使用线程池
    Future异步取得结果
    在一定意义上实现异步编程
 */