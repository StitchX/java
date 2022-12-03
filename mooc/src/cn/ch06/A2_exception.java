package cn.ch06;
//受检的异常checked Exception：Java处理异常有更严格测要求，必须处理
//Exception分两种
//       RuntimeException及其子类，可以不明确处理（边界异常数字下标超界，解析整数时数字格式错误等）
//       否则，称为受检的异常（checked Exception)，如IO

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class A2_exception {
    /*
    受检的异常，要求明确进行语法处理
        要么捕（catch）
        要么抛（throws）：在方法的签名后面用throws xxxx来声明
         在子类中，如果要覆盖父类的一个方法，若父类中的方法声明了throws异常，则子类的方法也可以throws异常
         可以抛出子类异常（override）（更具体的异常），但不能抛出更一般的异常
     */

    public static void readFile() throws IOException{  // 没有catch 则写 throws
        FileInputStream in = new FileInputStream("myFile.txt");
        int b;
        b= in.read();
        while (b!=-1){
            System.out.println((char)b);
            b = in.read();
        }
        in.close();
    }

    /*
    try(类型 变量名 = new 类型（） ）{}  // Complier sugar
    自动添加了finally{ 变量.close(); }
    不论是否出现异常，都会执行
     */
    static String ReadOnline2(String path) throws IOException{  //仅处理了close，其他未处理，throws
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
//        对比  -- 代码错误，未看到所有代码
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            return br.readLine();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if (br!=null){
//                try {
//                    br.close;
//                }catch (IOException){
//
//                }
//
//            }
//        }
//        return null;

    }

    public static void main(String[] args) {
        try {  // 使用捕获异常，1、必须实现前面的异常，2、catch和throw选择一个
            System.out.println("");
            readFile();
        }catch (IOException e){
            System.out.println(e);
        }
    }


}
