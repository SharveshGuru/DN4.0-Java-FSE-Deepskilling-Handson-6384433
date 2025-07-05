package com.example.librarymanagement.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.example.librarymanagement.service.*.*(..)) || " +
            "execution(* com.example.librarymanagement.repository.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(String.format("Entering %s.%s()", className, methodName));
        
        try {
            Object result = joinPoint.proceed();
            
            long executionTime = System.currentTimeMillis() - startTime;
            System.out.println(String.format(
                "Exiting %s.%s() - execution time: %d ms", 
                className, methodName, executionTime));
            
            return result;
        } catch (Exception e) {
            long executionTime = System.currentTimeMillis() - startTime;
            System.out.println(String.format(
                "Exception in %s.%s() - execution time: %d ms - Exception: %s", 
                className, methodName, executionTime, e.getMessage()));
            throw e;
        }
    }
}
