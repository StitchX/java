package cn.ch08;

/*
既然集合是常见的任务，何不抽取出来
List<Integer> nums = Arrays.asList(1,2,3);
nums. stream()
    .forEach(x->{System.out.println(x);});
将常见的集合上的操作抽取出来，并能连续地进行操作
从Java8开始，提供了“流(stream)”操作

 */
/*
The new java.util.stream package provides utilities "to support
functional-style operations on streams of values“
支持在流上的函数式风格的操作
得到流
    Stream<T> stream = collection.stream();
操作流
    int sumOfWeights = blocks.stream()
    .filter(b -> b.getColor() == RED)
    .mapToInt(b -> b.getWeight())
    .sum();
 */

/*
示例：数组进行流化
Arrays.stream(a)
    .filter( i -> i>20 )
    .map( i -> i*i )   // 函数式
    .sorted()
    .distinct()
    .limit(10)
    .max();

再如
Collection People = …;
    people.stream()
        .filter( p -> p.age>20 )
        .sorted( Comparator.comparing( Person::getName ) )
        .limit(5)
        .mapToDouble( p -> p.score )
        .average()

流畅的表达   // 没有很多for循环
    myOrders.stream()
        .filter( t -> t.getBuyer().getAge()>65 )
        .map( t -> t.getSeller() )
        .distinct()
        .sort(Compator.comparing(s->s.getName() )
        .forEach(s -> System.out.println(s.getName());
可以说：Lambda实现了函数式编程
是一种全新的思考问题的方法

 */

/*
stream的操作种类
• 流操作分成两类
中间的 -中间的操作保持流打开状态，并允许后续的操作。
• 如： filter sorted limit map
末端的 - 末端的操作必须是对流的最终操作。
• 如： max min count forEach findAny

流操作的步骤
• 流涉及了这些步骤：
从某个源头获得一个流。
执行一个或更多的中间的操作。
执行一个末端的操作。


• 对于数组
Arrays.stream(ary)
• 对于collection (包括List)
用 list.stream()
• 对于Map
没有流，但提供了类似的方法
• 如map.putIfAbsent
• map.computeIfPresent
• map.merge


Stream的子接口
• DoubleStream,
• IntStream,
• LongStream,
• Stream<T>


流的并行计算
• 只需将.stream()
• 换成 . parallelStream()
• 其他都不变，就可以实现并行计算

• stream就是为并行运算而生的


并行的流式操作
• 例：UseParallelStream.java
• List<Integer> a = Arrays.asList(1,2,5,7,3);
• System.out.println(
• a.parallelStream()
• .mapToInt(i->(int)i)
• .filter( i -> i>2 )
• .map( i -> i*i )
• .sorted()
• .distinct()
• .limit(10)
• .max()
• );


中间的操作
• filter - 排除所有与断言不匹配的元素。
• map - 通过Function对元素执行一对一的转换。
• flatMap - 通过FlatMapper将每个元素转变为无或更多的元素。
• peek - 对每个遇到的元素执行一些操作。主要对调试很有用。
• distinct - 根据.equals行为排除所有重复的元素。这是一个有状态的操作。
• sorted - 确保流中的元素在后续的操作中，按照比较器（Comparator）决定的顺序访问。这是
一个有状态的操作。
• limit - 保证后续的操作所能看到的最大数量的元素。
• substream - 确保后续的操作只能看到一个范围的（根据index）元素。
• skip- 忽略一些元素
• mapToDouble mapToInt mapToLong 类型转换



末端的操作
• forEach - 对流中的每个元素执行一些操作。
• toArray - 将流中的元素倾倒入一个数组。
• min - 根据一个比较器找到流中元素的最小值。
• max -根据一个比较器找到流中元素的最大值。
• count - 计算流中元素的数量。
• anyMatch - 判断流中是否至少有一个元素匹配断言。这是一个短路的操作。
• allMatch - 判断流中是否每一个元素都匹配断言。这是一个短路的操作。
• noneMatch - 判断流中是否没有一个元素匹配断言。这是一个短路的操作。
• findFirst - 查找流中的第一个元素。这是一个短路的操作。
• findAny - 查找流中的任意元素，可能对某些流要比findFirst代价低。这是一个短路的操作。
• 注：子接口还有更多的操作，如 average等等

 */
public class E_stream {
}
