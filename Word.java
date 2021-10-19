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
public class Word {

    private String word;
    private String wordMeaning;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordMeaning() {
        return wordMeaning;
    }

    public void setWordMeaning(String wordMeaning) {
        this.wordMeaning = wordMeaning;
    }

    public Word(String word, String wordMeaning) {
        this.word = word.trim();
        this.wordMeaning = wordMeaning.trim();
    }

}
