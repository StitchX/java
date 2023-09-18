package d14java8;

import java.util.Objects;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/9/15 11:24
 */
public class YDemo02 {
    private  int id;
    private  String name;

    private int age;
    private double salary;

    public YDemo02(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public YDemo02(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public YDemo02() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "YDemo02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
