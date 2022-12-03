package cainiao;

// 抽象类
//所有的对象都是通过类来描绘的；并不是所有的类都是用来描绘对象的；没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类
public abstract class D4Abstract {
    /*
    不能实例化，必须被继承才能使用
    一个类只能继承一个抽象类，而一个类却可以实现多个接口
    抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类
    抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能
    构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法
    抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类
     */
//    public static void main(String[] args) {     // 会报错
//    }

    D4Abstract(){ // 构造方法，不能声明为抽象方法

    }
    static double cc(){  // 类方法（用 static 修饰的方法）不能声明为抽象方法
        return 9.21;
    }


    private int a;
    private double b;

    void aa(){
        System.out.println("你好");
    }

    abstract int bb(); // 没有方法体；有抽象方法的类一定是抽象类
}

class b extends D4Abstract{

    @Override
    int bb() {   // 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类
        return 0;
    }
}
