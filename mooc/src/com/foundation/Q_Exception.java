package com.foundation;
/*
异常发生的原因有很多，通常包含以下几大类：
    用户输入了非法数据。
    要打开的文件不存在。
    网络通信时连接中断，或者JVM内存溢出。
这些异常有的是因为用户错误引起，有的是程序错误引起的，还有其它一些是因为物理错误引起的。

要理解Java异常处理是如何工作的，你需要掌握以下三种类型的异常：
    检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，
                一个异常就发生了，这些异常在编译时不能被简单地忽略。
    运行时异常： 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
    错误： 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。

 */

import javax.naming.InsufficientResourcesException;
import java.io.*;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Q_Exception {
    public static void main(String[] args) {
        /*
        所有的异常类是从 java.lang.Exception 类继承的子类。
        Throwable -> Exception/Error       Exception、Error 类是 Throwable 类的子类。
        Exception ->IOException/RuntimeException   Error->OutOfMemoryError,IOError
        IOException ->FileNotFoundException   RuntimeException->NullPointerException

        Java 程序通常不捕获错误。错误一般发生在严重故障时，它们在Java程序处理的范畴之外。
        Error 用来指示运行时环境发生的错误。
        例如，JVM 内存溢出。一般地，程序不会从错误中恢复。
         */

//        多重捕获块
//        一个 try 代码块后面跟随多个 catch 代码块的情况就叫多重捕获。

//    finally 关键字用来创建在 try 代码块后面执行的代码块。
//    无论是否发生异常，finally 代码块中的代码总会被执行。
//    在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。
        try {
            int[] a = new int[2];
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e1){
            System.out.println(e1);
        }finally {
            System.out.println("都会执行");
        }
        System.out.println("out of block");
    }




//    如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。
//    一个方法可以声明抛出多个异常，多个异常之间用逗号隔开。
    public void withdraw() throws RemoteException, InsufficientResourcesException{
        // Method implementation
    }
    //Remainder of class definition


//    try-with-resources
    public void suger(){
//        JDK7 之后，Java 新增的 try-with-resource 语法糖来打开资源，并且可以在语句执行完毕后确保每个资源都被自动关闭 。
//        JDK7 之前所有被打开的系统资源，比如流、文件或者 Socket 连接等，都需要被开发者手动关闭，否则会造成资源泄露将。
        String line1;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((line1 = br.readLine()) != null) {
                System.out.println("Line =>"+line1);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }


//        对比之前的语法：
        BufferedReader br = null;
        String line2;

        try {
            System.out.println("Entering try block");
            br = new BufferedReader(new FileReader("test.txt"));
            while ((line2 = br.readLine()) != null) {
                System.out.println("Line =>"+line2);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        } finally {
            System.out.println("Entering finally block");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IOException in finally block =>"+e.getMessage());
            }
        }


//        try-with-resources 处理多个资源，使用分号 ; 分隔各个资源
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//声明自定义异常
// 自定义异常。编写自己的异常类时需要记住下面的几点。
//  所有异常都必须是 Throwable 的子类。
//  如果希望写一个检查性异常类，则需要继承 Exception 类。
//  如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。

class MyException extends Exception{

}

//通用异常
//在Java中定义了两种类型的异常和错误。
//JVM(Java虚拟机) 异常：由 JVM 抛出的异常或错误。
//  例如：NullPointerException 类，ArrayIndexOutOfBoundsException 类，ClassCastException 类。
//程序级异常：由程序或者API程序抛出的异常。
//  例如 IllegalArgumentException 类，IllegalStateException 类。
