package b2method;

/**
 * @author Eva   Email:
 * @Description 方法的重载overload
 * @data 2023/2/16 16:05
 */
public class COverload {
    /*
    方法的重载（Overload） loading...

    1. 定义：同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或参数类型不同即可。

        “两同一不同”：同一个类、相同方法名
                参数列表不同：参数个数不同，参数类型不同

    2. 举例
        Arrays类中重载的sort() / binarySearch()

    3. 判断是否是重载
        跟方法的权限修饰符、返回值类型、形参变量名、方法体没有关系

    4. 在通过对象调用方法时，如何确定某一个指定的方法：
        方法名----> 参数列表
     */

    public void demo01(){

    }

//    public String  demo01(){return "1";} //报错

    public void demo01(int a,double b){

    }
    public void demo01(double b,int a){

    }

}

/*
    重载可以理解成多态的具体表现形式

    重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
    最常用的地方就是构造器的重载。
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