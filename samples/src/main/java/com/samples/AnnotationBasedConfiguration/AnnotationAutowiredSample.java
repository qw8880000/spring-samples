package com.samples.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class AnnotationAutowiredSample {
    static public void setterAutowiredTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.AnnotationAutowired.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
    public static void main(String[] args) {
        setterAutowiredTest();
    }
}