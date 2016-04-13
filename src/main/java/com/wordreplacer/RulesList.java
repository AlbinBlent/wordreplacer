package com.wordreplacer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albinblent on 2016-04-08.
 */
public class RulesList implements IRules {

    List<IRule> _rules = new ArrayList<IRule>();

    public void addRule(IRule rule) {
        _rules.add(rule);
    }

    public List<IRule> getAllRules() {
        return _rules;
    }
}
