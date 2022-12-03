package cn.ch08;
import java.util.*;
/*
线程的状态与生命周期
关系到操作系统和虚拟机的调度
                  <-  [阻塞状态]   <-
              阻塞解除           致阻塞事件
创建->start()->[就绪状态]->调度->[运行状态]->终止


对线程的基本控制
    线程的启动
        start()
    线程的结束
        设定一个标记变量，以结束相应的循环及方法。
    暂时阻止线程的执行
        try{ Thread.sleep( 1000 );} catch( InterruptedException e ){ }

线程的优先级
    设定线程的优先级
        setPriority( int priority)方法
        MIN_PRIORITY，MAX_PRIORITY，NORM_PRIORITY
 */


public class B_threadControl {
    /*
    线程有两种
    一类是普通线程（非Daemon线程）
        在Java程序中，若还有非Demon线程，则整个程序就不会结束
    一类是Daemon线程（守护线程，后台线程）
        如果普通线程结束了，则后台线程自动终止
        注：垃圾回收线程是后台线程
        使用setDaemon(true);
     */
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setDaemon(true);    // 表示是一个后台线程
        t.start();

        System.out.println("Main--"+new Date());

//        main所在的线程为主线程，主线程结束后，后台线程自动终止
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){}

        System.out.println("Main End");
    }

}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i<10;i++){
            System.out.println(i+"--"+new Date());
            try {
                Thread.sleep(100);  // sleep 会抛出异常，需要try catch
            }catch (InterruptedException e){}
        }
    }
}