package d13reflection;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/7/17 15:20
 */
public class YDemo01 {

    private String name;
    public int age;

    public YDemo01() {
    }

    public YDemo01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private YDemo01(String name) {
        this.name = name;
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

    public void show(){
        System.out.println("hello");
    }

    private String showNation(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;
    }

    @Override
    public String toString() {
        return "YDemo01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
