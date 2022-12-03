package cainiao;

// 封装
public class D5Encapsulation {
    /*
    封装的优点
        1. 良好的封装能够减少耦合。
        2. 类内部的结构可以自由修改。
        3. 可以对成员变量进行更精确的控制。
        4. 隐藏信息，实现细节。
     */


    private int aa;
    private String bb;

    public int getAa() {
        return aa;
    }

//这些方法被称为getter和setter方法。
    public String getBb() {
        return bb;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public void setBb(String bb) {
//         this 关键字是为了解决实例变量（private String name）和局部变量（setName(String name)中的name变量）之间发生的同名的冲突
        this.bb = bb;
    }


    public static void main(String[] args) {
        D5Encapsulation d5 = new D5Encapsulation();

        d5.setAa(9);
        System.out.println(d5.getAa());
    }
}
