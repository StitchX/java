package cainiao;

public class A1Introduce {
    /*
    1、简介
        sun公司，95年5月23日推出；James Gosling和同事们
        04年9月30日18:00PM，J2SE1.5发布
        甲骨文收购sun，09年4月20日
        Java分为三个体系：me se ee
        主要特性：
            简单
            面向对象
            分布式
            健壮
            安全
            体系结构中立
            可移植
            解释型
            高性能
            多线程
            动态

    2、运行
        javac HelloWorld.java
        java HelloWorld

    3、基础语法
        大小写敏感
        类名和源文件名：首字母大写，一致
        方法名：小写，驼峰命名法
        主方法入口：psvm
        标识符：数字（不能开头）、字母、下划线、美元符；关键字不能
        修饰符：访问控制修饰符（default, public , protected, private）；
              非访问控制修饰符 : final, abstract, static, synchronized
        变量：局部、成员（非静态）、类（静态变量）
        注释：单行，多行

        标识符命名规范：
        包名： 多个单词小写 helloworld
        类名、接口名： 驼峰命名法，首字母大写  HelloWorld
        变量名、方法名：驼峰命名法，首字母小写  helloWorld
        常量名：所有字母都大写，多个单词用下划线连接：HELLO_WORLD
        见名知意；Java使用unicode编码，是可以使用中文的，但是不建议使用
     */

//    访问修饰符 关键字 返回类型 方法名 （String类 字符串数组）
    public static void main(String[] args) {
        System.out.println("hello,world");

        System.out.println("输出非转移字符加斜线\\n");
    }
}
