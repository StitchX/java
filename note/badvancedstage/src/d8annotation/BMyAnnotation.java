package d8annotation;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/14 14:51
 */
/*
3. 如何自定义注解：参照SuppressWarnings
     * 1)注解声明为：@interface
     * 2）内部定义成员，通常使用value表示
     * 3）可以指定成员的默认值，使用default定义
     * 4）如果自定义注解没有成员，表明是一个标识作用
     *
     * 如果注解有成员，在使用注解时，需要指明成员的值
     * 自定义注解必须配上注解的信息处理流程（使用反射）才有意义
 */
public @interface BMyAnnotation{
    String[] value() ;
//    String[] value() default "hello";
}

@BMyAnnotation("hi")
@CMeta
class Use{

}
