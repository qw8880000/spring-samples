package com.samples.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class AnnotationAutowiredSample {

    // @Autowired on Setter Methods
    static public void setterAutowiredTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.AnnotationAutowired.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }

    // @Autowired on Properties
    static public void propertiesAutowiredTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.AnnotationAutowired.xml");

        TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
        te.spellCheck();
    }

    // @Autowired on Constructors
    static public void constructorsAutowiredTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.AnnotationAutowired.xml");

        TextEditor3 te = (TextEditor3) context.getBean("textEditor3");
        te.spellCheck();
    }

    public static void main(String[] args) {
        setterAutowiredTest();
        propertiesAutowiredTest();
        constructorsAutowiredTest();
    }
}
