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
public class EditWord {

    private TextField wordEdited;
    
    public void editWord() throws IOException {
        String word_edited = wordEdited.getText().trim();
        int index = DictionaryManagement.getIndexOfWord(word_edited);
        if (index == -1) {
            AlertController.alertNotFound();
            return;
        }
        try {
            DictionaryManagement.editWord(word_edited);
            wordEdited.clear();
            AlertController.alertEdit();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
