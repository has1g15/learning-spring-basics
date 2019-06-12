package com.hashort.springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value="execution(* com.hashort.springAOP..*.*(..))",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    /*@AfterThrowing(
            value="execution(* com.hashort.springAOP.business.*.*(..))",
            throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Object exception) {
        logger.info("{} threw exception {}", joinPoint, exception);
    }*/

    @After(value="execution(* com.hashort.springAOP..*.*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }
}

