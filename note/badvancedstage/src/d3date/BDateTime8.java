package d3date;

/**
 * @author Eva   Email:
 * @Description jdk 8中新日期时间API
 * @data 2023/2/9 16:18
 */
public class BDateTime8 {
    /*
    Calendar和Date的问题：
    1、可变性：像日期和时间这样的类应该是不可变的
    2、偏移性：Date中年份是会加上1900，月份从0开始算
    3、格式化：格式化只对Date有用，Calendar则不行
    此外，它们也不是线程安全的：不能处理闰秒

    总结：对日期和时间的操作一直是Java程序员最痛苦的地方之一
     */
    /*
    第三次引入API是成功的，并且java 8中引入的java.time API已经纠正了过去的缺陷，将来很长一段时间它都会为我们服务
    Java 8 吸收了Joda-Time的精华
    新日期的API：
    java.time
    java.time.chrono
    java.time.format
    java.time.temporal
    java.time.zone

    说明：大多数开发者只会用到基础包format包，也可能会用到temporat包，因此，尽管有69个新公开类型，
        大多数开发者，大概将指挥用到其中的三分之一
     */
}
