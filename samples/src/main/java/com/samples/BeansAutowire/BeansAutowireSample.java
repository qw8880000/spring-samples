package com.samples.BeansAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class BeansAutowireSample {
    static public void autowireByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.BeansAutowireByName.xml");

        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.spellCheck();
    }

    public static void main(String[] args) {
        autowireByName();
    }
}
