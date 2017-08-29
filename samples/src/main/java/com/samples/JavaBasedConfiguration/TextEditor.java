package com.samples.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017-08-28.
 */

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
