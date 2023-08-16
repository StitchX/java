package d14java8;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author Eva   Email:
 * @Description
 *      方法的引用：
 *      1. 使用情景：当要传递给lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *      2. 方法引用，本质上就是lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 *      方法的引用，也就是函数式接口的实例
 *      3. 使用格式：    类（或对象） :: 方法名
 *      4. 具体分为如下的三种情况
 *          对象 :: 非静态方法
 *          类   :: 静态方法
 *          类   :: 非静态方法
 *
 * @data 2023/8/16 9:58
 */
public class DMethodRefTest {

//    情况一：对象 :: 实例方法
//    Consumer中的void accept(T t)
//    PrintStream中的void println(T t)
    @Test
    public void test01(){
        Consumer<String> con01 = str -> System.out.println(str);
        con01.accept("beijing");
        System.out.println("******************");
    }

//    Supplier中的T get()
//    Employee中的String getName()
    @Test
    public void test02(){

    }


    @Test
    public void test03(){

    }


    @Test
    public void test04(){

    }
}
