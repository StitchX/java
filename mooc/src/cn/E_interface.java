package cn;

//接口，某种特征的约定
//  定义接口 interface
//  所有方法都自动是public abstract的
//实现接口 implements
//  可以实现多继承
//  与类的继承关系无关

//面向接口编程，而不是面向实现

//接口的作用
//1. 通过接口可以实现不相关类的相同行为，而不需要考虑这些类之间的层次关系。从而在一定意义上实现了多重继承。
//2. 通过接口可以指明多个类需要实现的方法。
//3. 通过接口可以了解对象的交互界面，而不需了解对象所对应的类


//引用类型：数组、class、interface


//通常接口以able或ible结尾，表明接口能完成一定的行为。
interface Collection{
//    方法定义的格式：returnType methodName ( [paramlist] )；
//    接口中只进行方法的声明，而不提供方法的实现，所以，方法定义没
//    有方法体，且用分号(;)结尾。在接口中声明的方法具有public 和 abstract属性。
//            所以定义的时候这两个关键词是可以省略的
    void add(int a);
    void delete(String str);
}

interface D{
//    接口体中可以包含常量定义: type NAME = value;
//    中type可以是任意类型，NAME是常量名，通常用大写，value是常量值
//    接口中定义的常量具有public, static, final的属性
//    必须赋值
    float SIZE=2;

//    枚举,从JDK1.5起，可以使用枚举
//    Java中的枚举是用class来实现的，可以复杂地使用
    enum Light{Red, Yellow, Green}
    int size();
}

interface SubCol extends Collection,D{
//    如果在子接口中定义了和父接口同名的常量或相同的方法，则 父接口中的常量被隐藏，方法被重载。
    int add(long a);
    Object find(Object object);
}


//在类中实现接口所定义的方法时，方法的声明必须与接口中所定义的完全一致。
//extends 子句与类声明中的extends子句基本相同，不同的是一个接口可以有多个父接口，
//       用逗号隔开，而一个类只能有一个父类。子接口继承父接口中所有的常量和方法。


//在类的声明中用implements子句来表示一个类使用某个接口，在类
//体中可以使用接口中定义的常量，而且必须实现接口中定义的所有方法。一个类可以实现多个接口
class Fif implements SubCol,D{

    @Override
    public void add(int a) {
        System.out.println(SIZE);
    }

    @Override
    public void delete(String str) {

    }

    @Override
    public int size() {
        Light light = Light.Red;
        switch (light){
            case Red:
                System.out.println("红色");
                break;
            case Green:
                System.out.println("绿色");
                break;
            default:
                System.out.println("不知名颜色");
                break;
        }
        return 0;
    }

    @Override
    public int add(long a) {
        return 0;
    }

    @Override
    public Object find(Object object) {
        return null;
    }
}


public class E_interface {

    public static void main(String[] args) {


//        SubCol作为引用类型来使用。
        SubCol sb = new Fif();
        sb.add(1);


    }
}
