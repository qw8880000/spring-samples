package com.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-24.
 */
public class ApplicationContextSample {

    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
    }

    public static void main(String[] args) {
        test();
    }
}
