package com.samples;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017-08-24.
 */
public class BeanFactorySample {

    static public void test() {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Beans.xml"));

        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
    }
}
