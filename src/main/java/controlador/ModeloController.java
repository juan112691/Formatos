/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author juan_
 */
public class ModeloController implements Initializable {
    @FXML
    private AnchorPane ancho;
    
    @FXML
    private BorderPane borderpane;
    
     @FXML
    private Button btnbuscar;
     
    @FXML
    private Button btnregistro;
    @FXML
    private ComboBox CboxInmueble;
                
    ObservableList<String> ListImueb = FXCollections.observableArrayList("CASA","DEPARTAMENTO","TERRENO");
 //-------------------------------------CAMBIO DE VENTANA INMUEBLES----------------------------------------------------
    @FXML
    void Inmueble(ActionEvent event) {
    ComboBox<String> comboBox = (ComboBox<String>) event.getSource();
    String selectedOption = comboBox.getValue();
        if (selectedOption.equals("TERRENO")) {
           try{
                Parent dashboard = FXMLLoader.load(getClass().getResource("/fxml/Inmuebles/Terreno.fxml"));
                borderpane.setCenter(dashboard);
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            } 
        } else {
        }
    }
 //----------------------------------------------------------------------------------------------------------------------
    @FXML
    void registro(ActionEvent event) {
        try{
        Parent dashboard = FXMLLoader.load(getClass().getResource("/fxml/Registro.fxml"));
        borderpane.setCenter(dashboard);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       try {    
       
        CboxInmueble.setItems(ListImueb);        
        // ComboBox.getItems().add("");  
        Parent dashboard = FXMLLoader.load(getClass().getResource("/fxml/Registro.fxml"));          
        borderpane.setCenter(dashboard);
        
    } catch (IOException ex) {
        Logger.getLogger(ModeloController.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex);
    }
        
    }    
    
}
