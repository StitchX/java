package com.foundation;

public class I_Character {
    /*
    在某些情况下，Java编译器会自动创建一个Character对象。
    例如，将一个char类型的参数传递给需要一个Character类型参数的方法时，那么编译器会自动地将char类型参数转换为Character对象。
                这种特征称为装箱，反过来称为拆箱。
     */

    public static void main(String[] args) {
        // Unicode 字符表示形式
        char uniChar = '\u039A';
        System.out.println(uniChar);

//        字符数组
        char[] charArray={'a','b','c'};
        System.out.println(charArray[1]);

//        Character ch = new Character('a');
        // 原始字符 'a' 装箱到 Character 对象 ch 中
        Character ch='a';
        System.out.println(ch);
        /*
        Character 方法
                下面是Character类的方法：

                序号	方法与描述
                1	isLetter()
                是否是一个字母
                2	isDigit()
                是否是一个数字字符
                3	isWhitespace()
                是否是一个空白字符
                4	isUpperCase()
                是否是大写字母
                5	isLowerCase()
                是否是小写字母
                6	toUpperCase()
                指定字母的大写形式
                7	toLowerCase()
                指定字母的小写形式
                8	toString()
                返回字符的字符串形式，字符串的长度仅为1
         */
        System.out.println(Character.isDigit('a'));

//        前面有反斜杠（\）的字符代表转义字符，它对编译器来说是有特殊含义的。
//        \t	在文中该处插入一个tab键
//        \b	在文中该处插入一个后退键
//        \n	在文中该处换行
//        \r	在文中该处插入回车
    }
}
