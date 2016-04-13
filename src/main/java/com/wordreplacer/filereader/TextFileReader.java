package com.wordreplacer.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by albinblent on 2016-04-11.
 */
public class TextFileReader implements IReader {
    public String readFromFile(String pathToFileAndFile) {
        String result = "";
        String newline = System.getProperty("line.separator");
        try {
            FileReader fileReader = new FileReader(pathToFileAndFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String tempString = "";
            while ((tempString = bufferedReader.readLine()) != null) {
                result = result + tempString + newline;
            }
            fileReader.close();
            bufferedReader.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
