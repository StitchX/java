package cainiao;

// 访问修饰符
public class A4DPPP {
    //    访问修饰符 关键字 返回类型 方法名 String类型 字符串数组
    private int aa;

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public static void main(String[] args) {

    }
    /*
    修饰符用来定义类、方法或者变量
    Java语言提供了很多修饰符，主要分为以下两类：
        访问修饰符:当前类、同一包内、子孙类(同一包)、子孙类(不同包)、其他包
            default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。不能：子孙类(不同包)、其他包
            private : 在同一类内可见。使用对象：变量、方法。
                    -----------------注意：不能修饰类（外部类） 注意：不能修饰类（外部类）
            public : 对所有类可见。使用对象：类、接口、变量、方法
            protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。子类与基类在同一包中
                        ------------ 注意：不能修饰类（外部类）。不能：与default对比
        非访问修饰符

     */
}

class A{
    protected void you(){
        System.out.println("hello");
    }
}


class B extends A{
//    父类中声明为 public 的方法在子类中也必须为 public。
//    父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
    @Override
    public void you() {  //
        super.you();
        System.out.println("world");
    }
}
