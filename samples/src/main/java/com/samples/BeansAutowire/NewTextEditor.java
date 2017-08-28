package com.samples.BeansAutowire;

/**
 * Created by Administrator on 2017-08-28.
 */
public class NewTextEditor {
    private SpellChecker spellChecker;
    private String name;

    public NewTextEditor( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
