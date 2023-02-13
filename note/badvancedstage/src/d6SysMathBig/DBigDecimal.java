package d6SysMathBig;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Eva   Email:
 * @Description BigDecimal
 * @data 2023/2/13 16:55
 */
public class DBigDecimal {
    /*
    java.math包的BigInteger可以表示不可变的任意精度的有符号的十进制定点数
     */
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("125633.325");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bd1.divide(bd2, BigDecimal.ROUND_HALF_EVEN));
        System.out.println(bd1.divide(bd2, 15,BigDecimal.ROUND_HALF_EVEN));

//        常用方法
        /*
        add
        subtract
        multiply
        divide
         */
    }

}
