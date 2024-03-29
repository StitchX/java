package b2method;

/**
 * @author Eva   Email:
 * @Description 递归方法
 * @data 2023/2/16 16:16
 */
public class FRecursion {
    /*
    递归方法的使用（了解）
    1. 递归方法：一个方法体内调用它自身
    2. 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
    递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环
     */

//    计算1-n之间的所有自然数的和
    public int getSun(int n){
        if (n==1){
            return 1;
        }else {
            return n+getSun(n-1);
        }
    }

}

