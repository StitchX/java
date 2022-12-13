package shangguigu.foundation;

/*
JavaBean是一种Java语言写成的可重用组件

所谓JavaBean，是指符合如下标准的Java类：
    类是公共的
    有一个无参的公共的构造器
    有属性，且有对应的get、set方法
 */
public class AM3JavaBean {

    private int n;
    private String st1;
    public AM3JavaBean(){

    }

    public String getSt1() {
        return st1;
    }

    public void setSt1(String st1) {
        this.st1 = st1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
