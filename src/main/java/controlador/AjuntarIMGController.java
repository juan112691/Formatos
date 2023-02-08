/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import static controlador.RegistroController.dir;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author juan_
 */
public class AjuntarIMGController implements Initializable {
      
    @FXML
    private Button btnadjuntar1;

    @FXML
    private Button btnadjuntar2;

    @FXML
    private Button btnadjuntar3;

    @FXML
    private Button btnadjuntar4;

    @FXML
    private Button btnadjuntar5;

    @FXML
    private Button btnadjuntar6;

    @FXML
    private Button btnadjuntar7;

    @FXML
    private Button btnadjuntar8;   

    @FXML
    private TextField txtadjuntar1;

    @FXML
    private TextField txtadjuntar2;

    @FXML
    private TextField txtadjuntar3;

    @FXML
    private TextField txtadjuntar4;

    @FXML
    private TextField txtadjuntar5;

    @FXML
    private TextField txtadjuntar6;

    @FXML
    private TextField txtadjuntar7;

    @FXML
    private TextField txtadjuntar8;

    @FXML
    private TextField txttitulo1;

    @FXML
    private TextField txttitulo2;

    @FXML
    private TextField txttitulo3;

    @FXML
    private TextField txttitulo4;

    @FXML
    private TextField txttitulo5;

    @FXML
    private TextField txttitulo6;

    @FXML
    private TextField txttitulo7;

    @FXML
    private TextField txttitulo8;
    
    @FXML
    private Button btnaceptar;
     @FXML
    private HBox hb1;

    @FXML
    private HBox hb2;

    @FXML
    private HBox hb3;

    @FXML
    private HBox hb4;

    @FXML
    private HBox hb5;

    @FXML
    private HBox hb6;

    @FXML
    private HBox hb7;

//----------------------------------------------------------------------------------------------------------------
   @FXML
    void adjuntar1(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir1 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir1 = null;
        }   
            txtadjuntar1.setText(RegistroController.dir1);        
        if (txtadjuntar1.getText() != "" && txtadjuntar1.getText() != null) {
            System.out.println(txtadjuntar1.getText());
           hb1.setDisable(false);
            //btnadjuntar2.setDisable(true);
            //txtadjuntar2.setDisable(true);
            //txttitulo2.setDisable(true);
        }
    }
//----------------------------------------------------------------------------------------------------------------
    @FXML
    void adjuntar2(ActionEvent event) {
        
       FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
            RegistroController.dir2 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir2 = null;
        }   
            txtadjuntar2.setText(RegistroController.dir2);        
        if (txtadjuntar2.getText() != "" && txtadjuntar2.getText() != null) {
            System.out.println(txtadjuntar2.getText());
             hb2.setDisable(false);
           // btnadjuntar3.setVisible(true);
            //txtadjuntar3.setVisible(true);
            //txttitulo3.setVisible(true);
        }
    }
//----------------------------------------------------------------------------------------------------------------
        @FXML
    void adjuntar3(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir3 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir3 = null;
        }   
            txtadjuntar3.setText(RegistroController.dir3);        
        if (txtadjuntar3.getText() != "" && txtadjuntar3.getText() != null) {
            System.out.println(txtadjuntar1.getText());
             hb3.setDisable(false);
            //btnadjuntar4.setVisible(true);
            //txtadjuntar4.setVisible(true);
            //txttitulo4.setVisible(true);
        }
    }
//----------------------------------------------------------------------------------------------------------------
    @FXML
    void adjuntar4(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir4 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir4 = null;
        }   
            txtadjuntar4.setText(RegistroController.dir4);        
        if (txtadjuntar4.getText() != "" && txtadjuntar4.getText() != null) {
            System.out.println(txtadjuntar1.getText());
             hb4.setDisable(false);
            //btnadjuntar5.setVisible(true);
            //txtadjuntar5.setVisible(true);
            //txttitulo5.setVisible(true);
        }
        System.out.println(dir);
    }
//----------------------------------------------------------------------------------------------------------------
    @FXML
    void adjuntar5(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir5 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir5 = null;
        }   
            txtadjuntar5.setText(RegistroController.dir5);        
        if (txtadjuntar5.getText() != "" && txtadjuntar5.getText() != null) {
            System.out.println(txtadjuntar1.getText());
             hb5.setDisable(false);
            //btnadjuntar6.setVisible(true);
            //txtadjuntar6.setVisible(true);
            //txttitulo6.setVisible(true);
        }
        System.out.println(dir);
    }
//----------------------------------------------------------------------------------------------------------------
    @FXML
    void adjuntar6(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir6 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir6 = null;
        }   
            txtadjuntar6.setText(RegistroController.dir6);        
        if (txtadjuntar6.getText() != "" && txtadjuntar6.getText() != null) {
            System.out.println(txtadjuntar1.getText());
            hb6.setDisable(false);
            //btnadjuntar7.setVisible(true);
            //txtadjuntar7.setVisible(true);
            //txttitulo7.setVisible(true);
        }
        System.out.println(dir);
    }
//----------------------------------------------------------------------------------------------------------------
    @FXML
    void adjuntar7(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir7 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir7 = null;
        }   
            txtadjuntar7.setText(RegistroController.dir7);        
        if (txtadjuntar7.getText() != "" && txtadjuntar7.getText() != null) {
            System.out.println(txtadjuntar1.getText());
             hb7.setDisable(false);
            //btnadjuntar8.setVisible(true);
            //txtadjuntar8.setVisible(true);
            //txttitulo8.setVisible(true);
        }
        System.out.println(dir);
    }
//----------------------------------------------------------------------------------------------------------------
    @FXML
    void adjuntar8(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             RegistroController.dir8 = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            RegistroController.dir8 = null;
        }   
            txtadjuntar8.setText(RegistroController.dir8);                      
    }
     @FXML
    void aceptar(ActionEvent event) {
        RegistroController.txtimg1 = txttitulo1.getText();
        RegistroController.txtimg2 = txttitulo2.getText();
        RegistroController.txtimg3 = txttitulo3.getText();
        RegistroController.txtimg4 = txttitulo4.getText();
        RegistroController.txtimg5 = txttitulo5.getText();
        RegistroController.txtimg6 = txttitulo6.getText();
        RegistroController.txtimg7 = txttitulo7.getText();
        RegistroController.txtimg8 = txttitulo8.getText();
        Stage stage = (Stage) this.btnaceptar.getScene().getWindow();
        stage.close();
    }
//----------------------------------------------------------------------------------------------------------------
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtadjuntar1.setText(RegistroController.dir1);
        txtadjuntar2.setText(RegistroController.dir2);
        txtadjuntar3.setText(RegistroController.dir3);
        txtadjuntar4.setText(RegistroController.dir4);
        txtadjuntar5.setText(RegistroController.dir5);
        txtadjuntar6.setText(RegistroController.dir6);
        txtadjuntar7.setText(RegistroController.dir7);
        txtadjuntar8.setText(RegistroController.dir8);
        txttitulo1.setText(RegistroController.txtimg1);
        txttitulo2.setText(RegistroController.txtimg2);
        txttitulo3.setText(RegistroController.txtimg3);
        txttitulo4.setText(RegistroController.txtimg4);
        txttitulo5.setText(RegistroController.txtimg5);
        txttitulo6.setText(RegistroController.txtimg6);
        txttitulo7.setText(RegistroController.txtimg7);
        txttitulo8.setText(RegistroController.txtimg8);
           
        if (txtadjuntar1.getText() != "" && txtadjuntar1.getText() != null ) {
            hb1.setDisable(false); 
            txtadjuntar1.focusedProperty();
            
        }
        if (txtadjuntar2.getText() != "" && txtadjuntar2.getText() != null ) {
            hb1.setDisable(false);
            hb2.setDisable(false); 
            
        }
        if (txtadjuntar3.getText() != "" && txtadjuntar3.getText() != null){
           hb2.setDisable(false);  
           hb3.setDisable(false); 
        }
        if (txtadjuntar4.getText() != "" && txtadjuntar4.getText() != null){
           hb3.setDisable(false);  
           hb4.setDisable(false);
        }
        if (txtadjuntar5.getText() != "" && txtadjuntar5.getText() != null){
           hb4.setDisable(false); 
           hb5.setDisable(false);
        }
        if (txtadjuntar6.getText() != "" && txtadjuntar6.getText() != null){
           hb5.setDisable(false);
           hb6.setDisable(false);
        }
        if (txtadjuntar7.getText() != "" && txtadjuntar7.getText() != null){
           hb6.setDisable(false);
           hb7.setDisable(false);
        }
        if (txtadjuntar8.getText() != "" && txtadjuntar8.getText() != null){
           hb7.setDisable(false);         
        }
        
    }    
    
}
