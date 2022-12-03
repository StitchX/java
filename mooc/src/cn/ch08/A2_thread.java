package cn.ch08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A2_thread {

    public static void main(String[] args) {
        Counter c1=new Counter(1);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c1);
        Counter c2=new Counter(2);
        Thread t4 = new Thread(c2);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c2);
        TimeDisplay timer = new TimeDisplay();
        Thread t7 = new Thread(timer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }

}

//使用多线程并同时启动
class Counter implements Runnable{
    int id;
    Counter(int id){
        this.id = id;
    }

    @Override
    public void run() {
        int i=0;
        while (i++<=10){
            System.out.println("ID: "+id+" NO. "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        }

    }
}

class TimeDisplay implements Runnable{

    public void run(){
        int i=0;
        while (i++<=3){
            System.out.println(new SimpleDateFormat().format(new Date()));
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        }

    }
}