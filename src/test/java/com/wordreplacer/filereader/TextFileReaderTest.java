package com.wordreplacer.filereader;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by albinblent on 2016-04-11.
 */
public class TextFileReaderTest {

    TextFileReader _textFileReader;

    @Before
    public void setUp() throws Exception {
        _textFileReader = new TextFileReader();
    }

    @Test
    public void test_read_a_file(){
        String result = _textFileReader.readFromFile("/Users/albinblent/dev/FFCG.G4/wordreplacer/src/main/resources/Instructions.txt");
        Assert.assertNotNull(result);
        Assert.assertNotSame("", result);
    }
}