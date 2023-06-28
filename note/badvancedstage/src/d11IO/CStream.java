package d11IO;

import org.junit.Test;

import java.io.*;

/**
 * @author Eva   Email:
 * @Description
 *  一、流的分类:
 * 1.操作数据单位:字节流、字符流
 * 2.效据的流向:输入流、输出流
 * 3.流的角色:节点流、处理流
 *  二、流的体系结构
 *  抽象基类                   节点流(或文件流)              缓冲流(处理流的一种)
 *  InputStream              FileInputStream            BufferedInputStream
 *  OutputStreamReader       FileOutputstream           BufferedOutputstream
 *  Reader                    FiLeReader                  BufferedReader
 *  Writer                    Filewriter                   Bufferedwriten
 * @data 2023/6/27 15:54
 */
public class CStream {
//    public static void main(String[] args) {
//        File file1 = new File("hello.txt"); // 相较于当前工程
//        System.out.println(file1.getAbsoluteFile());
//
//
//        File file2 = new File("d11IO\\hello.txt");
//        System.out.println(file2.getAbsoluteFile());
//    }

    /*
    将day09下的heLLo.txt文件内容读入程序中，并输出到控制台
     */
    @Test
    public void testFileReader() throws IOException {
//        1. 实例化FiLe类的对象，指明要操作的文件
        File file  = new File("hello.txt"); // 相较于当前module

//        2. 提供具体的流
        FileReader fr =new FileReader(file);

//        3. 数据的读入
//        read()：返回读入的一个字符。如果达到文件末尾，返回-1
        int data = fr.read();
        while (data != -1){
            System.out.println((char) data);
        }

//        System.out.println(file.getAbsoluteFile());
    }
}
