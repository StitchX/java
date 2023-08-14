package d15java9.d14java8;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/8/10 15:27
 */
public class BLambda {
    /*
    Lambda 是一个匿名函数，我们可以把 Lambda 表达式理解为是一段可以传递的代码(将代码像数据一
    样进行传递)。使用它可以写出更简洁、更灵活的代码。作为一种更紧凑的代码风格，使Java的语言表达
    能力得到了提升。
     */
    @Test
    public void test01(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱背景天安门");
            }
        };
        r1.run();
        System.out.println("******************");

        Runnable r2 = () -> System.out.println("我爱故宫");
        r2.run();
    }

    @Test
    public void test02(){
        Comparator<Integer> com01 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int compare1 = com01.compare(122,21);
        System.out.println(compare1);

        System.out.println("**************************");

//        Lambda表达式的写法
        Comparator<Integer> com02 = (o1,o2) -> Integer.compare(o1,o2);

        int compare2 = com02.compare(32,12);
        System.out.println(compare2);

        System.out.println("________________________________");

        Comparator<Integer> com03 = Integer::compare;

        int compare3 = com03.compare(32,31);
        System.out.println(compare3);

    }

}
