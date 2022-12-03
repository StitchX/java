package cn.ch05;
/*
1、什么是多态？两种情况？优势？
2、虚方法的调用？根据调用该方法的实例的类型来决定选择哪个方法调用
3、非虚方法（三种）及其调用？
 */


//多态(Polymorphism)是指一个程序中相同的名字表示不同的含义的情况
//多态有两种情形
//    编译时多态：重载(overload) （多个同名的不同方法）。
//    运行时多态：覆盖(override) （子类对父类方法进行覆盖）
//      动态绑定（dynamic binding） ----虚方法调用(virtual method invoking)
//      在调用方法时，程序会正确地调用子类对象的方法。
//多态的特点大大提高了程序的抽象程度和简洁性

public class B_polymorphismVirtual {

    static void demo(Shape p){
        System.out.println("上溯造型（upcasting）:是把派生类型当作基本类型处理");  // Shape基类；Circle派生类
        p.run();
        p.draw();  //
    }

    public static void main(String[] args) {
        B_polymorphismVirtual bp = new B_polymorphismVirtual();


//        用虚方法调用，可以实现运行时的多态
//          子类重载了父类方法时，运行时系统根据调用该方法的实例的类型来决定选择哪个方法调用
//          所有的非final方法都会自动地进行动态绑定
        Circle c = new Circle();
//        bp.demo(c.run("123"));
        System.out.println("------------虚方法的调用---------------");
        bp.demo(c);
        bp.demo(new Shape());
        bp.demo(new Triangle());


//        动态类型的确定：变量 instanceof 类型；结果是boolean 值
        System.out.println("-------------instanceof 判断类型------------------");
        Object[] obj = new Object[3];
        obj[0] = new Integer(4);
        obj[1] = new Double(3.14);
        obj[2] = new String("test");
        double sum = 0;
        for (int i=0; i<obj.length;i++){
            if (obj[i] instanceof Integer){
                sum += ((Integer)obj[i]).intValue();
            }else if(obj[i] instanceof Double){
                sum += ((Double)obj[i]).doubleValue();
            }
        }
        System.out.println(sum);


        Shape s = new Circle();
        System.out.println("-------------非虚方法的调用--------------------");
        System.out.println("static跟声明有关，和实例对象无关：");
        s.draw(); //    Shape，与调用的形状无关
        c.draw(); //    Circle，声明为Circle时调用
//        s.run();  //    draw circle；对比下，方法被子类覆盖

    }


}

class Shape{
//    三种非虚的方法
//    static的方法，以声明的类型为准，与实例类型无关
//    private方法子类看不见，也不会被虚化
//    final方法子类不能覆盖，不存在虚化问题
    static void draw(){
        System.out.println("Shape，与调用的形状无关");
    }
    private void demo(){

    }
    void run(){
        System.out.println("Shape drawing");
    }
}

class Circle extends Shape{
    static void draw(){
        System.out.println("Circle，声明为Circle时调用");
    }
    void run(){
        System.out.println("draw circle");
    }
//    void run(int a){
//        System.out.println("draw circle");
//    }
}

class Triangle extends Shape{
    void run(){
        System.out.println("draw three lines");
    }
}
