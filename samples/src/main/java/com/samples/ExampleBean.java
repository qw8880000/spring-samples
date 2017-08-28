package com.samples;

/**
 * Created by Administrator on 2017-08-28.
 */
public class ExampleBean {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public String getMessage(){
        return message;
    }
    public void init() {
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
