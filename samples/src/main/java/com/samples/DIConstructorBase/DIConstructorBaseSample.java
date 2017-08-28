package com.samples.DIConstructorBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class DIConstructorBaseSample {

    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.DIConstructorBase.xml");

        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.spellCheck();
    }
    public static void main(String[] args) {
        test();
    }
}
