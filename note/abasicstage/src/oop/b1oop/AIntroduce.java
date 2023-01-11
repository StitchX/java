package oop.b1oop;

/**
 * @author Eva   Email:
 * @Description 面向对象的介绍
 * @data 2023/1/6 11:20
 */
public class AIntroduce {
    /*
    介绍面向对象的软件开发和面向对象程序设计中的基本方法和基本概念

    对象（object)
        对象具有两方面的含义：
            在现实世界中：
                是客观世界中的一个实体
            在计算机世界中：
                [是一个可标识的存储区域]
    类（class）
        类：具有共同属性和行为的对象集合
            属性： 变量（字段 field)
            行为： 函数（方法 method）
        类与对象的关系
            类是对象的抽象(模板)
            对象是类的实例
                注：类和对象有时都统称“对象”，为了明确起见，后者称为“对象实例”


        面向对象的三大特征
            封装性
                模块化：将属性和行为封装在类中，程序定义很多类。
                信息隐蔽：将类的细节部分隐藏起来
                        用户只通过受保护的接口访问某个类。
            继承性（inheritance)
                继承性
                    父类和子类之间共享数据和方法
                继承的好处
                    更好地进行抽象与分类
                    增强代码的重用率
                    提高可维护性
            多态性（polymorphism）
                不同的对象收到同一个消息（调用方法）可产生完全不同的效果
                实现的细节则由接收对象自行决定


        面向对象设计思想的要点
            认为客观世界由各种对象组成
            程序的分析和设计都围绕着
                有哪些对象类
                每个类有哪些属性、哪些方法
                类之间的关系（继承、关联等）
                对象之间发送消息（调用方法）
     */

    // 访问修饰符 关键字 返回类型 方法名 （String类 字符串数组）
    public static void main(String[] args) {
//        声明：存在栈中，类型、地址、大小
        AIntroduce ai;

//        new一个对象，实例化：存在堆中
//        Aintroduce对象
        ai = new AIntroduce();
        System.out.println("");
    }
}
