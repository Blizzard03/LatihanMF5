/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mariq.rasyid.latihanmf5;

import com.mariq.rasyid.latihanmf5.Model.Mahasiswa;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLiNPUTController implements Initializable {

    Mahasiswa mhs = new Mahasiswa();
    @FXML
    private TextField txtnpm;
    @FXML
    private TextField txtname;
    @FXML
    private TextField txtmkuliah;
    @FXML
    private Button Reset_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void nextpage(ActionEvent event) {
        if (txtnpm.getText().isEmpty() || txtname.getText().isEmpty() || txtmkuliah.getText().isEmpty()) {
            Alert art = new Alert(Alert.AlertType.WARNING, "Data Masih Kosong Mohon Isi Terlebih dahulu", ButtonType.YES);
            art.showAndWait();
            if (art.getResult() == ButtonType.YES) {
                txtnpm.isFocused();
            }
        } else {

            mhs.setID(Integer.parseInt(txtnpm.getText()));
            mhs.setName(txtname.getText());
            mhs.setMaterial(txtmkuliah.getText());

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mariq/rasyid/latihanmf5/FXMLOutput.fxml"));
                Parent root = (Parent) loader.load();

                FXMLOutputController value
                        = (FXMLOutputController) loader.getController();
                value.showdata(mhs);

                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setTitle("Nilai Akhir");
                stg.setScene(scene);
                stg.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void Reset(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.CONFIRMATION, "Apakah Anda Ingin reset data ini?", ButtonType.YES, ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            txtnpm.setText(null);
            txtname.setText(null);
            txtmkuliah.setText(null);
            txtnpm.isFocused();
        }

    }
}
