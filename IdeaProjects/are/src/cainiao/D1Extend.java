package cainiao;

// 继承
/*
1. 继承的特性和优点: 但继承 多重继承
2. super和this
3. final
4. 构造器: 不能继承,会被执行,必须调用
 */
public class D1Extend {
    /*
    重复的代码: 代码量大且臃肿，而且维护性不高
    维护性也提高，代码也更加简洁，提高代码的复用性

    java不支持多继承，但支持多重继承


    继承的特性
        1. 子类拥有父类非 private 的属性、方法。(继承了所有属性和方法，只是不能直接调用，通过get set 方法，堆中有private属性)
        2. 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
        3. 子类可以用自己的方式实现父类的方法。
        4. Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，
            例如 cainiao.B 类继承 cainiao.A 类，C 类继承 cainiao.B 类，所以按照关系就是 cainiao.B 类是 C 类的父类，
            cainiao.A 类是 cainiao.B 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
        5. 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
     */

    public static void main(String[] args) {
//        cainiao.Son son = new cainiao.Son();

        Father fa = new GraSon();
    }
}


class Father{
    int ff=9;
    Father(int cc){
        System.out.println("单继承");
    }
}

//super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
//this关键字：指向自己的引用。
class Son extends Father{
    int ff = 8;
    Son(int c){
        super(2);
        System.out.println("支持多重继承");
        System.out.println(super.ff);
        System.out.println(this.ff);
    }
}


class GraSon extends Son{
//    子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。
//    如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
    GraSon(){
        super(1);
        System.out.println("构造器中调用父类带参数的构造器");
    }
}


final class No{
    No(){
        System.out.println("使用 final 关键字声明类，就是把类定义定义为最终类，不能被继承，或者用于修饰方法，该方法不能被子类重写");
    }
    final void nn(){
        System.out.println("用于修饰方法，该方法不能被子类重写");
    }
}