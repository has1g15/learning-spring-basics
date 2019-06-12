package com.hashort.springAOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinpointConfig {

    @Pointcut("execution(* com.hashort.springAOP.business.*.*(..))")
    public void businessLayerExecution() {

    }

    @Pointcut("execution(* com.hashort.springAOP.data.*.*(..))")
    public void dataLayerExecution() {

    }

    @Pointcut("com.hashort.springAOP.aspect.CommonJoinpointConfig.businessLayerExecution() &&" +
            "com.hashort.springAOP.aspect.CommonJoinpointConfig.dataLayerExecution()")
    public void allLayerExecution() {

    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDAO() {

    }

    @Pointcut("within(com.hashort.springAOP.business..*)")
    public void businessLayerExecutionUsingWithin() {

    }

    @Pointcut("@annotation(com.hashort.springAOP.aspect.TrackTime)")
    public void trackTimeAnnotation() {

    }
}
