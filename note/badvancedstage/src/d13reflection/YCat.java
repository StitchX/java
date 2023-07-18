package d13reflection;

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

    public YCat(String name) {
        this.name = name;
    }
    YCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String show(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;
    }

    public String display(String interests){
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
}
