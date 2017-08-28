package com.samples.DIConstructorBase;

/**
 * Created by Administrator on 2017-08-28.
 */

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
        System.out.println("TextEditor's spellChecker is set");
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
