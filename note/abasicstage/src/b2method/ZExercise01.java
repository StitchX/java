package b2method;

/**
 * @author Eva   Email:
 * @Description 貌似是值传递的问题
 * @data 2023/2/16 16:42
 */
public class ZExercise01 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
//        让 a = 100; b=100
        method(a,b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

//    方法一：
    public static void method(int a,int b){
        a = a*10;
        b = b*10;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.exit(0); // 强制停止执行
    }

    //    方法二：
    public static void method2(int a,int b){
//        略；没看明白
    }
}
