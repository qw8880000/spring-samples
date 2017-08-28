package com.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017-08-28.
 */
public class BeanScopeSingletonSample {
    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.BeanScopeSingleton.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();

    }

    public static void main(String[] args) {
        test();
    }
}
