package parttretonAnnotations;

import java.lang.annotation.*;

public class AnnotaitonDemo {
    public static void main(String[] args) {

    }
}

class NokiaSeries {
    String model;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
@Inherited//if we want to use child classes
@Documented//to use documentation
@Target(ElementType.TYPE)//att which place we are going to use this annotation
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String os() default "biniam";
    int version() default 1;
}