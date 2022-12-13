package shangguigu.foundation;

public class ProjectFiveThis {
    public static void main(String[] args) {
        Boy boy = new Boy(19,"lmo");
        boy.shot();

        Girl girl1 = new Girl(20,"zly");
        Girl girl2 = new Girl(21,"zly1");
        System.out.println(girl2.compare(girl1)); // 1
        System.out.println(girl1.compare(girl2)); // -1
    }

}

class Boy{
    private String name;
    private int age;
    public Boy(){

    }
    public Boy(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Girl girl){
        System.out.println("我想去"+girl.getName());
    }

    public void shot(){
        if (this.age>22){
            System.out.println("可以");
        }else {
            System.out.println("不可以");
        }
    }
}

class Girl {
    public Girl(){

    }

    private String name;
    private int age;

    public Girl(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy){
        System.out.println("我想贾"+boy.getName());
        boy.marry(this); // this 代表当前对象
    }

    /*
    比较两个对象的大小：对象的大小对比通过对象里的属性
     */
    public int compare(Girl girl){
        return this.age - girl.age;
    }
}