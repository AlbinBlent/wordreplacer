package com.wordreplacer;

import java.util.List;

/**
 * Created by albinblent on 2016-04-07.
 */
public class Wordreplacer {

    IRules _rules;

    public Wordreplacer(IRules rules){
        _rules = rules;
    }

    public String replace(String textToBeReplaced){

        List<IRule> rules = _rules.getAllRules();
        String resultText = "";
        for (IRule rule : rules) {
            resultText = textToBeReplaced.replace(rule.getWordToReplace(), rule.getReplacementWord());
            textToBeReplaced = resultText;
        }

        return resultText;
    }
}
