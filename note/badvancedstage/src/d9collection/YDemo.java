package d9collection;

import java.util.Objects;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/15 16:56
 */
public class YDemo {
    private int age;
    private String name;

    public YDemo() {
    }

    public YDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "YDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YDemo yDemo)) return false;
        return age == yDemo.age && Objects.equals(name, yDemo.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
}
