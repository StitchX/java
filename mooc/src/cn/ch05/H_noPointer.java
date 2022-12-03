package cn.ch05;
//引用（reference）实质就是指针（pointer)；但是它是受控的、安全的
// 比如
//  会检查空指引
//  没有指针运算 *(p+5)
//  不能访问没有引用到的内存
//  自动回收垃圾

public class H_noPointer {

    static void swop(int i, int j){
        int t;
        t = i; i = j; j = t;
    }
    public static void main(String[] args) {
//        C 和 JAVA
//        1)传地址
        int s = 1;
        int t = 2;
        swop(s, t);
        System.out.println(s+ " " +t); //一种变通的办法，传出一个有两个分量x,y的对象

//        2）指针运算  数组
//        3）)函数指针  接口、Lambda表达式 例：求积分，线程 、回调函数、事件处理
//        4)指向结点的指针  对象的引用
//        5)使用JNI
//          Java Native Interface(JNI)；   它允许Java代码和其他语言写的代码进行交互



//        简单地说，基本类型是值相等，引用类型是引用相等
//        但有不少的具体情况具体分析：

        /*
        基本类型
数值类型：转换后比较
浮点数，最好不直接用==
Double.NAN==Double.NAN 结果为false
• 请参见JDK的API文档
boolean型无法与int相比较

Integer i = new Integer(10);
• Integer j = new Integer(10);
• System.out.println(i==j); //false，因为对象是两个
• Integer m = 10;
• Integer n = 10;
• System.out.println(m==n); //true，因为对象有缓存
•
• Integer p = 200;
• Integer q = 200;
• System.out.println(p==q); //false，因为对象是两个
注意缓存
If the value p being boxed is true, false, a byte, or a char in the
range \u0000 to \u007f, or an int or short number between -128
and 127 (inclusive), then let r1 and r2 be the results of any two
boxing conversions of p. It is always the case that r1 == r2


枚举类型
内部进行了惟一实例化，所以可以直接判断
• 引用对象
是直接看两个引用是否一样
如果要判断内容是否一样，则要重写equals方法
如果重写equals方法，则最好重写 hashCode()方法


• String对象
判断相等，一定不要用==，要用equals
但是字符串常量（ String literal)及字符串常量会进行内部化（interned），
相同的字符串常量是==的


String hello = "Hello", lo = "lo";
• System.out.println( hello == "Hello"); //true
• System.out.println( Other.hello == hello ); //true
• System.out.println( hello == ("Hel"+"lo") ); //true
• System.out.println( hello == ("Hel"+lo) ); //false
• System.out.println( hello == new String("Hello")); //false
• System.out.println( hello == ("Hel"+lo).intern()); //true


         */


    }
}
