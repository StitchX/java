package cainiao;

// 枚举
//Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
public class D7Enum {

//    2. 枚举类也可以声明在内部类中
    enum Season{
//        每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的。
        SPRING,SUMMER,AUTUMN,WINTER
}

//每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的。
    public static final D7Enum Red = new D7Enum();
    public static final D7Enum OR = new D7Enum();


    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1);
//        System.out.println(cainiao.Color.RED);

        Season s1 = Season.AUTUMN;
        System.out.println(s1);

//        3. 迭代枚举元素
//        for (cainiao.Color cc:cainiao.Color.values()){
//            System.out.println(cc);
//        }


//        4. values(), ordinal() 和 valueOf() 方法
        Season[] s2 = Season.values();
//        System.out.println(s1.ordinal());  // 2，返回下标
//        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
//        System.out.println(cainiao.Color.valueOf("BLUE"));


//        c1.info();

    }

}
/*
1. Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
 */

enum Color{
    RED, GREEN, YELLO, BLUE;


//    5. 枚举类成员
//    枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。
//    枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。
    Color(){
        System.out.println("输出颜色是："+this.toString());
    }

    public void info(){
        System.out.println("枚举类方法");
    }

//    abstract void ff();

}