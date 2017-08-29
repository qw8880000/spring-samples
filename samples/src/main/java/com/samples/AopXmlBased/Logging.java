package com.samples.AopXmlBased;

/**
 * Created by Administrator on 2017-08-29.
 */
public class Logging {
    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    public void beforeAdvice(){
        System.out.println("------------------- beforeAdvice.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        System.out.println("------------------- afterAdvice.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    public void afterReturningAdvice(Object retVal){
        System.out.println("---------------- afterReturningAdvice:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("------------------ AfterThrowingAdvice: " + ex.toString());
    }
}
