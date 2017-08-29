package com.samples.AopAspectJBased;

import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2017-08-29.
 */
@Aspect
public class Logging {

    /** Following is the definition for a pointcut to select
     *  all the methods available. So advice will be called
     *  for all the methods.
     */
    @Pointcut("execution(* com.samples.AopAspectJBased.*.*(..))")
    private void selectAll(){}
    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("------------------- beforeAdvice.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("------------------- afterAdvice.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(pointcut = "selectAll()", returning="retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("---------------- afterReturningAdvice:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("------------------ AfterThrowingAdvice: " + ex.toString());
    }
}
