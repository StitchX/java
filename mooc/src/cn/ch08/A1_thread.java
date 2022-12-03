package cn.ch08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class A1_thread {
    /*
    进程：一个程序的执行
    线程：程序中单个顺序的流控制称为线程
        一个进程中可以含有多个线程
    在操作系统中可以查看线程数
        如：在Windows中，在任务管理器，右键，选择列，选中“线程数”

    一个进程中的多个线程
        分享CPU（并发的或以时间片的方式）   // cpu分成时间片，操作系统调度
        共享内存（如多个线程访问同一对象
     */

    /*
    Java从语言级别支持多线程
        如：Object中wait(), notify()   // Java设计初考虑了线程，所以使用较简单
    java.lang中的类 Thread
     */

    /*
    线程体---- run()方法来实现的。
    线程启动后，系统就自动调用run()方法。
    通常，run()方法执行一个时间较长的操作
        如一个循环
        显示一系列图片
        下载一个文件

     */
    /*
    创建线程的两种方法：
    1．通过继承Thread类创建线程
        class MyThread extends Thread {
            public void run() {
                for(int i=0;i<100;i++) {
                    System.out.print (" " + i);
                }
            }
    2．通过向Thread()构造方法传递Runnable对象来创建线程
        class MyTask implements Runnable {
            public void run() { …}
        }
        Thread thread = new Thread(mytask);
        thread.start();

    可用匿名类来实现Runnable
        new Thread(){
            public void run() {
                for(int i=0; i<10; i++)
                System.out.println(i);
            }
        }.start();
     或者用Lambda表达式（Java8以上）
     new Thread( ()-> {。。。} ).start();
     */

//    线程-下载图片
    public static void main(String[] args) throws IOException {
        final URL[] url = {
                new URL("http://www.pku.edu.cn"),
                new URL("http://www.baidu.com"),
                new URL("http://www.sina.com.cn"),
                new URL("http://www.dstang.com")
        };
        final String[] files = {
                "pku.htm",
                "baidu.htm",
                "sina.htm",
                "study.htm",
        };
        for (int i=0;i<url.length;i++){
            final  int idx = i;
            new Thread(()->{
                try {
                    System.out.println(url[idx]);
                    download(url[idx],files[idx]);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }

    }

    static void download(URL url, String file) throws IOException{
        try (InputStream input = url.openStream();
            OutputStream output = new FileOutputStream(file))
        {
            byte[] data =new byte[1024];
            int length;
            while ((length=input.read(data))!=-1){
                output.write(data,0,length);
            }
        }
    }


}
