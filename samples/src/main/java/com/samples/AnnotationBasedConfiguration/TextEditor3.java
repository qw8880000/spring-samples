package com.samples.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017-08-28.
 */
public class TextEditor3 {

    private SpellChecker spellChecker;
    @Autowired
    public TextEditor3(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
