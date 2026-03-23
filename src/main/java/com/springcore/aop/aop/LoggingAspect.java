package com.springcore.aop.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class LoggingAspect {
    // @Before("pointcut()")
    public void logBeforeGetPassenger(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("before executing method :{}with arguments:{}", methodName, args[0]);
    }

    // @After("pointcut()")
    public void getPassengerDetail(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("After executing method :{}with arguments:{}", methodName, args[1]);
    }

   // @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void getPassengerDetail1(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        log.info("After executing method without any exception :{},result:{}", methodName, result);
    }

    //@AfterThrowing(pointcut = "pointcut()",throwing = "exception")
    public void getPassengerDetail2(JoinPoint joinPoint, Throwable exception) {
        String methodName = joinPoint.getSignature().getName();
        log.info("After executing method with exception :{},result:{}", methodName, exception.getMessage());
    }

     @Around("pointcut()")
    public void getPassengerDetail3(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("After executing method  :{}with arguments:{}", methodName, args[0]);
        Object result = joinPoint.proceed();
        log.info("Before executing method  :{}with arguments:{}", methodName, args[1]);
    }

    @Pointcut("execution(* com.springcore.aop.PassengerDAO.getPassenger(..))")
    public void pointcut() {
    }
}
