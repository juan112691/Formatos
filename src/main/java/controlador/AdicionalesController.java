/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author juan_
 */
public class AdicionalesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button aceptar;

    @FXML
    private TextField var50;

    @FXML
    private TextField var51;

    @FXML
    private TextField var52;

    @FXML
    private TextField var53;

    @FXML
    private TextField var54;

    @FXML
    private TextField var55;

    @FXML
    private TextField var56;

    @FXML
    private TextField var57;

    @FXML
    private TextField var58;

    @FXML
    private TextField var59;

    @FXML
    private TextField var60;

    @FXML
    private TextField var61;

    @FXML
    private TextField var62;

    @FXML
    private TextField var63;

    @FXML
    private TextField var64;

    @FXML
    private TextField var65;

    @FXML
    void subm(ActionEvent event) {
        RegistroController.var50 = var50.getText();
        RegistroController.var51 = var51.getText();
        RegistroController.var52 = var52.getText();
        RegistroController.var53 = var53.getText();
        RegistroController.var54 = var54.getText();
        RegistroController.var55 = var55.getText();
        RegistroController.var56 = var56.getText();
        RegistroController.var57 = var57.getText();
        RegistroController.var58 = var58.getText();
        RegistroController.var59 = var59.getText();
        RegistroController.var60 = var60.getText();
        RegistroController.var61 = var61.getText();
        RegistroController.var62 = var62.getText();
        RegistroController.var63 = var63.getText();
        RegistroController.var64 = var64.getText();
        RegistroController.var65 = var65.getText();
                
        Stage stage = (Stage) this.aceptar.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        var50.setText(RegistroController.var50);
        var51.setText(RegistroController.var51);
        var52.setText(RegistroController.var52);
        var53.setText(RegistroController.var53);
        var54.setText(RegistroController.var54);
        var55.setText(RegistroController.var55);
        var56.setText(RegistroController.var56);
        var57.setText(RegistroController.var57);
        var58.setText(RegistroController.var58);
        var59.setText(RegistroController.var59);
        var60.setText(RegistroController.var60);
        var61.setText(RegistroController.var61);
        var62.setText(RegistroController.var62);
        var63.setText(RegistroController.var63);
        var64.setText(RegistroController.var64);
        var65.setText(RegistroController.var65);
    }    
    
}
