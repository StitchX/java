package cainiao;

//重写override和重载overload
//方法的重写(Overriding)和重载(Overloading)是java多态性的不同表现，
//  重写是父类与子类之间多态性的一种表现，重载可以理解成多态的具体表现形式。
public class D2OverrideOverload {
    /*
    重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
    每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
    最常用的地方就是构造器的重载
    重载规则:
        1、被重载的方法必须改变参数列表(参数个数或类型不一样)；
        2、被重载的方法可以改变返回类型；
        3、被重载的方法可以改变访问修饰符；
        4、被重载的方法可以声明新的或更广的检查异常；
        5、方法能够在同一个类中或者在一个子类中被重载。
        6、无法以返回值类型作为重载函数的区分标准。
     */
    void qq(){

    }
    protected int qq(String a){  // 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
        return 1;
    } // 1、2、3、6

    public static void main(String[] args) {

    }
}

class A1{
    protected Object aa(){
        System.out.println("aa");
        return 1;
    }
}

class B1 extends A1{

    /*
    重写规则:
        1、参数列表必须完全相同
        2、返回类型可以不相同，但是必须是父类返回值的派生类（java5 及更早版本返回类型要一样，java7 及更高版本可以不同）。
        3、访问权限不能比父类中被重写的方法的访问权限更低。
        4、声明为 final 的方法不能被重写
        5、声明为 static 的方法不能被重写，但是能够被再次声明。
        6、子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为 private 和 final 的方法。
        7、子类和父类不在同一个包中，那么子类只能够重写父类的声明为 public 和 protected 的非 final 方法。
        8、重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以
        9、构造方法不能被重写。
     */
    public String aa(){ // 1、2、3、6
//        子类中调用父类的被重写方法时，要使用 super 关键字。
        super.aa();
        System.out.println("bb");
        return "11";
    }
}

/*
重写和重载的区别
参数列表
返回类型
异常
访问
 */
