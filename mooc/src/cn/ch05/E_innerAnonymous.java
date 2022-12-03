package cn.ch05;

//内部类( inner class )是在其他类中的类
//匿名类( anonymous class)是一种特殊的内部类，它没有类名
/*
1、内部类
2、内部类修饰符和static --待学习5.5.2
3、局部类
4、匿名类
 */

public class E_innerAnonymous {

    public static void main(String[] args) {
        Parcel p = new Parcel();
        Parcel.Contents c = p.new Contents(1);  //类名前要冠以外部类的名字  Parcel.Contents
        Parcel.Destination d = p.new Destination(); //在用new创建内部类实例时，也要在 new前面冠以对象变量。 p.new

        //实例化static类时，在 new前面不需要用对象实例变量
        Parcel.Inner i = new Parcel.Inner();
    }
}
/*
 内部类的定义
         类的定义class xxxx{…}置入一个类的内部即可
            编译器生成xxxx$xxxx这样的class文件
            内部类不能够与外部类同名
         内部类的使用
            在封装它的类的内部使用内部类，与普通类的使用方式相同
         在其他地方使用
            类名前要冠以外部类的名字。
            在用new创建内部类实例时，也要在 new前面冠以对象变量。
            外部对象名.new 内部类名(参数)

 */

class Parcel{  //外部类只能够使用public修饰或者默认
    private int s=111;
    private Contents c;
    private Destination d;



    /*
     内部类与类中的字段、方法一样是外部类的成员，它的前面也可以有访问控制符和其他修饰符。
     访问控制符：public,protected,默认及private。
        注：外部类只能够使用public修饰或者默认
     final,abstract
     */
    public class Contents{  //内部类不能够与外部类同名
        private int i;
        Contents(int i){
            this.i = i;
        }

    }
    class Destination{  //访问控制符：public,protected,默认及private。
        /*
        内部类中可以直接访问外部类的字段及方法
          即使private也可以
        如果内部类中有与外部类同名的字段或方法，则可以用：
          外部类名.this.字段及方法
         */

        private int s=222;
        private String label;
        Destination(){}
        public void mb(int s){
            System.out.println(s);  // 局部变量 s
            System.out.println(this.s); //内部类对象的属性 s 222
            System.out.println(Destination.this.s); ////外层类对象的属性 s 222
        }
    }

    /*
    用static修饰内部类 表明该内部类实际是一种外部类，因为它与外部类的实例无关
        有人认为static的类是嵌套类（nested class），不是内部类inner class
    static类在使用时：
        1、实例化static类时，在 new前面不需要用对象实例变量；
        2、static类中不能访问其外部类的非static的字段及方法，既只能够访问static成员。
        3、static方法中不能访问非static的域及方法，也不能够不带前缀地new 一个非static的内部类。
     */
    static class Inner{
        //static类中不能访问其外部类的非static的字段及方法
    }


    /*
    在一个方法中也可以定义类，这种类称为”方法中的内部类”或者叫局部类（local class）

     */
    /*
    1、同局部变量一样，方法中的内部类
        不能够用 public,private,protected,static修饰，但可以被final或者abstract修饰。
    2、可以访问其外部类的成员
    3、不能够访问该方法的局部变量，除非是final局部变量
     */

    private int size = 5;
    public Object makeTheInner(){
        int a = 1;  // 随方法结束而结束，无法控制存在
        final int FinalLocalVar = 99;  //不能够访问该方法的局部变量，除非是final局部变量
        class Inner{
            public String toString(){
                return (FinalLocalVar+"不知道是啥"+size);  //可以访问其外部类的成员
            }
        }
        return new Inner();
    }

    /*
    匿名类( anonymous class)是一种特殊的内部类
        它没有类名，在定义类的同时就生成该对象的一个实例
        “一次性使用”的类
     */

    /*
    1、不取名字，直接用其父类或接口的名字。
    也就是说，该类是父类的子类，或者实现了一个接口
    编译器生成 xxxxx$1之类的名字
    2、类的定义的同时就创建实例，即类的定义前面有一个new
    new 类名或接口名（）{……}
    不使用关键词class，也不使用extends及implements。
    3、在构造对象时使用父类构造方法
    不能够定义构造方法，因为它没有名字
    如果new对象时，要带参数，则使用父类的构造方法
     */
    public Object makeTheInner2(int localVar){
        int a = 1;
        final int FinalLocalVar = 99;
        return new Object(){  //不取名字，直接用其父类或接口的名字
            public String toString(){
                return (FinalLocalVar+"不知道是啥"+size);
            }
        };
    }

    /*  --没听明白，没使用过
    匿名类的应用
    用到界面的事件处理
    注册一个事件侦听器
    示例 AutoScore.java 中
    //SymAction lSymAction = new SymAction();
    //btnNew.addActionListener(lSymAction);
    btnNew.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
        {
            btnNew_ActionPerformed(event);
        }
    });

    作为方法的参数
    排序，给一个比较大小的接口
    如 SortTest.java
    Arrays.<Book>sort( books, new Comparator<Book>(){
        public int compare(Book b1, Book b2){
            return b1.getPrice()-b2.getPrice();
        }
    });
     */
}