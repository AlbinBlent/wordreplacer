package com.wordreplacer;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

/**
 * Created by albinblent on 2016-04-07.
 */
public class WordreplacerTest {

    Wordreplacer _wordreplacer;

    @Before
    public void setUp() throws Exception {
        RulesList rulesList = new RulesList();
        rulesList.addRule(new Rule("Företaget", "Forefront"));
        rulesList.addRule(new Rule("annorlunda", "tvärtom"));
        RulesList mockRulesList = Mockito.mock(RulesList.class);

        _wordreplacer = new Wordreplacer(rulesList);
    }

    @Test
    public void testReplaceText() throws Exception {
        String result = _wordreplacer.replace("Företaget är fint. Det är annorlunda att tycka annat.");
        Assert.assertEquals("Forefront är fint. Det är tvärtom att tycka annat.", result);
    }
}