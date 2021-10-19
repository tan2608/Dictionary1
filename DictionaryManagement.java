/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryapp;

/**
 *
 * @author MyPC
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class DictionaryManagement {

    static Scanner scanner = new Scanner(System.in);

    public static void addWord(String word_added, String word_added_meaning) throws IOException {
        Word word = new Word(word_added, word_added_meaning);
        Dictionary.dictionaryList.add(word);
        ExportToFile();
    }

    public static void removeWord(String word_removed) throws IOException {
        int index = getIndexOfWord(word_removed);
        Dictionary.dictionaryList.remove(index);
        ExportToFile();
    }

    public static void editWord(String word_edited) throws IOException {
        String newWord = scanner.nextLine();
        String newMeaning = scanner.nextLine();
        int index = getIndexOfWord(word_edited);
        Dictionary.dictionaryList.get(index).setWord(newWord);
        Dictionary.dictionaryList.get(index).setWordMeaning(newMeaning);
        ExportToFile();
    }
    public static void lookUpWord(){
        
    }
    public static void ExportToFile() throws IOException {
//        Writer out = new Writer
//        FilterWriter writer = new FilterWriter();
        BufferedWriter writer = new BufferedWriter(new FileWriter("Data/dictionary.txt"));
        for (Word word : Dictionary.dictionaryList) {
            writer.write(String.format("%s\t%s\n", word.getWord(), word.getWordMeaning()));
        }
        writer.close();
    }

    public static int getIndexOfWord(String word) {
        int index = -1;
        for (int i = 0; i < Dictionary.dictionaryList.size(); i++) {
            if (word.equals(Dictionary.dictionaryList.get(index))) {
                index = i;
            }
        }
        return index;
    }
}
