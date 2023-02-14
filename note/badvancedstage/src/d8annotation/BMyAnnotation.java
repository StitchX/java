package d8annotation;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/14 14:51
 */
public @interface BMyAnnotation{
    String[] value() ;
//    String[] value() default "hello";
}

@BMyAnnotation("hi")
class Use{

}
