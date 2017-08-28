package com.samples.DISetterBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class DISetterBaseSample {

    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.DISetterBase.xml");

        TextEditor te = (TextEditor)context.getBean("textEditor");
        te.spellCheck();
    }
    public static void main(String[] args) {
        test();
    }
}
