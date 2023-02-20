package b7object;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/20 14:37
 */

public class YCustomer{
    public YCustomer(){

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
