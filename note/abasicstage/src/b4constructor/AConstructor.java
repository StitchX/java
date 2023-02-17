package b4constructor;

/**
 * @author Eva   Email:
 * @Description 构造器（constructor）
 * @data 2023/2/17 14:44
 */
public class AConstructor {
    /*
    类的结构之三：构造器（或构造方法、constructor）的使用
    construct: 建设、建造。construction：CCB

    一、构造器的作用：
    1. 创建对象
    2. 初始化对象的属性

    二、说明：
    1. 如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
    2. 定义构造器的格式：权限修饰符 类名(形参列表){}
    3. 一个类中定义的多个构造器，彼此构成重载
    4. 一旦我们显示的定义了类的构造器之后，系统就不再提供默认的空参构造器
     */

    private int a;

    public AConstructor(){
        System.out.println("默认空参");
    }
    public AConstructor(int a, double b){
    }

    public AConstructor(int a){
//        this.a = a;
    }

    public static void main(String[] args) {
//        创建类的对象：new + 构造器
        YDemo a1 = new YDemo();
    }
}
