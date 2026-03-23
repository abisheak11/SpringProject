package com.springcore.aop1;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Log4j2
public class DetailProcess {
    @Before("pointcut()")
    public void getDetailProcess(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        Object[] arr = joinPoint.getArgs();
        log.info("Method:{} and arguments:{}", method, arr[1]);
    }

    @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void getDetails(JoinPoint joinPoint, Object result) {
        String method1 = joinPoint.getSignature().getName();
        //Object[]arr= joinPoint.getArgs();
        log.info("After returning Advice example:{},:{}", method1, result);
    }

    @Around("pointcut()")
    public void getDetails1(ProceedingJoinPoint joinPoint) throws Throwable {
        String method = joinPoint.getSignature().getName();
        Object[] arr = joinPoint.getArgs();
        log.info("Before advices:{}:{}", method, arr[0]);
        Object result = joinPoint.proceed();
        log.info("After advices:{}:{}", method, result);
    }

    @Pointcut("execution(*  com.springcore.aop1.Student.getDetail(..))")
    public void pointcut() {

    }
}
