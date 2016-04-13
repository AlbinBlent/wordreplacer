package com.wordreplacer;

/**
 * Created by albinblent on 2016-04-08.
 */
public interface IRule {
    public void setWordToReplace(String wordToReplace);
    public String getWordToReplace();
    public void setReplacementWord(String replacementWord);
    public String getReplacementWord();
}
