package d9collection.exercise;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/6/7 14:38
 */
public class Employee implements Comparable{

    private String name;
    private int age;
    private MyDate myDate;

    public Employee() {
    }

    public Employee(String name, int age, MyDate myDate) {
        this.name = name;
        this.age = age;
        this.myDate = myDate;
    }

    public Employee(Integer integer) {
    }

    public Employee(Integer integer, String s) {
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

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myDate=" + myDate +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        }
        return 0;
    }

}
