package com.wordreplacer.runner;

import com.wordreplacer.Rule;
import com.wordreplacer.RulesList;
import com.wordreplacer.Wordreplacer;
import com.wordreplacer.filereader.TextFileReader;

/**
 * Created by albinblent on 2016-04-11.
 */
public class Runner {
    public static void main(String[] args){
        RulesList rulesList = new RulesList();
        rulesList.addRule(new Rule("Företaget", "Forefront"));
        rulesList.addRule(new Rule("applikationerna", "systemen"));
        rulesList.addRule(new Rule("annorlunda", "tvärtom"));
        rulesList.addRule(new Rule("bra", "flexibla"));
        rulesList.addRule(new Rule("offshore", "Frontshore"));
        rulesList.addRule(new Rule("China", "Kina"));
        Wordreplacer wordreplacer = new Wordreplacer(rulesList);

        TextFileReader fileReader = new TextFileReader();
        String pathToFileAndFile = "/Users/albinblent/dev/FFCG.G4/wordreplacer/src/main/resources/text.txt";
        String result = wordreplacer.replace(fileReader.readFromFile(pathToFileAndFile));
        System.out.println(result);
    }
}
