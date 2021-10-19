/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import javafx.scene.control.TextField;

/**
 *
 * @author MyPC
 */
public class AddWord {
//    Dictionary dictionary = new Dictionary();

    public TextField wordAdded;
    public TextField wordAddedMeaning;

    /**
     *
     * add word to dictionary
     */
    public void addWord() {
        String word_added = wordAdded.getText().trim();
        String word_added_meaning = wordAdded.getText().trim();
        /**
         * Kiểm tra từ được thêm đã có chưa
         */
        boolean isFound = false;
        for (int i = 0; i < Dictionary.dictionaryList.size(); i++) {
            if (Dictionary.dictionaryList.get(i).getWord().contentEquals(word_added)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            AlertController.alertFail();
            return;
        }
        try {
            DictionaryManagement.addWord(word_added, word_added_meaning);
            AlertController.alertSuccessful();
            wordAdded.clear();
            wordAddedMeaning.clear();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
