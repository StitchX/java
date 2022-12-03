package cn;
//继承：面向对象程序设计中最为重要的特征之一
//好处：提高程序的抽象程度；实现代码重用，提高开发效率和可维护性

public class B_Inheritance {
    public static void main(String[] args) {

    }

}

//父类superclass：包括所有直接或间接被继承的类
class Person{
    Person(String sex){
        System.out.println("构造方法不能继承");
    }

    int age;
    String name;
    int i;

    void DD(){
        System.out.println("父类方法，继承使用");
    }

    public void Demo(){
        System.out.println("父类方法，覆盖使用");
    }

}

//子类subclass
//Java支持单继承：一个类只能有一个直接父类
//子类继承父类的状态和行为；可以修改父类的状态或重载父类的行为，可添加新的状态和行为
//如果没有extends子句，则该类默认为java.lang.Object的子类
//    所有的类都是通过直接或间接地继承java.lang.Object得到的。
class Student extends Person{
//
    /*
    字段的继承
    继承：可以继承父类所有字段
    隐藏：子类重新定义一个与父类继承来的域变量完全相同的变量，称为域的隐藏
    添加：加上新的域变量
     */
    String school;
    int score;
    int i;

//
    /*
    方法的继承：
    方法的继承：父类的非私有方法也可以被子类自动继承，如Demo和DD
    覆盖override：子类重新定义与父类同名的方法，实现对父类方法的覆盖override
    方法的添加： 如：isGood()
    方法的重载overload：一个类中可以有几个同名的方法，这称为方法的重载（Overload）。
        同时，还可以重载父类的同名方法。与方法覆盖不同的是，重载不要求参数
        类型列表相同。重载的方法实际是新加的方法。

     */
    boolean isGood(){
        return score>80;
    }

    @Override   // JDK1.5以后可以用这个注记来表示(不用也是可以的）
    public void Demo() {
        /*
        super的两种使用：
        1、使用super访问父类的域和方法
            注意：正是由于继承，使用this可以访问父类的域和方法。
                但有时为了明确地指明父类的域和方法，就要用关键字super。
            用super不能访问在子类中添加的域和方法 super.score
            需要super以区别同名的域与方法
            当覆盖父类的同名方法的同时，又要调用父类的方法，就必须使用super
        2、super来调用父类的构造方法
            使用时，super()必须放在第一句。
            注意：构造方法不能被继承；比如不能说子类有个构造方法为Person(String sex)

         */
        super.Demo();  //当覆盖父类的同名方法的同时，又要调用父类的方法，就必须使用super

//        第一种 super
        int a;
        a = super.age;  //不能访问在子类中添加的域和方法 super.score
//        a = this.age;   // this可以访问父类的域和方法
//        a = this.score;
        System.out.println(super.i);  //需要super以区别同名的域与方法
        System.out.println(this.i);

    }

//    第二种 super
    Student(){
//        super来调用父类的构造方法；)必须放在第一句
        super("女");
        System.out.println();
    }

    public void Demo(Student another){  // 没看明白
        System.out.println("方法的重载");
    }


    public static void main(String[] args) {
//        父类对象和子类对象的转换
        /*
        1、子类对象可以被视为其父类的一个对象
        2、父类对象不能被当做其某一个子类的对象。
        3、如果一个方法的形式参数定义的是父类对象，那么调用这个方法时，
            可以使用子类对象作为实际参数。
        4、如果父类对象引用指向的实际是一个子类对象，
            那么这个父类对象的引用可以用强制类型转换（casting)成子类对象的引用。
         */

        Person p1 = new Person("female");
        Student s1 = new Student();
        Person p2 = new Student();
        Student s2 = (Student) p2;  //可以这样写
//        Student s3 = (Student) p1;   //运行时会出异常

        p1.DD();

    }
}