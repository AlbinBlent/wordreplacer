package com.wordreplacer;

import java.util.List;

/**
 * Created by albinblent on 2016-04-08.
 */
public interface IRules {
    public void addRule(IRule rule);
    public List<IRule> getAllRules();
}
