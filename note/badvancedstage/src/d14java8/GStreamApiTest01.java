package d14java8;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Eva   Email:
 * @Description  p679
 * @data 2023/9/18 14:28
 */
public class GStreamApiTest01 {
//    1、筛选与切片
    @Test
    public void test01(){
        List<YDemo02> list = YDemo01.getEmployees();
//        filter(Predicate p) -- 接收Lambda,从流中排除某些元素
        Stream<YDemo02> stream = list.stream();
//       练习：查询员工表中薪资大于7000的员工信息
        stream.filter(e -> e.getSalary()>7000).forEach(System.out::println);
        System.out.println();

//        limit(n)---截断流，使其元素不超过给定数量。
        list.stream().limit(3).forEach(System.out::println);
        System.out.println();

//        skip(n) -- 跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)互补
        list.stream().limit(3).forEach(System.out::println);

        System.out.println();

//        distinct()--筛选，通过流所生成的 hashCode() 和 equals() 去除重复元素
        list.add(new YDemo02(1010,"刘强东",40,9000));
        list.add(new YDemo02(1010,"刘强东",40,9000));
        list.add(new YDemo02(1010,"刘强东",40,9000));
        list.add(new YDemo02(1010,"刘强东",40,9000));

        list.stream().distinct().forEach(System.out::println);
    }
}
