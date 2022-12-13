package shangguigu.foundation;
/*
类的结构之三：构造器（或构造方法、constructor）的使用
constructor：建造者

一、构造器的作用：
    1、创建对象
    2、初始化对象的属性
二、说明
    1、如果没有显示的定义的空参的构造器的话，则系统默认提供一个空参的构造器
    2、定义构造器的格式：权限修饰符 类名(形参列表){}
    3、一个类中定义的多个构造器，彼此构成重载
    4、一旦我们显示的定义了类的构造器之后，系统就不再提供空参的构造器
    5、一个类中，至少一个构造器
 */
public class AM3Constructor {
    public static void main(String[] args) {
//        创建类的对象：new+构造器
        Person p1 = new Person();
    }

}


class Person{
    int n;
    public Person(){
        System.out.println("创建类的对象：new+构造器");
    }

//    一个类中定义的多个构造器，彼此构成重载
    public Person(int n){
        this.n = n;
//        System.out.println("创建类的对象：new+构造器");
    }
}