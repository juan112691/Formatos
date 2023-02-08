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
public class DatosAutoController implements Initializable {
        RegistroController registro = new RegistroController();
    
    @FXML
    private TextField var14;

    @FXML
    private TextField var15;

    @FXML
    private TextField var16;

    @FXML
    private TextField var17;

    @FXML
    private TextField var18;

    @FXML
    private TextField var19;

    @FXML
    private TextField var20;
    @FXML
    private TextField var21;
    
    @FXML
    private Button btnAceptar;

    /**
     * Initializes the controller class.
     */
      @FXML
    void Acept(ActionEvent event) {
        
        RegistroController.var15 = var15.getText();
        RegistroController.var16 = var16.getText();
        RegistroController.var17 = var17.getText();
        RegistroController.var18 = var18.getText();
        RegistroController.var19 = var19.getText();
        RegistroController.var20 = var20.getText();
        RegistroController.var21 = var21.getText();
                
        Stage stage = (Stage) this.btnAceptar.getScene().getWindow();
        stage.close();
         
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // TODO
        var15.setText(RegistroController.var15);
        var16.setText(RegistroController.var16);
        var17.setText(RegistroController.var17);
        var18.setText(RegistroController.var18);
        var19.setText(RegistroController.var19);
        var20.setText(RegistroController.var20);
        var21.setText(RegistroController.var21);
        
        
    }    
    
}
