/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mariq.rasyid.latihanmf5;

import com.mariq.rasyid.latihanmf5.Model.Mahasiswa;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLOutputController implements Initializable {

    @FXML
    private Label NPM_Label;
    @FXML
    private Label Name_Label;
    @FXML
    private Label Matakuliah_Label;
    @FXML
    private Button close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ClosedClick(ActionEvent event) {
        NPM_Label.setText("LABEL");
        Name_Label.setText("LABEL");
        Matakuliah_Label.setText("Label");
        close.getScene().getWindow().hide();
    }

    public void showdata(Mahasiswa mhs) {
        Name_Label.setText(mhs.getName());
        NPM_Label.setText(String.valueOf(mhs.getID()));
        Matakuliah_Label.setText(mhs.getMaterial());
    }
}
