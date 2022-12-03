package cn.ch09;

import java.io.*;

public class A2_readWrite {

    /*
    标准输入和标准输出
    System.in
        System.in 为InputStream类型.
    System.out
        System.out为 PrintStream类型.
    System.err
        System.err为 PrintStream类型.


    从标准输入读取数据
        为了使用方便，经常将System.in用各种处理流进行封装处理，如：
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );
        br.readLine();
    JDK1.5以后增加了java.util.Scanner类
     */

    /*
    常见的内容
    二进制
    文本
    对象
     */
//    二进制流的读写
    public static void dump(InputStream src, OutputStream dest) throws IOException {
        InputStream input = new BufferedInputStream(src);
        OutputStream output = new BufferedOutputStream(dest);
        byte[] data = new byte[1024];
        int length = -1;
        while ((length=input.read(data))!=-1){
            output.write(data,0,length);
        }
        input.close();
        output.close();
    }

    /*
    字符的读写
    常见的编码
        UTF-8, ASCII, GB2312, 默认编码(与操作系统有关)
    使用java.nio.file.Files的readAllLines()方法
        请参考JDK的源码
     */



    /*
    对象的读写
    ObjectInputStream， ObjectOutputStream，
    基本数据的读写
    DataInputStream, DataOutputStream
    序列化（serialize）与反序列化（ deserialize）   // 读出是序列化，写入是反序列化
    要求对象实现 Serializable 接口
    （该接口没有方法，只是一个标记）
     */

    public static void main(String[] args) {
        try {
            dump(new FileInputStream("aaa.bmp"),
                    new FileOutputStream("bbb.bmp"));
        }catch (FileNotFoundException fex){
            fex.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
