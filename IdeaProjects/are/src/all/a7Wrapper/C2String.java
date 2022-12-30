package all.a7Wrapper;

// 值传递机制，String比较特殊
public class C2String {
    public static void main(String[] args) {
        Demo01 d1 = new Demo01();

        String str1 = "Hello";
        d1.strDemo(str1);

        System.out.println(str1); // hello
//        原因：String底层是char类型数组，不可变；
//        数据（“Hello”）存在【方法区的常量池】
//        str1 在栈中，存地址值
//        str1 = str2 地址值相同
//        新建一个“Hi~”，str2指向新地址值
    }
}
