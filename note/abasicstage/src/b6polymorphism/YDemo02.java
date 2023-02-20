package b6polymorphism;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/20 11:44
 */
public class YDemo02 extends YDemo01{
    int id = 11;
    String name = "jerry";
    @Override
    public void demo02() {
        System.out.println("覆盖");
    }

    public void smoken(){
        System.out.println("特有的");
    }
}
