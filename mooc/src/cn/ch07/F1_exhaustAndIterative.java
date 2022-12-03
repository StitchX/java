package cn.ch07;
/*
常用的几种算法
    这些算法属于“通用算法”
它们在解决许多问题中都有应用。
    遍试、迭代、递归和回溯
 */

import java.util.Map;

public class F1_exhaustAndIterative {
    public static void main(String[] args) {
//        all_6();
//        all_4();
//        all_5();
        System.out.println(sqrt(98.0));
    }

//    遍试（穷举，exhaust algorithm）
//    在有限的范围内，可以对所有的值都进行试验和判断，从而找到满足
//    条件的值
//      All_153.java 求三位的水仙花数
//      All_628.java 求9999以内的完全数
//      All_220.java 求9999以内的“相亲数”
//    遍试算法基本的模式
//      for(;;){ if(); }
    static void all_6(){
//        水仙花数  三位数其各位数字的立方和等于该数本身    153=1+125+27
        for (int i=0;i<=9;i++){
            for (int j=0;j<=9;j++){
                for (int z=0;z<=9;z++){
                    if (i*i*i+j*j*j+z*z*z == 100*i+10*j+z){
                        System.out.println(100*i+10*j+z);
                    }
                }
            }
        }

    }

//    完全数：一个数恰好等于它的真因子之和  6 = 2+3+1
    static void all_4(){
        for (int i=1;i<9999;i++){
            int s = 0;
            for (int j=1; j<i;j++){
                if (i%j == 0) s+=j;
            }
            if (s==i) System.out.println(i);
        }
    }

//    相亲数(亲和数（Amicable numbers），又称相亲数、友爱数、友好数)：指两个正整数中，彼此的全部正约数之和（本身除外）与另一方相等
//    例如220的因子：1、2、4、5、10、11、20、22、44、55、110 = 284
//    284的因子：1、2、4、71、142=220
    static void all_5(){
        for (int a=1;a<9999;a++){
            int s1 = 0;
            for (int b=1;b<a;b++){
                if (a%b==0) s1+=b;
            }
            int s2=0;
            for (int c=1;c<s1;c++){
                if (s1%c==0) s2+=c;
            }
            if (s2==a && s1<s2) System.out.println(s1+" "+s2);
        }
    }

/*
迭代（iterative algorithm）
    是多次利用同一公式进行计算，每次将计算的结果再代入公式进行计算，从而逐步逼近精确解
    迭代的基本模式
        while() { x = f(x); }
 */

    static double sqrt(double a){
        double x=1.0;
        do {
            x = (x+a/x)/2;
            System.out.println(x+","+a/x);
        }while (Math.abs(x*x-a)/a>1e-6);  // math.abs 绝对值|X|
        return x;
    }
}
