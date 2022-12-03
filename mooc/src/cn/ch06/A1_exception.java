package cn.ch06;
// 6.1 异常处理
// 6.2 自定义异常
// 6.3 断言及程序的测试
// 6.4 程序的调试

//异常（exception ) 又称为例外、差错、违例
// 对应着Java运行错误处理机制

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1_exception {

    /*
    在一些传统的语言（如C语言中）
    if语句来判断是否出现了例外
    全程变量ErrNo
    但这有几个缺点
        正常处理与异常处理的代码同样处理
            可读性（readability）差
        每次调用一个方法时都进行错误检查
            可维护性（ maintainability ）差
        错误由谁处理不请
            职责不清

    Java中处理异常
        抛出(throw)异常
        运行时系统在调用栈中查找
            从生成异常的方法开始进行回溯，直到找到：
        捕获(catch) 异常的代码

     */

    // 抛出异常    throw 异常对象；
    public static void main(String[] args) {
        try {   //捕获异常
            BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一个值：");
            String s = in.readLine();
            int i = Integer.parseInt(s);

        }catch (IOException ex){
            ex.printStackTrace();
        }catch (NumberFormatException ex){  //数值格式异常
            ex.printStackTrace();
        }finally {
            System.out.println("无论是否有异常都执行,即使其中有break,return等语句，可以不写该语句");
        }

        foo(1);
    }

    /*
    Throwable  可抛出的
        Error: JVM的错误
            AWTError,LinkageError,virtualMachineError
        Exception： 异常
            RunTimeException
                ArithmeticException
                IndexOutOfBoundsException
            IOException
                FileNotFoundException
                EOFException
            一般所说的异常
            是指Exception及其子类
     */

    /*
     Exception类
     构造方法
         public Exception()；
         public Exception(String message)；
         Exception(String message, Throwable cause) ;
     方法
         getMessage()
         getCause()
         printStackTrace()

     多异常的处理
        子类异常要排在父类异常的前面
     finally语句
        无论是否有异常都要执行
        即使其中有break,return等语句
        在编译时，finally部分代码生成了多遍
     */

    public static void foo(int i){
        int output = 0;
        try {
            if(i == 1){
                throw new Exception("cuocyo");
            }
            output +=1;
        }catch (Exception e){

            output +=2;
            return;
        }finally {
            output+=3;
        }
        output+=4;
        System.out.println(output);
    }
}
