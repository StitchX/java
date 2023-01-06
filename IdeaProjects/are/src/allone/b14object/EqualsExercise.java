package allone.b14object;

/*
编写Order类，有int型的orderID，String型的orderName
相应的getter() 和setter()方法，两个参数的构造器
重写父类的equal()方法：public Boolean equals(Object obj),
并判断测试类中创建的两个对象是否相等
 */
public class EqualsExercise {

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        order2.equals(order1);
    }

}

class Order{
    public Order(){

    }
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Order){
            Order or = (Order) obj;
            return this.orderId==or.orderId && this.orderName.equals(or.orderName);
//            以下也会返回true的原因是，String赋值相同是，指向常量池中的同一个数据
//            return  this.orderId==or.orderId && this.orderName==or.orderName;
        }else {
            return false;

        }
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Order order)) return false;
//        return orderId == order.orderId && orderName.equals(order.orderName);
//    }

}