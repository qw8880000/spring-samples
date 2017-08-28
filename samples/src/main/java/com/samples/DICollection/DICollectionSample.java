package com.samples.DICollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017-08-28.
 */
public class DICollectionSample {
    static public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.DICollection.xml");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
    public static void main(String[] args) {
        test();
    }
}
