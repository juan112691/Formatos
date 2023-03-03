package controlador.Inmuebles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author juan_
 */
public class TerrenoController implements Initializable {

    @FXML
    public AnchorPane contenedor;

    @FXML
    public ImageView imageView;

    @FXML
    private Button recortarButton;
    
    private double startX, startY, endX, endY;
    
    @FXML
    public AnchorPane contenedor1;
    
    @FXML
    void recortarPantalla(ActionEvent event) {
        try {
            // Crear una ventana emergente para permitir al usuario realizar el recorte
           
         Parent root = FXMLLoader.load(getClass().getResource("/fxml/Inmuebles/Mapa.fxml"));          
Scene scene = new Scene(root);
Stage stage = new Stage();           
stage.initModality(Modality.APPLICATION_MODAL);
stage.setScene(scene);
stage.show();

        } catch (IOException ex) {
            Logger.getLogger(TerrenoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
