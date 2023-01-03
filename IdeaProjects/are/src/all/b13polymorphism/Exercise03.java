package all.b13polymorphism;
/*
考试题二：
    考察可变参数的使用；重载；覆盖
 */

public class Exercise03 {
    public static void main(String[] args) {
        Vase vase = new Vase();
        vase.add(1,2,3);

        Vub v = (Vub)vase;
        v.add(1,2,3);
    }
}

class Vase{
    public void add(int a,int... arr){
        System.out.println("Vase");
    }
}

class Vub extends Vase{
    public void add(int a,int[] arr){
        System.out.println("Vub_1");
    }
    public void add(int a,int b,int c){
        System.out.println("Vub_2");
    }
}