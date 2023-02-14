package d8annotation;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/14 14:17
 */
public class AIntroduce implements YDemo{
    /**
     *注解的使用：
     * 1. 理解Annotation
     * 1）jdk5.0 新增的功能
     * 2）Annotation 其实就是代码里的特殊标记，这些标记可以再编译，类加载，运行时被读取，并执行响应的处理。通过
     * 使用Annotation，程序员可以再不改变原有逻辑的情况下，在源文件中嵌入一些补充信息。
     * 3）在Java中，注解的使用母的比较简单，例如标记过时的功能，忽略警告等。在Java EE/Android中注解占据了更重要的角色，例如
     * 用来配置应用程序的任何切面，代替javaEE旧版中所遗留的繁冗代码和XML配置等。
     *  未来开发都是基于注解的，可以一定程度上说：框架=注解+反射+设计模式
     *
     * 2. Annotation的使用示例
     * 示例一：生成文档相关的注解
     * 示例二：在编译时进行格式检查（JDK内置的三个基本注解）
     * @Override：限定重写父类方法，该注解只能用于方法
     * @Deprecated: 用于表示所修饰的元素（类，方法）已过时。通常是因为所修饰的结构危险或存在更好的选择
     * @SuppressWarning: 抑制编译器警告
     *
     * 示例三：跟踪代码依赖性，实现替代配置文件功能
     *
     * 3. 如何自定义注解：参照SuppressWarnings
     * 1)注解声明为：@interface
     * 2）内部定义成员，通常使用value表示
     * 3）可以指定成员的默认值，使用default定义
     * 4）如果自定义注解没有成员，表明是一个标识作用
     *
     * 如果注解有成员，在使用注解时，需要指明成员的值
     */

    @Deprecated  // Date使用较多
    @Override
    public void walk() {
        Date date = new Date(2011,9,1); // 已过时
        @SuppressWarnings("unused")
        int num = 0; // 没有使用num，但编译器没有置灰

        @SuppressWarnings({"unused","rawtypes"})
        ArrayList a1 = new ArrayList(); // 看起来就干净些了
    }

    @Override
    public void eat() {

    }
}
