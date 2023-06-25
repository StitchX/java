package d10generic;

/**
 * @author Eva   Email:
 * @Description 自定义泛型类
 * @data 2023/6/25 16:04
 */
public class BSelf<T> {
    String orderName;
    int orderId;

//    类的内部结构就可以使用类的泛型

    T orderT;

    public BSelf() {
    }

    public BSelf(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "BSelf{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
