package b5oopB;

/**
 * @author Eva   Email:
 * @Description 继承性
 * @data 2023/2/17 15:44
 */
public class AInheritance extends Object{
    /*
    面向对象的特征之二：继承性

    一、继承性的好处
    1）减少了代码的冗余，提高了代码的复用性
    2）便于功能的扩展
    3）为之后多态性的使用，提供了前提

    二、继承性的格式: class A extends Bf
    A:子类、派生类、subclass
    B:父类、超类、基类、superclass

    2.1 体现:一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有的属性和方法。
    特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
    只有因为封装性的影响，使得子类不能直接调用父类的结构而已。
    2.2 子类继承父类以后，还可以声明自己特有的属性或方法:实现功能的拓展。
    子类和父类的关系，不同于子集和集合的关系。extends:延展、扩展

    三、Java中关于继承性的规定:
        1.一个类可以被多个子类继承。
        2.Java中类的单继承性:一个类只能有一个父类
        3.子父类是相对的概念。
        4.子类直接继承的父类，称为，直接父类。间接继承的父类称为，间接父类
        5.子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法

    四、1、如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.object类
    2、所有的java类(除java.lang.object类之外)都直接或间接的继承于java.lang.object类
    3、意味着，所有的java类具有java.lang.object类声明的功能。
     */

    public AInheritance(){
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

/*
1、OOP特征二：继承性
2、方法的重写（Override）
3、四种访问权限修饰符
4、关键字：super
5、子类对象实例化过程
6、OOP特征三：多态性
*******下面和面向对象没关系*******
7、Object类的使用
8、包装类的使用
 */
