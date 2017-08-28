package com.samples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class BeanLifeCycleSample {
    static public void test() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.BeanLifeCycle.xml");

        ExampleBean obj = (ExampleBean) context.getBean("exampleBean");
        obj.setMessage("bean life cycle");
        System.out.println(obj.getMessage());
        /* Here you need to register a shutdown hook registerShutdownHook() method that is declared on the AbstractApplicationContext class.
        This will ensure a graceful shutdown and call the relevant destroy methods. */
        context.registerShutdownHook();
    }
    public static void main(String[] args) {
        test();
    }
}
