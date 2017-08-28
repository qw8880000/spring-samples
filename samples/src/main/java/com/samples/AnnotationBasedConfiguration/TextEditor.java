package com.samples.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017-08-28.
 */

public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
        System.out.println("TextEditor's spellChecker is set");
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
