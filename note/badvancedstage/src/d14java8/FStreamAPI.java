package d14java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Eva   Email:
 * @Description
 *
 * 1. Stream关注的是对数据的运算，与CPU打交道
 *    集合关注的是数据的存储，与内存打交道
 * 2.
 *  1)Stream自己不会存储元素。
 *  2)Stream不会改变源对象。相反，他们会返回一个持有结果的新stream。
 *  3)Stream操作是延迟执行的。这意味着他们会等到要结果的时候才执行
 *
 * 3. Stream执行流程
 *  1)Stream的实例化
 *  2)一系列的中间操作(过滤、映射、...)
 *  3)终止操作
 * 4.说明:
 *  4.1 一个中间操作链，对数据源的数据进行处理
 *  4.2一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 *
 *  测试Stream API的实例化
 * @data 2023/8/18 14:24
 */
public class FStreamAPI {
//    创建Stream方式一：通过集合
    @Test
    public void test01(){
        List<YDemo02> employees = YDemo01.getEmployees();
//        default Stream<E> stream()：返回一个顺序流
        Stream<YDemo02> stream = employees.stream();
//        default Stream<E> parallelStream()：返回一个并行流
        Stream<YDemo02> parallelStream = employees.parallelStream();
    }

//    创建Stream方式二：通过数组
    @Test
    public void test02(){
        int[] arr = new int[]{1,2,3,4,5};
//        调用Arrays类的static <T> Stream<T> stream(T[] array)：返回一个流
        IntStream stream = Arrays.stream(arr);

        YDemo02 y1 = new YDemo02(1001,"Tom");
        YDemo02 y2 = new YDemo02(1001,"Tom");
        YDemo02[] arr1 = new YDemo02[]{y1,y2};
        Stream<YDemo02> s1 = Arrays.stream(arr1);
    }
//    创建Stream方式三: 通过stream的of()
    @Test
    public void test03(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);
    }

//    创建Stream方式四：创建无限流
    @Test
    public void test04(){
//        迭代
//        public static<T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
//        遍历前十个偶数
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);


//        生成
//        public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

    }
}
