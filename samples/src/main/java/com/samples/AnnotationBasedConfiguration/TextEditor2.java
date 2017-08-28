package com.samples.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017-08-28.
 */
public class TextEditor2 {
    @Autowired
    private SpellChecker spellChecker;
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
