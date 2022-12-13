package cainiao;

//数据类型-学习
public class A2DataClass {
    /*
    变量就是申请内存来存储值：内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据

    Java 的两大数据类型:
        内置数据类型：八种 数值型（整数类型（1，2，4，8 二进制补码表示），浮点类型（4，8表示的字节比long还长，由多部分组成））
                            字符型char 布尔型boolean
        引用数据类型：类class（字符串，类 类型）、数组(array)、接口interface
            对象、数组；所有引用类型的默认值都是null；一个引用变量可以用来引用任何与之兼容的类型。

    常量：final(虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量)

    类型转换：
    数据类型转换必须满足如下规则：
        1. 不能对boolean类型进行类型转换。
        2. 不能把对象类型转换成不相关类的对象。
        3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
        4. 转换过程中可能导致溢出或损失精度

        自动类型转换：必须满足转换前的数据类型的位数要低于转换后的数据类型
        强制类型转换：条件是转换的数据类型必须是兼容的。
        隐含强制类型转换
            1、 整数的默认类型是 int。
            2、 小数默认是 double 类型浮点型，在定义 float 类型时必须在数字后面跟上 F 或者 f。

     */



//    访问修饰符 关键字 返回类型 方法名 String类 字符串数组
    public static void main(String[] args) {
        int a;
        char bb;  //一个单一的 16 位 Unicode 字符;
        float cc = 2.0f;
        final double PI = 3.1415927;
        bb='a';
        System.out.println(bb);


//        自动类型转换
//        byte,short,char—> int —> long—> float —> double
        char a1 = 'a';
        int b1 = a1;
//        System.out.println(a1+9); //106
        System.out.println(b1);  // 97

        short b2 = 2;
        System.out.println(b2+a1);  // byte,short,char类型运行，结果为int类型
        System.out.println('-');

        long ll = 123432L; // 不写l 默认为int类型
//        float ff1 = 123.3;  报错


//        强制类型转换
        int c1 = 65;
//        char d1 = c1;   // 报错
        char d1 = (char) c1;
        System.out.println(d1);   // cainiao.A
        int ff=99999;
        short gg = (short) ff;
        System.out.println(gg);  // -31073

    }
}
