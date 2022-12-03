package cainiao;

import java.io.*;

// stream
//Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
public class C5Stream {
    /*
    Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
    一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
     */

    public static void main(String[] args) throws IOException {
//        控制台输入

//        Java 的控制台输入由 System.in 完成。
//        为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
//        下面是创建 BufferedReader 的基本语法：
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1。该方法抛出 IOException。
//        System.out.println((char) br.read());

//        从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
//        System.out.println(br.readLine());



//        控制台输出
//        控制台的输出由 print( ) 和 println() 完成。这些方法都由类 PrintStream 定义，System.out 是该类对象的一个引用。
//        PrintStream 继承了 OutputStream类，并且实现了方法 write()。这样，write() 也可以用来往控制台写操作。
//        注意：write() 方法不经常使用，因为 print() 和 println() 方法用起来更为方便。
//        int cainiao.b;
//        cainiao.b='cainiao.A';
//        System.out.write(cainiao.b);
//        System.out.write('\n');



    }
}
