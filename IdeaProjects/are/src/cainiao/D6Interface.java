package cainiao;// 接口
//JAVA编程语言中是一个抽象类型，是抽象方法的集合

//接口的声明语法格式如下：
/*
[可见度] interface 接口名称 [extends 其他的接口名] {
        // 声明变量
        // 抽象方法
}
 */
//一个接口能继承另一个接口
interface Bb extends Aa{

}


interface Aa{
    /*
    接口并不是类，编写接口的方式和类很相似，但是它们属于不同的概念。类描述对象的属性和方法。接口则包含类要实现的方法。
    接口与类的区别：
        接口不能用于实例化对象。
        接口没有构造方法。
        接口中所有的方法必须是抽象方法，Java 8 之后 接口中可以使用 default 关键字修饰的非抽象方法。
        接口不能包含成员变量，除了 static 和 final 变量。
        接口不是被类继承了，而是要被类实现。
        接口支持多继承。


    接口特性：
        1. 方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
        2. 可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）
        3. 方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法
     */
    public static final int A1 = 99;

//    只能是 public abstract，其他修饰符都会报错
//    不能在接口中实现的，只能由实现接口的类来实现接口中的方法
    abstract void aa1();
    abstract int bb1();

//    JDK 1.8 以后，接口允许包含具体实现的方法，该方法称为"默认方法"，默认方法使用 default 关键字修饰。
    default boolean cc1(){
        System.out.println("hello world");
        return false;
    }

    //    JDK 1.9 以后，允许将方法定义为 private，使得某些复用的代码不会把方法暴露出去。
//    JDK 1.8 以后，接口里可以有静态方法和方法体了。
    public static boolean dd1() {
        return false;
    }
}

/*
抽象类和接口的区别
    1. 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。
    2. 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。
    3. 接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。
    4. 一个类只能继承一个抽象类，而一个类却可以实现多个接口。
 */



// 一个类通过继承接口的方式，从而来继承接口的抽象方法。
//当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类
//接口的多继承:接口的多继承中extends关键字只需要使用一次，在其后跟着继承接口
public class D6Interface implements Aa,Bb{
    @Override
    public void aa1() {

    }
    /*
    重写接口中声明的方法时，需要注意以下规则：
        类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。
        类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型。
        如果实现接口的类是抽象类，那么就没必要实现该接口的方法。
     */

    @Override
    public int bb1() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(A1);
        D6Interface d6 = new D6Interface();
        System.out.println(d6.cc1());
    }
}


//标记接口：最常用的继承接口是没有包含任何方法的接口
/*
标记接口主要用于以下两种目的：
    建立一个公共的父接口：
        正如EventListener接口，这是由几十个其他接口扩展的Java API，你可以使用一个标记接口来建立一组接口的父接口。
        例如：当一个接口继承了EventListener接口，Java虚拟机(JVM)就知道该接口将要被用于一个事件的代理方案。
    向一个类添加数据类型：
        这种情况是标记接口最初的目的，实现标记接口的类不需要定义任何接口方法(因为标记接口根本就没有方法)，但是该类通过多态性变成一个接口类型。
 */
interface ccc extends Aa,Bb{
//    没有任何方法和属性的接口.它仅仅表明它的类属于一个特定的类型,供其他代码来测试允许做一些事情。
//    标记接口作用：简单形象的说就是给某个对象打个标（盖个戳），使对象拥有某个或某些特权。
}
