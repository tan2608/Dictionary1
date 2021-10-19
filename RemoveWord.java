/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryapp;

import javafx.scene.control.TextField;
import java.io.IOException;

/**
 *
 * @author MyPC
 */
public class RemoveWord {

    private TextField wordRemoved;

    public void removeWord() throws IOException {
        String word_removed = wordRemoved.getText().trim();
        int index = DictionaryManagement.getIndexOfWord(word_removed);
        if (index == -1) {
            AlertController.alertNotFound();
            return;
        }
        try {
            DictionaryManagement.removeWord(word_removed);
            wordRemoved.clear();
            AlertController.alertRemove();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
