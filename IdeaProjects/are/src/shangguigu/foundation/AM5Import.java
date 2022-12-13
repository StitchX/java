package shangguigu.foundation;

import java.util.Scanner;  // 1、2

import static java.lang.Math.random;
import static java.lang.System.out; // 5、9
import java.lang.System.*;
/*
1、在源文件中显示的使用import结构导入指定包下的类、接口
2、声明在包的声明和类的声明之间
3、如果需要导入多个结构，则并列写出即可
4、可以使用”XXX.*“的方式，表示可以导入XXX包下的所有结构
5、如果使用的类或接口是java.lang包下定义的，则可以省略import结构
6、如果使用的类或接口是本包下定义的，可以省略import结构
7、如果在源文件中，使用了不同包下的同名的类，则必须至少有一个类需要以全类名的方式显示。
8、使用”XXX.*“的方式表明可以调用XXX包下的所有结构。但是如果使用的是XXX子包下的结构，则仍需要显示
9、import static：导入指定类或接口中的静态结构：属性或方法
 */

public class AM5Import {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.println();

        cainiao.A1Introduce a1 = new cainiao.A1Introduce(); // 7

        ProjectFour p4 = new ProjectFour(); // 6

        random();


    }
}
