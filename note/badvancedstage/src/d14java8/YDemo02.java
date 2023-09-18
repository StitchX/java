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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YDemo02 yDemo02)) return false;

        if (id != yDemo02.id) return false;
        if (age != yDemo02.age) return false;
        if (Double.compare(yDemo02.salary, salary) != 0) return false;
        return Objects.equals(name, yDemo02.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
