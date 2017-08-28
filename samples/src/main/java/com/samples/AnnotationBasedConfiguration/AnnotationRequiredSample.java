package com.samples.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class AnnotationRequiredSample {
    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.AnnotationRequired.xml");

        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
    public static void main(String[] args) {
        test();
    }
}
