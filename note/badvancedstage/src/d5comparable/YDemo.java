package d5comparable;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/13 14:40
 */
public class YDemo implements Comparable{
    public YDemo(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GOODS{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    private String name;
    private double price;

//    按照价格从低到高排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof YDemo){
            YDemo goods = (YDemo) o;
//            方式一：
            if (this.price> goods.price){
                return 1;
            }else if (this.price< goods.price){
                return -1;
            }else {
                return 0;
            }
            //        方式二：
//            return -Double.compare(this.price, goods.price);
        }
        throw new RuntimeException("传入数据类型不一致");
    }
}
