package shangguigu.foundation.a13polymorphism;
// 多态练习，调用属性和方法
/*
练习一：
    1、若子类重写了父类方法，就意味着子类里重定义的方法彻底覆盖了父类里的同名方法，
    系统将不可能把父类里的方法转移到子类中：编译看左边，运行看右边
    2、对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
    这个实例变量依然不可能覆盖父类中定义的实例变量：编译运行都看左边
 */


public class Exerecise01 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();
        Base b =s;
//        对于引用数据类型，比较的是地址值
        System.out.println(s == b);
        System.out.println(s.count);
        s.display();
    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
