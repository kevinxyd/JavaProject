package top10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只作用在类和接口上
@Target(ElementType.TYPE)
//源码和字节码
@Retention(RetentionPolicy.CLASS)
public @interface MyAnno1 {

}
