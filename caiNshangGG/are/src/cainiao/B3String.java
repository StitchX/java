package cainiao;

//String 类
//注意：String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了。
//      如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。
public class B3String {
    public static void main(String[] args) {
        String s1 = "nihao";  // String 直接创建；存储在公共池中
        String s2 = new String();  // String 对象创建；存储在堆中
        String s3=s1;   // 相同引用
        String s4 = "";
//        char c1 = '';  报错


        char[] a = {'a','b','c','d'};
        String aa = new String(a);
        System.out.println(aa);  // abcd

//        长度
        System.out.println(aa.length());  // 4

//        连接
        System.out.println(aa.concat("bb")); // abcdbb
        System.out.println(aa+"cc"); //abcdcc

//        输出格式化数字可以使用 printf() 和 format() 方法
        System.out.printf("格式化输出：%s",a[0]);

        String fs = String.format("格式化赋值：%s",a[1]);
        System.out.println(fs);  // 格式化赋值：cainiao.b

//        String 方法
        System.out.println( aa.charAt(3));  // d 返回指定索引处的字符
        System.out.println(aa.compareTo("3ffee")); // 46，比较
        System.out.println(aa.isEmpty());  //  false 判断字符串是否为空


//        String 可以和八种数据类型做运算，且只能是连接预算，运算结果还是String类型
        System.out.println(s1 + 33 + true);  // nihao33true

        System.out.println('*'+'\t'+'*');  //93
        System.out.println('*'+"\t"+'*');  // *	*
        System.out.println('*'+'\t'+"*");  // 51*

        String s5 = "33";
        char c2 = '1';
//        System.out.println((int)s5);  报错
        System.out.println(Integer.parseInt(s5));  // 可以这样转换
        System.out.println((int)c2);  // 49
        char c3 = 97;
        System.out.println(c3);  // a



    }
}
