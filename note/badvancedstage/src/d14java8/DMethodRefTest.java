package d14java8;

import d9collection.exercise.Employee;
import d9collection.exercise.MyDate;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Eva   Email:
 * @Description
 *      方法的引用：
 *      1. 使用情景：当要传递给lambda体的操作，已经有实现的方法了，可以使用方法引用！
 *      2. 方法引用，本质上就是lambda表达式，而Lambda表达式作为函数式接口的实例。所以
 *      方法的引用，也就是函数式接口的实例
 *      3. 使用格式：    类（或对象） :: 方法名
 *      4. 具体分为如下的三种情况
 *          情况一      对象 :: 非静态方法
 *          情况二      类   :: 静态方法
 *          情况三      类   :: 非静态方法
 *      5. 方法引用使用的要求：要求接口中的抽象方法的形参列表和返回值类型与方法引用的
 *      方法的形参列表和返回值类型相同!（针对情况1和情况2）
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

        PrintStream ps = System.out;
        Consumer<String> con02 = ps::println;
        con02.accept("beijing");
    }

//    Supplier中的T get()
//    Employee中的String getName()
    @Test
    public void test02(){
//        该下面的Employee使用的其他包下的，因为不想新写一个
        Employee employee = new Employee("tom",12, new MyDate(1990,9,12));
        Supplier<String> sup01 = () -> employee.getName();
        System.out.println("*********************");
        Supplier<String> sup02 = employee::getName;
        System.out.println(sup02.get());

    }


//    情况二：类   :: 静态方法
//    Comparator中的int compare(T t1,T t2)
//    Integer中的int compare(T t1,T t2)
    @Test
    public void test03(){
        Comparator<Integer> com01 = (t1,t2) ->Integer.compare(t1,t2);
        System.out.println(com01.compare(1,2));
        System.out.println("*************");
        Comparator<Integer> com02 =Integer::compare;
        System.out.println(com02.compare(1,2));
    }


//    Function中的R apply(T t)
//    Math中的Long round(Double d)
    @Test
    public void test04(){
        Function<Double, Long> func01 = d -> Math.round(d);
        System.out.println(func01.apply(11.6));
        System.out.println("************************");

        Function<Double, Long> func02 = Math::round;
        System.out.println(func02.apply(12.6));

    }

//    情况三：类   :: 实例方法（有难度）
//    Comparator中的int compare(T t1,T t2)
//    String中的int t1.compare(t2)
    @Test
    public void test05(){
        Comparator<String> com01 = (s1,s2) ->s1.compareTo(s2);
        System.out.println(com01.compare("asd","ew"));
        System.out.println("********************");
        Comparator<String> com02 = String::compareTo;
        System.out.println(com02.compare("asd","ew"));
    }

//    BiPredicate中的boolean test(T t1,T t2)
//    String中的int t1.compareTo(t2)
    @Test
    public void test06(){
        BiPredicate<String,String> pre01 = (s1,s2) -> s1.equals(s2);
        System.out.println(pre01.test("q","avd"));
        System.out.println("**********************");
        BiPredicate<String,String> pre02 = String :: equals;
        System.out.println(pre02.test("we","f"));
    }

//    Function中的 R apply(T t)
//    Employee中的String getName();
    @Test
    public void test07(){
        Employee employee = new Employee("tom",12, new MyDate(1990,9,12));
        Function<Employee,String> function01 = e ->e.getName();
        System.out.println(function01.apply(employee));
        System.out.println("************************");
        Function<Employee,String> function02 = Employee::getName;
        System.out.println(function02.apply(employee));
    }
}
