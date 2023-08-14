package d15java9.d14java8;

/**
 * @author Eva   Email:
 * @Description
 * 只包含一个抽象方法的接口，称为函数式接口
 *
 * java内置的4大核心函数式接口
 *  消费型接口 Consumer<T>      void accept(T t)
 *  供给型接口 Supplier<T>      T get()
 *  函数型接口 Function<T,R>    R apply(T t)
 *  断定型接口 Predicate<T>     boolean test(T t)
 * @data 2023/8/14 10:55
 */
@FunctionalInterface
public interface CDemo {
    void method1();
//    void method2();
}
