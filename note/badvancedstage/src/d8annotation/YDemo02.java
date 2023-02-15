package d8annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/2/15 11:00
 */
@Target(value = {FIELD,TYPE,TYPE_PARAMETER,TYPE_USE})
public @interface YDemo02 {
    DAnnotation8[] value();
}
