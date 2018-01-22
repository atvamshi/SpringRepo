package org.springdata.learn.springjpadatalearn.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Project: org.learnspring.parent
 * Package: org.springdata.learn.springjpadatalearn.aspects
 * <p>
 * User: vthalapu
 * Date: 1/21/18
 * Time: 7:42 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component
@Aspect
public class LoggingAspect {


    @Before("loggingPointCut()")
    public void beforeAllMethodsAdvice(JoinPoint joinPoint) {
        Log logger = LogFactory.getLog(joinPoint.getClass());
        logger.debug("\n Method Start" + joinPoint.toString());
    }

    @After("loggingPointCut()")
    public void afterAllMethodsAdvice(JoinPoint joinPoint) {
        Log logger = LogFactory.getLog(joinPoint.getClass());
        logger.debug("\n Method End" + joinPoint.toString());
    }

    @Pointcut("within(org.springdata.learn.springjpadatalearn..*)")
    public void loggingPointCut() {
    }


}
