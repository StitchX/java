package cainiao;// 文件的读取和写入
import java.io.*;

public class C6File {
    public static void main(String[] args) {


//        两个重要的流是 FileInputStream 和 FileOutputStream。

//        FileInputStream
//        该流用于从文件读取数据，它的对象可以用关键字 new 来创建。

//        InputStream is1 = new FileInputStream("C:\\Users\\QMacroQA\\Desktop\\aa.txt");
//
        File f1 = new File("C:\\Users\\QMacroQA\\Desktop\\aa.txt");
//        InputStream is2 = new FileInputStream(f1);

//        FileOutputStream
//        该类用来创建一个文件并向文件中写数据。
//        如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。
        try {
            OutputStream os1 = new FileOutputStream("C:\\Users\\QMacroQA\\Desktop\\aa.txt");
            OutputStream os2 = new FileOutputStream(f1);
            OutputStreamWriter osw = new OutputStreamWriter(os2,"UTF-8");

            os1.write(1);
            os1.close();
            osw.append("123");
            osw.close();  // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
            os2.close();  // 关闭输出流,释放系统资源
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}
