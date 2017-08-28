package com.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class BeanPostProcessorSample {
    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.BeanPostProcessor.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        ExampleBean objB = (ExampleBean) context.getBean("exampleBean");
    }

    public static void main(String[] args) {
        test();
    }
}
