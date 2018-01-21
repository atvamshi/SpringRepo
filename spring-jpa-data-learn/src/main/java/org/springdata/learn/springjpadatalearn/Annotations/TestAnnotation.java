package org.springdata.learn.springjpadatalearn.Annotations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project: learn-spring-parent
 * Package: org.springdata.learn.springjpadatalearn.Annotations
 * <p>
 * User: vthalapu
 * Date: 1/16/18
 * Time: 10:41 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface PhoneAnnotation {
    String os() default "Android";
    int verion() default 0;
}

interface TestAnnoInterface{

}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@PhoneAnnotation(os="Xeia",verion=1)
//@PhoneAnnotation()
class UseAnnotation implements TestAnnoInterface{
    @JsonProperty
    int verion;

    @JsonProperty
    String os;




}

public class TestAnnotation {
    private static final Logger logger = LoggerFactory.getLogger(TestAnnotation.class);
    private static final String lineSeparator = System.getProperty("line.separator");

    static public void main(String...args){
        TestAnnoInterface testAnnoInterface = new UseAnnotation();
        UseAnnotation useAnnotation = new UseAnnotation();

        logger.info(lineSeparator + "Printing default values for phone -> " + useAnnotation.getOs());
        logger.info(lineSeparator + "Printing default values for phone -> " + useAnnotation.getVerion());
        Class reflectionApi = testAnnoInterface.getClass();
        Annotation testAnnotationVar = reflectionApi.getAnnotation(PhoneAnnotation.class);
        PhoneAnnotation phoneAnnotation = (PhoneAnnotation)testAnnotationVar;
        System.out.println(phoneAnnotation.toString());
    }

}


