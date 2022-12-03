package com.foundation;
// stream流、File文件、IO

import java.io.*;
//Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
//Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。

public class O_StreamFileIO {

//    一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。

    public static void main(String[] args) throws IOException{
//        从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1。该方法抛出 IOException。

        char c;
//        把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("输入字符，按下 q 键退出");

//        使用 BufferedReader 在控制台读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c!='q');

//        使用 BufferedReader 在控制台读取字符串
        String str;
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
//        JDK 5 后的版本我们也可以使用 Java Scanner 类来获取控制台的输入。


//        控制台的输出由 print( ) 和 println() 完成。这些方法都由类 PrintStream 定义，System.out 是该类对象的一个引用。
//        PrintStream 继承了 OutputStream类，并且实现了方法 write()。这样，write() 也可以用来往控制台写操作。
        char w;
        w='q';
        System.out.write(w);
        System.out.write(1);
//        write() 方法不经常使用，因为 print() 和 println() 方法用起来更为方便。


//        IO
        File f = new File("C://java/hello");

        InputStream in = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

    }
}
