/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.plaf.RootPaneUI;

/**
 * FXML Controller class
 *
 * @author juan_
 */

public class LoadingController implements Initializable {
    @FXML
    private StackPane Pane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        new Splash().start();
         
    }

    class Splash extends Thread{
        
        @Override
        public void run(){
            try {               
                Thread.sleep(100);
                Platform.runLater(new Runnable(){
                    @Override
                    public void run() {
                        String pathHome = "";
                        Properties p;           
                        pathHome = System.getProperty("user.dir");
                        Parent root = null;
                        try {                           
                            root = FXMLLoader.load(getClass().getResource("/fxml/Modelo.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(LoadingController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Scene scene = new Scene(root);
                        Stage stage = new Stage();
                        stage.setTitle("Ainsac - Master");
      //stage.getIcons().add(new Image(pathHome+"\\icono\\ainsac.png"));
                        stage.getIcons().add(new Image(pathHome+"\\src\\main\\resources\\images\\ainsac.png"));
                        stage.setScene(scene);
                        stage.show();
                        Pane.getScene().getWindow().hide();                                                                                             
                    }                    
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(LoadingController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
}
