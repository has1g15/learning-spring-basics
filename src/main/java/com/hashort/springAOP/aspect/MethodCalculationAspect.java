package com.hashort.springAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.hashort.springAOP.aspect.CommonJoinpointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}", joinPoint, timeTaken);
    }
}
