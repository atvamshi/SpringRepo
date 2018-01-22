package org.spring.learn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    /*==>*/
//    @Before("allMethodVamsiPointCut()")
//    public void testAspect(){
//        System.out.println("Test Ascpect");
//    }
//
//    @Pointcut("execution(* vamsiTest (..))")
//    public void allMethodVamsiPointCut(){
//
//    }
    /*==>*/

    /*==>*/
//    @Before("allLoggerPointCut()")
//    public void loggingAspect(){
//        System.out.println("Pointcut with Advice");
//    }
//
//
//    @Pointcut("within(org.spring.learn..*)")
//    public void allLoggerPointCut(){
//
//    }
    /*==>*/

    /*==>*/
    @Before("allLoggerPointCut()")
    public void loggingBeforeAspect(JoinPoint jointPoint) {
        String lineSeparator = System.getProperty("line.separator");
        Logger logger = LoggerFactory.getLogger(jointPoint.getThis().getClass());
        logger.info(lineSeparator + " *****Start method*****" + jointPoint.toString());
    }

    @After("allLoggerPointCut()")
    public void loggingAfterAspect(JoinPoint jointPoint) {
        String lineSeparator = System.getProperty("line.separator");
        Logger logger = LoggerFactory.getLogger(jointPoint.getThis().getClass());
        logger.info(lineSeparator + " *****End method *****" + jointPoint.toString());
    }

    @Pointcut("within(org.spring.learn..*)")
    public void allLoggerPointCut() {

    }

    //inline
//    @Before(Pointcut("args(name))",retu="returnString")
//    @AfterReturning(Pointcut="")
//    public void inlineAdvice(){
//
//    }

//    @AfterReturning
//    @AfterThrowing

    /*==>*/

    @Around("allLoggerAroundPointCut()")
    public void loggingAroundAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String lineSeparator = System.getProperty("line.separator");
        Logger logger = LoggerFactory.getLogger(proceedingJoinPoint.getThis().getClass());
        logger.info(lineSeparator + " *****Start method*****" + proceedingJoinPoint.toString());
        proceedingJoinPoint.proceed();
        logger.info(lineSeparator + " *****End method *****" + proceedingJoinPoint.toString());

    }

    @Pointcut("within(org.spring.fjbhj.learn..*)")
    public void allLoggerAroundPointCut() {

    }
}
