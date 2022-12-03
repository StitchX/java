package cn.ch05;
//装箱、枚举、注解
//从JDK1.5起，增加了一些新的语法；大部分是编译器自动翻译的，称为Complier sugar

public class G_boxingEnumAnnotation {


    public static void main(String[] args) {
//    它将基本类型（primitive type) 包装成Object(引用类型）
//    Boolean, Byte, Short, Character, Integer, Long, Float, Double
        Integer I = new Integer(10);  //装箱（Boxing） 译为Integer I= Integer.valueOf(10);
        int i = I;  //拆箱（Unboxing） 译为 int i = I.intValue();
//        主要方便用于集合中，如
        Object [] ary = { 1, "aaa"};    // ary[0] 一个引用类型  ary[1] String引用类型


        Direction dir = Direction.EAST;
        System.out.println(dir);

    }
//        枚举
//        枚举(enum)是一种特殊的class类型
    enum Light{Red,Yello,Blue};
//    实际上，它生成了 class Light extends java.lang.Enum

    //     可以在enum定义体中，添加字段、方法、构造方法
    enum Direction
    {
        EAST("东",1), SOUTH("南",2),
        WEST("西",3), NORTH("北",4); //各个常量使用逗号 , 来分割。
        private Direction(){
            System.out.println("打印枚举类中的构造函数");
            System.out.println(toString());
        }
        private Direction(String desc, int num){
            this.desc=desc; this.num=num;
        }
        private String desc;
        private int num;
        public String getDesc(){ return desc; }
        public int getNum(){ return num; }

    }

//注解（annotation）
//        又称为注记、标记、标注、注释（不同于comments)
//        是在各种语法要素上加上附加信息，以供编译器或其他程序使用
//所有的注解都是 java.lang.annotation. Annotation 的子类
/*
 常用的注解，如
@Override 表示覆盖父类的方法
@Deprecated 表示过时的方法
@SuppressWarnings 表示让编译器不产生警告
自定义注解，比较复杂
public @interface Author {
    String name();
}
 */
}
