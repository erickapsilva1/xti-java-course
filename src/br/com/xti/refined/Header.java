package br.com.xti.refined;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface Header {
    String company();
    String project();
    String creationDate();
    String creator();
    int revision() default 1;
}
