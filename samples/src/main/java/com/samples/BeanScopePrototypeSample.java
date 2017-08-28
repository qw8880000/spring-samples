package com.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class BeanScopePrototypeSample {
    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.BeanScopePrototype.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        System.out.println(objA.getMessage());

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println(objB.getMessage());

    }

    public static void main(String[] args) {
        test();
    }
}
