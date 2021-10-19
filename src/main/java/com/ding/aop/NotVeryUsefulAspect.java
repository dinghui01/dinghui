package com.ding.aop;

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
 * Created  by DHui on 2021/10/17.
 */
@Component
@Aspect
public class NotVeryUsefulAspect {
    Logger logger = LoggerFactory.getLogger(NotVeryUsefulAspect.class);

    @Pointcut("execution(* com.ding.service..*.*(..))")
    public void anyOldTransfer(){

    }

    @Before("anyOldTransfer()")
    public void befor(){
        logger.info("Aspect befor method......");
    }


    @After("anyOldTransfer()")
    public void after(){
        logger.info("Aspect after method......");
    }

    @Around("anyOldTransfer()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("Aspect around start method......");
        Object retVal = pjp.proceed();
        logger.info("Aspect around end method......");
        return retVal;
    }
}
