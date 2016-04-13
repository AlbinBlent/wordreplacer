package com.wordreplacer;

/**
 * Created by albinblent on 2016-04-08.
 */
public class Rule implements IRule{
    String _wordToReplace;
    String _replacementWord;

    public Rule(String wordToReplace, String replacementWord){
        this._wordToReplace = wordToReplace;
        this._replacementWord = replacementWord;
    }
    public void setWordToReplace(String wordToReplace) {
        _wordToReplace = wordToReplace;
    }

    public String getWordToReplace() {
        return _wordToReplace;
    }

    public void setReplacementWord(String replacementWord) {
        _replacementWord = replacementWord;
    }

    public String getReplacementWord() {
        return _replacementWord;
    }
}
