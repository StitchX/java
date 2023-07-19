package d13reflection;

import java.io.IOException;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/7/18 15:48
 */

@YMyAnnotation(value="hi")
public class YCat extends YCreature<String> implements Comparable<String>,YMyInterface{
    private String name;
    int age;
    public int id;

    public YCat() {
    }

    @YMyAnnotation(value = "abc")
    private YCat(String name) {
        this.name = name;
    }
    YCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @YMyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;
    }

    public String display(String interests) throws IOException,NullPointerException,ClassCastException {
//        System.out.println();
        return interests;
    }

    @Override
    public void info() {
        System.out.println("我是猫咪");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
    private static void showDesc(){
        System.out.println("我是一个可爱的人");
    }

    @Override
    public String toString() {
        return "YCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
