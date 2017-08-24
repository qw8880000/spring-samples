package com.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-24.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContextSample.test();
        BeanFactorySample.test();
    }
}
