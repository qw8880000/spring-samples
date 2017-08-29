package com.samples.AopXmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-29.
 */
public class AopXmlBasedSample {

    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.AopXmlBased.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
    }

    public static void main(String[] args) {
        test();
    }
}
