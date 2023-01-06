package allone.b14object;

import java.util.Date;

/*
Object类中的toString()的使用：
1、当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
2、Object类中toString()的定义：
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
3、像String、Date、File、包装类等都重写了Object类中的toString() 方法。
4、自定义类也可以重写toString()方法，当调用此方法时，返回对象的”实体内容“

 */
public class CToString {
    public static void main(String[] args) {
//        类型@地址值
        Customer cus1 = new Customer(); // shangguigu.foundation.a14object.Customer@27d6c5e0
        System.out.println(cus1.toString());

        Date date = new Date();
        System.out.println(date); // Tue Dec 13 17:23:28 CST 2022
        System.out.println(date.toString()); // Tue Dec 13 17:23:28 CST 2022
    }
}
class Customer{
    public Customer(){

    }
    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    自动生成一个toString()方法
    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
