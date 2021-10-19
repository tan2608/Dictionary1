/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryapp;

import javafx.scene.control.Alert;

/**
 *
 * @AlertController
 */
public class AlertController {

    public static void alertSuccessful() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SUCCESSFUL!!");
        alert.setContentText("Đã thêm vào bộ từ điển!");
        alert.showAndWait();
    }

    public static void alertFail() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("FAIL!!");
        alert.setContentText("Đã có trong bộ từ điển!");
        alert.showAndWait();
    }

    public static void alertRemove() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SUCCESSFUL!!");
        alert.setContentText("Đã xóa từ khỏi bộ từ điển!");
        alert.showAndWait();
    }
    public static void alertNotFound() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("FAIL!!");
        alert.setContentText("Không tìm thấy từ này trong bộ từ điển!");
        alert.showAndWait();
    }
    public static void alertEdit() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SUCCESSFUL!!");
        alert.setContentText("Đã thay đổi từ trong bộ từ điển!");
        alert.showAndWait();
    }
   
}
