import org.junit.Test;

/**
 * @author Eva   Email:
 * @Description 关于包装类使用的面试题
 * @data 2023/1/6 11:15
 */
public class Wrapper01 {
    @Test
    public void test1(){
//        1、编译时自动类型提升为Double；2、
        Object obj1 = true?new Integer(1):new Double(2.0);
        System.out.println(obj1); // 1.0
    }

    @Test
    public void test2(){
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println(x==y);  // false；地址值比较

        Integer i = 1;
        Integer j = 1;
        // true；因为Integer的内部类 IntegerCache有个定义了数组，保存了-128-127的整数，
        // 直接使用，不用new，主要为了高效率
        System.out.println(i==j);

        Integer m = 128;
        Integer n = 128;
//       超过了缓存范围，则自动new了一个数据
        System.out.println(m==n); // false；

    }
}
