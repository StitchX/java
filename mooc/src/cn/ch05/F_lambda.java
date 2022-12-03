package cn.ch05;
//入 expression：Java 8 引入；  (参数）->结果
//    参数是()或1个参数或 (多个参数);结果是指 表达式 或 语句 或 {语句}
// 大体上相当于其他语言的“匿名函数”或“函数指针”
// Java中它实际上是“ 匿名类的一个实例”
// Lambda表达式是接口或者说是接口函数的简写


public class F_lambda {

    public static void main(String[] args) {
//        (String s) ->s.length();
//        x->x*x;
//        ()-> {System.out.println("aaa");}

        double b = Integral(new Fun(){
            public double fun(double x){
                return Math.sin(x);
            }
        },0,Math.PI,1e-5);

        double b2 = Integral(x->Math.sin(x),0,Math.PI,1e-5);
//        d = Integral( x->x*x, 0, 1, EPS );
//        d = Integral( x->1, 0, 1, EPS );


    }

//    积分
    static double Integral(Fun f, double i, double pi, double v) {
        int n,k;
        double fa,fb,h,t1,p,s,x,t = 0;
        fa = f.fun(i);
        fb = f.fun(pi);

        n = 1;
        h = pi-i;
        t1 = h*(fa +fb)/2.0;
        p = Double.MAX_VALUE;
        while (p>=v){
            s = 0.0;
            for (k=0; k<=n-1;k++){
//
            }

        }
        return 1;
    }

}


//由于Lambda只能表示一个函数，所以能写成Lambda的接口要求包含且最多只能有一个抽象函数
//这样的接口可以（但不强求）用注记@FunctionalInterface 来表示。称为函数式接口
@FunctionalInterface
interface Fun{double fun(double x);}
/*
由此可见
        Lambda表达式，不仅仅是简写了代码，
        更重要的是： 它将代码也当成数据来处理
 */

