package cainiao;

// Number类
public class B1NumberMath {

    /*
    在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。为了解决这个问题，Java 语言为每一个内置数据类型提供了对应的包装类。
    所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。
     */
    public static void main(String[] args) {
//        Number
        Integer i=55;
        i=i+10;
        System.out.println(i); // 65
        System.out.println(i.compareTo(66));  //-1 将number对象与参数比较。

        Double j= i.doubleValue(); //将 Number 对象转换为xxx数据类型的值并返回。
        System.out.println(j);  //65

        Double a = Double.valueOf(8); //valueOf() 方法用于返回给定参数的原生 Number 对象值
        System.out.println(a.toString()); //以字符串形式返回值

//        Math

        Double k=1.4;
        System.out.println(Math.floor(k));
        System.out.println(Math.ceil(k));
        System.out.println(Math.round(k));

    }

}
