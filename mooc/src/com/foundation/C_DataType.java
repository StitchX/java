package com.foundation;
//Java 的两大数据类型:
//        内置数据类型
//        引用数据类型
//内置数据类型：Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

/*
    引用类型:
    在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定的类型，
                比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
    对象、数组都是引用数据类型。
    所有引用类型的默认值都是null。
    一个引用变量可以用来引用任何与之兼容的类型。
    例子：Site site = new Site("Runoob")。
     */

public class C_DataType {
    /*
    byte:8位、最小值是 -128（-2^7）、最大值是 127（2^7-1）、默认值是 0；节约空间，主要代替整数
    short:16 位、最小值是32768（-2^15）、最大值是 32767（2^15 - 1）、默认值是 0，Short 数据类型也可以像 byte 那样节省空间
    int:32位、最小值是 -2,147,483,648（-2^31）、最大值是 2,147,483,647（2^31 - 1）、默认值是 0
    long: 64 位、最小值是 -9,223,372,036,854,775,808（-2^63）、最大值是 9,223,372,036,854,775,807（2^63 -1）、默认值是 0L
          "L"理论上不分大小写

    float:单精度、32位、默认值是 0.0f，符合IEEE 754标准的浮点数、不能用来表示精确的值，存大型浮点数组的时候可节省内存空间
    double:双精度、64 位、符合 IEEE 754 标准的浮点数、默认值是 0.0d、不能用来表示精确的值
           Float和Double的最小值和最大值都是以科学记数法的形式输出的，结尾的"E+数字"表示E之前的数字要乘以10的多少次方。
           比如3.14E3就是3.14 × 103 =3140，3.14E-3 就是 3.14 x 10-3 =0.00314。

    boolean:true、false
    shar:单一的 16 位 Unicode 字符、最小值是 \u0000（十进制等效值为 0）、最大值是 \uffff（即为 65535）

    JAVA中还存在另外一种基本类型 void，它也有对应的包装类 java.lang.Void，不过我们无法直接对它们进行操作。
    String (or any object):默认为null
     */
    static String str;
    static char ch;
    public static void main(String[] args) {

        System.out.println(Byte.SIZE);
//        包装类：java.lang.Byte
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(str);
        System.out.println(ch); // 显示为空



    /*
    Java 常量
    常量在程序运行时是不能被修改的。
    在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：final double PI = 3.1415927;
    常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量
    byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。前缀 0 表示 8 进制，而前缀 0x 代表 16 进制。
    Java的字符串常量也是包含在两个引号之间的字符序列。 "\"This is in quotes\""
    字符串常量和字符变量都可以包含任何 Unicode 字符。
     */
        final double PI = 3.1415926;
        int octal = 0144;
        char a = '\u0001';


    /*
    一些专业字符：
    \n：换行 (0x0a)；\r：回车 (0x0d)；\f：换页符(0x0c)；\b：退格 (0x08);
    \0:空字符 (0x0);\s:空格 (0x20);\t：制表符；\"：双引号；\'：单引号；
    \\：反斜杠；\ddd：八进制字符 (ddd)；\ u xxxx：16进制Unicode字符 (xxxx)
     */

    /*
    自动类型转换:
    byte,short,char—> int —> long—> float —> double
    1. 不能对boolean类型进行类型转换。
    2. 不能把对象类型转换成不相关类的对象。
    3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
    4. 转换过程中可能导致溢出或损失精度
    int i =128;
    byte b = (byte)i;   //因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。
    5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入
     */
        int i =128;
        byte b = (byte)i;
        System.out.println(b);
//        boolean eq = (int)23.7 == 23;
//        boolean eq2 =(int)-45.89f == -45;

        char ch = 'A'; //必须使用单引号
//        自动类型转换
        int i2 = 12+ch;
//        强制类型转换
        int i3 = (int)ch;
        System.out.println(i3);
        System.out.println(i2);

//        隐含强制类型转换
//        1、 整数的默认类型是 int。
//        2. 小数默认是 double 类型浮点型，在定义 float 类型时必须在数字后面跟上 F 或者 f。
    }

}
