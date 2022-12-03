package com.foundation;

/*
System.out.println():println() 是一个方法；System 是系统类；out 是标准输出对象。

什么是方法呢？
Java方法是语句的集合，它们在一起执行一个功能。
    方法是解决一类问题的步骤的有序组合
    方法包含于类或对象中
    方法在程序中被创建，在其他地方被引用

命名规则
    1.方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。例如：addPerson。
    2.下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，
                                                            例如 testPop_emptyStack。


修饰符 返回值类型 方法名(参数类型 参数名){
    ...
    方法体
    ...
    return 返回值;
}
修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
返回值类型 ：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。
            在这种情况下，returnValueType 是关键字void。
方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。
        参数是可选的，方法可以不包含任何参数。
方法体：方法体包含具体的语句，定义该方法的功能。
 */

public class N_Method {
//    构造方法
//    对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。
//    所有的类都有构造方法，因为 Java 自动提供了一个默认构造方法，默认构造方法的访问修饰符和类的访问修饰符相同
    public N_Method(){
//        这个是默认的构造方法，未设置时不显示
    }



    //    1、下面程序包含 main 方法和 max 方法
//    2、main 方法是被 JVM 调用的
    public static int sum(int i,int j){
        return i+j;
    }
    public static void main(String[] args) {

        System.out.println(sum(8,9));
        System.out.println(sum(2.1,3.5));
        for (int i=0;i<args.length;i++){
            System.out.println("args["+i+"]="+args[i]);  //命令行参数的使用
        }

//    构造方法的使用
        Demo demo = new Demo(10);

//        可变参数
        printMax(78,1,2,3,5,5,3,2,1,5,65);

    }


//    方法的重载
//    创建另一个有相同名字但参数不同的方法
//    一个类的两个方法拥有相同的名字，但是有不同的参数列表
//    Java编译器根据方法签名判断哪个方法应该被调用
//    重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。
//    重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。

    public static double sum(double i, double j){
        return i+j;
    }

//    命令行参数的使用
//    $ javac CommandLine.java
//    $ java CommandLine this is a command line 200 -100


//    可变参数
//    JDK 1.5 开始，Java支持传递同类型的可变参数给一个方法
//    一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
    public static void printMax(int x,double... y){
        System.out.println(x+"：该参数只是为了举例，可变参数唯一且靠后");

        if(y.length==0){
            System.out.println("未输入可变参数数据");
            return;
        }
        double result = y[0];
        for (int j=0; j<y.length;j++){
            if (result<y[j]){
                result = y[j];
            }
        }
        System.out.println("输入的最大值是："+result);
    }

//    finalize()方法
//在对象被垃圾收集器析构(回收)之前调用，用来清除回收对象。
/*
public class FinalizationDemo {
  public static void main(String[] args) {
    Cake c1 = new Cake(1);
    Cake c2 = new Cake(2);
    Cake c3 = new Cake(3);

    c2 = c3 = null;
    System.gc(); //调用Java垃圾收集器
  }
}

class Cake extends Object {
  private int id;
  public Cake(int id) {
    this.id = id;
    System.out.println("Cake Object " + id + "is created");
  }

  protected void finalize() throws java.lang.Throwable {
    super.finalize();
    System.out.println("Cake Object " + id + "is disposed");
  }
}
 */

}


//    构造方法举例
//https://blog.csdn.net/qq_33740600/article/details/53165844
//java: 无法从静态上下文中引用非静态 变量 this
class Demo{
    int x;
    Demo(int i){
        x=i;
    }

}
