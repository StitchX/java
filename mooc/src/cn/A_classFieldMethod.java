package cn;
//类、字段、方法的简介

/*
字段field：类的属性，用变量表示；又称域、域变量、属性、成员变量等
方法method：类的功能和操作，用函数表示
 */

public class A_classFieldMethod {

//    字段
    int x;
    String y="cat";
//    构造方法constructor：初始化该类的一个新的对象
//    与类名相同，不写返回数据类型
    public A_classFieldMethod(){
//        没有任何定义下，系统自动生成一个默认构造方法default constructor
        System.out.println("测试");

    }


//    this的三种使用情况
    public A_classFieldMethod(int a,String y){
//        this的第三种使用情况，调用另一个构造方法
//        这条语句必须放在第一句
        this();

//        this的第二种使用情况
//        解决局部变量、域变量、参数变量同名问题
        this.x = a;
        this.y = y;  // this.y表示域变量；y表示参数变量

    }


    void sayThis(){
//        第一种this，下面两个方法的使用是一个意思
        System.out.println(this.y);
        System.out.println(y);
    }


    public static void main(String[] args) {

//    使用对象
//       使用方式的好处：封装性、安全性
        Demo p = new Demo();
        System.out.println(p.b);
        p.sayHello();

    }


}
//    举例使用
class Demo{
    int a;
    String b = "aa";

    public void sayHello(){
        System.out.println("hello");
    }


//    方法的重载  overloading
//    签名不同、参数不同
//    可以实现多态polymorphism
    public void sayHello(String a){
        System.out.println(a+"hello");
    }
}














