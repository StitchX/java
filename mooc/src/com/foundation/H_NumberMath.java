package com.foundation;
//在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。为了解决这个问题，Java 语言为每一个内置数据类型提供了对应的包装类。
//所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。

public class H_NumberMath {

//    这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。
//                              相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。

    public static void main(String[] args) {
        /*
        所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。
            包装类	    基本数据类型
            Boolean	    boolean
            Byte	    byte
            Short	    short
            Integer	    int
            Long	    long
            Character	char
            Float	    float
            Double	    double
 */

//        Number
        Integer x=5;
        x+=10;
        System.out.println(x);

/*
        Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
        Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。
 */
//        math
        System.out.println("90度的正弦值："+Math.sin(Math.PI/2));
//        Math 的 floor,round 和 ceil 方法实例比较
        System.out.println(Math.ceil(1.3));  //2.0   双精度浮点型。
        System.out.println(Math.floor(1.8)); //1.0
        System.out.println(Math.round(1.4));//1
        System.out.println(Math.round(1.5)); //2
//        System.out.println(Math.random());  //返回一个随机数


    }
}
