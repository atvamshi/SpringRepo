package org.spring.learn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Project: learn-spring
 * Package: org.spring.learn.aop
 * <p>
 * User: vthalapu
 * Date: 1/13/18
 * Time: 11:39 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Aspect
@Component
public class TestAspect {

    @Before("execution(* vamsiTest (..))")
    public void testAspect(){
        System.out.println("Test Ascpect");
    }
}
