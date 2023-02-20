package b6polymorphism;

/**
 * @author Eva   Email:
 * @Description instanceOf关键字使用
 * @data 2023/2/20 14:15
 */
public class BInstanceof {
    /*
    如果 a instanceof A返回true,则a instanceof B也返回true.
    其中，类B是类A的父类。
     */

    public static void main(String[] args) {
        APolymorphism y1 = new YDemo02();
//        向下转型: 使用强制类型转换符; 对比：强制类型转换
//        YDemo02 y2 = (YDemo02) y1;
//        y2.smoken();

//        使用情境:为了避免在向下转型时出现ClassCastException的异常
//        我们在向下转型之前，先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。

        if (y1 instanceof YDemo02){
            YDemo02 y2 = (YDemo02) y1;
        }
    }
}
