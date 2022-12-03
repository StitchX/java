package cn.ch05;
//对象的构造和初始化
//构造方法的执行过程

public class C_constructor {
    /*
    构造方法（constructor)
        对象都有构造方法
        如果没有，编译器加一个default构造方法，如果有，则不加
        抽象类也有构造方法；子类会调用该抽象类的构造方法，所有对象都有构造方法
    */

    public static void main(String[] args) {

        Person p = new Graduate();
        p.age = 17;
        p.name = "李四";

//        创建对象时初始化
//        这样可以针对没有相应构造函数，但又要赋值
        Person p1  = new Person(){{age = 18; name = "张三";}}; //方便一点点

    }
}

class Person{
    String name;
    int age;
    Person(){}  // 如果没有，编译器加一个default构造方法
    Person(String name, int age){
//        父类调用父类的构造方法，直到最高层Object
        this.name =name;
        this.age = age;
        System.out.println("In Person (String,int)");
    }
}

class Student extends Person{
    /*
    调用本类或父类的构造方法
        this调用本类的其他构造方法。
        super调用直接父类的构造方法
        this或super要放在第一条语句,且只能够有一条
    如果没有this及super，则编译器自动加上super()，即调用直接父类不带参数的构造方法
    因为必须令所有父类的构造方法都得到调用，否则整个对象的构建就可能不正确
     */
    String school;
    Student(){
        this(null, 0, null); // 放在首行；调用本类构造方法；只能够有一条
        System.out.println("In Student()");
    }

    Student(String name, int age, String school){
        super(name, age);  // 首行；只能够有一条
        this.school = school;
        System.out.println("In Student(String, int, String)");
    }

}

//多重继承
class Graduate extends Student{
    /*
     实例初始化（Instance Initializers）
        在类中直接写{ 语句…. }
        实例初始化，先于构造方法{}中的语句执行
     静态初始化（Static Initializers）
        static { 语句…. }
        静态初始化，在第一次使用这个类时要执行，但其执行的具体时机是不确定的,但是可以肯定的是：总是先于实例的初始化

     */
    int a=0;  //字段初始化；实例初始化
    {
        System.out.println("实例初始化的一种"+a);
    }

    static int x = 1;
    static{  //静态初始化;先于实例的初始化
        x++;
        System.out.println(x);
    }


    String teacher = "";
    Graduate(){
        // super();    //没有this及super，则编译器自动加上super()
        System.out.println("In Graduate");
    }
}
/*
class A{
    A(int a){}
}

class B extends A{
    B(String s){  // 报错

    }
}
三个解决方法：
A类添加无参数的构造方法
B类调用父类构造方法super(1)
A类删除全部构造方法
 */


/*
构造方法的执行过程遵照以下步骤：
调用本类或父类的构造方法，直至最高一层（Object）
按照声明顺序执行字段的初始化赋值
执行构造函数中的各语句
简单地说：先父类构造，再本类成员赋值，最后执行构造方法中的语句

反汇编查看 javac -p
class Demo{
    // 第一步，执行super，调用object方法
    int a = 1;   // 第二步：实例初始化
    Demo(){
        this.a = 3;  // 第三步：构造方法执行
    }
}

 构造方法内部调用别的的方法
  如果这个方法是虚方法，结果如何？
  从语法上来说这是合法的，但有时会造成事实上的不合理



在本例中，在构造方法中调用了一个动态绑定的方法b(),这时，
会使用那个方法被覆盖的定义，而这时对象尝未完全构建好，所以
A1还没有赋值。
在构造方法中尽量避免调用任何方法，尽可能简单地使对象进入就绪状态：惟一能够安全调用的是final的方法。
举例：
// B b= new B("this is school name");  // 结果：school输出为null
class A{

    int age=-1; //
    A(int age){

        say();  // 非第三步
    }
    void say(){
        System.out.println("i do not know");
    }
}

class B extends A{
    String school = "not know";  // 第一步
    B(String school){
        super(1);  // 第二步
        this.school = school;  // 第四部
    }
    void say(){
        System.out.println(school+"  "+age);  // override 实际第三步
    }
}
 */