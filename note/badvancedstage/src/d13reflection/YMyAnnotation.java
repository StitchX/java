package d13reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author Eva   Email:
 * @Description
 *
 * @data 2023/7/18 15:55
 */

@Target(value = {FIELD,TYPE,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface YMyAnnotation {
    String[] value() default "hello";
}
