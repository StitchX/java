package cainiao;

import java.io.File;

// 目录的操作
public class C7IO {
    /*
    文件和I/O
    还有一些关于文件和I/O的类，我们也需要知道：
        File Class(类)
        FileReader Class(类)
        FileWriter Class(类)
     */

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\QMacroQA\\Desktop\\tmp");
//        创建目录
//        f1.mkdirs();

//        读取目录
//        if (f1.isDirectory()){
//            System.out.println("C:\\Users\\QMacroQA\\Desktop\\tmp"+"\\"+(String) f1.list()[0]);
//        }else {
//            System.out.println("啥也不是");
//        }

//        删除目录
        File f2 = new File("C:\\Users\\QMacroQA\\Desktop\\tmp"+"\\"+(String) f1.list()[0]);
        f2.delete();

    }
}
