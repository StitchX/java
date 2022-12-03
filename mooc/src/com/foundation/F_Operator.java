package com.foundation;

/*
可以把运算符分成以下几组：
        算术运算符
        关系运算符
        位运算符
        逻辑运算符
        赋值运算符
        其他运算符
 */
public class F_Operator {
    public static void main(String[] args) {
//        算数运算符：加减乘除、取余、自增、自减
        int a=2;
        int b=5;
        System.out.println(a+b);
//        int b = ++a; 拆分运算过程为: a=a+1=4; b=a=4, 最后结果为b=4,a=4
//        int d = --c; 拆分运算过程为: c=c-1=2; d=c=2, 最后结果为d=2,c=2


//        关系运算符：相等、大于、小于、不等于、小于等于、大于等于
        System.out.println(a==b);


//        位运算符
//        ＆与   |或    ^异或  〜非    << 左移运算符   >> 右移运算符   >>> 右移补零操作符

        int c = 60; // 0011 1100
        int d = 13; // 0000 1101
        int e1,e2,e3,e4,e5,e6,e7;
        e1 = c&d;
        e2 =c|d;
        e3 = c^d;
        e4 = ~c;
        e5 = c <<2;
        e6 = c >> 2;
        e7 = d >>>2;
        System.out.println(e1);   //12     0000 1100
        System.out.println(e2);   //61     0011 1101
        System.out.println(e3);  //49      0011 0001  32+16+1
        System.out.println(e4);  //-61     1100 0011    反码：0011 1100  补码：0011 1101  32+16+8+4+1=61
        System.out.println(e5);  //240     1111 0000
        System.out.println(e6);  //15           1111
        System.out.println(e7);  //3       0000 1111

//        逻辑运算符  &&与  ||或  !非

        boolean f =true;
        boolean g = false;
        System.out.println(!(f||g));

//        短路逻辑运算符
        System.out.println((++a>5)&&(++a>6));  //false
        System.out.println(a);   //a=3


//        赋值运算符
//        =\+=\-=\*=\/=\%=\<<=\&=\^=\|=
        a^=2;  //a =3^2  0011  ^ 0010 = 0001
        System.out.println(a);


//        条件运算符 三元运算符
        int h;
        h = (a==1)? 7:8;
        System.out.println(h);

//        instanceof运算符：检查该对象是否是一个特定类型（类类型或接口类型）
        String i="kongbuxing";
        boolean result= i instanceof String;;
        System.out.println(result);

//        运算符优先级：略

    }

}
