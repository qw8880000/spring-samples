package com.samples.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017-08-29.
 */
public class JavaBaseConfigSample {

    static public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = context.getBean(TextEditor.class);
        te.spellCheck();
    }

    public static void main(String[] args) {
        test();
    }
}
