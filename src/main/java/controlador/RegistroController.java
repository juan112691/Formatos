/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import org.apache.poi.ooxml.POIXMLDocument;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
/**
 * FXML Controller class
 *
 * @author juan_
 */
public class RegistroController implements Initializable {      
    static  String dir = null;
    static  String dir1 = null;
    static  String dir2 = null;
    static  String dir3 = null;
    static  String dir4 = null;
    static  String dir5 = null;
    static  String dir6 = null;
    static  String dir7 = null;
    static  String dir8 = null;
    static  String txtimg1 = "";
    static  String txtimg2 = "";
    static  String txtimg3 = "";
    static  String txtimg4 = "";
    static  String txtimg5 = "";
    static  String txtimg6 = "";
    static  String txtimg7 = "";
    static  String txtimg8 = "";
    static  String result = null;
    static  String var = null;
    static  String var15 = null;
    static  String var16 = null;
    static  String var17 = null;
    static  String var18 = null;
    static  String var19 = null;
    static  String var20 = null;
    static  String var21 = null;
    static  String var50 = null;
    static  String var51 = null;
    static  String var52 = null;
    static  String var53 = null;
    static  String var54 = null;
    static  String var55 = null;
    static  String var56 = null;
    static  String var57 = null;
    static  String var58 = null;
    static  String var59 = null;
    static  String var60 = null;
    static  String var61 = null;
    static  String var62 = null;
    static  String var63 = null;
    static  String var64 = null;
    static  String var65 = null;
    static  String placa = null;
    static  String placa1 = null;
    static  String marca = null;
    static  String marca1 = null;
    static  String serie = null;
    static  String serie1 = null;
    static  String modelo = null;
    static  String modelo1 = null;
    static  String anio = null;
    static  String anio1 = null;
    static  String estado = null;
    static  String estado1 = null;
    static  String vehiculo = null;
    static boolean bandera = false;
    static int num;
    @FXML
    private ImageView ImgView;

    @FXML
    private Button btnDesc;

    @FXML
    private Button btnImg;

    @FXML
    private Button btnadic;

    @FXML
    private Button btnexp;

    @FXML
    private TextField var0;

    @FXML
    private TextField var1;

    @FXML
    private TextField var10;

    @FXML
    private TextField var100;

    @FXML
    private TextArea var101;

    @FXML
    private TextField var102;

    @FXML
    private TextField var103;

    @FXML
    private DatePicker var11;

    @FXML
    private TextField var12;

    @FXML
    private TextField var13;

    @FXML
    private TextField var14;

    @FXML
    private TextField var2;

    @FXML
    private TextField var22;

    @FXML
    private TextField var23;

    @FXML
    private TextField var24;

    @FXML
    private TextField var25;

    @FXML
    private TextArea var26;

    @FXML
    private TextField var27;

    @FXML
    private TextField var28;

    @FXML
    private TextField var29;

    @FXML
    private TextField var3;

    @FXML
    private TextField var30;

    @FXML
    private TextField var31;

    @FXML
    private TextField var32;

    @FXML
    private TextField var33;

    @FXML
    private TextField var34;

    @FXML
    private TextField var35;

    @FXML
    private TextField var36;

    @FXML
    private TextField var37;

    @FXML
    private TextField var38;

    @FXML
    private TextField var39;

    @FXML
    private TextField var4;

    @FXML
    private TextField var40;

    @FXML
    private TextField var41;

    @FXML
    private TextField var42;

    @FXML
    private TextField var43;

    @FXML
    private TextField var44;

    @FXML
    private TextField var45;

    @FXML
    private TextField var46;

    @FXML
    private TextField var47;

    @FXML
    private TextField var48;

    @FXML
    private TextField var49;

    @FXML
    private TextField var5;

    @FXML
    private TextField var6;

    @FXML
    private TextArea var66;

    @FXML
    private TextArea var67;

    @FXML
    private TextArea var68;

    @FXML
    private TextArea var69;

    @FXML
    private TextField var7;

    @FXML
    private TextField var70;

    @FXML
    private TextField var71;

    @FXML
    private TextField var72;

    @FXML
    private ImageView var73;

    @FXML
    private ImageView var74;

    @FXML
    private TextField var75;

    @FXML
    private TextField var76;

    @FXML
    private TextField var77;

    @FXML
    private TextField var78;

    @FXML
    private TextField var79;

    @FXML
    private TextField var8;

    @FXML
    private TextField var80;

    @FXML
    private TextField var81;

    @FXML
    private TextField var82;

    @FXML
    private TextField var83;

    @FXML
    private TextField var84;

    @FXML
    private TextField var85;

    @FXML
    private TextField var86;

    @FXML
    private TextField var87;

    @FXML
    private TextField var88;

    @FXML
    private TextField var89;

    @FXML
    private TextField var9;

    @FXML
    private TextField var90;

    @FXML
    private TextField var91;

    @FXML
    private TextField var92;

    @FXML
    private TextField var93;

    @FXML
    private TextField var94;

    @FXML
    private TextField var95;

    @FXML
    private TextField var96;

    @FXML
    private TextField var97;

    @FXML
    private TextArea var98;

    @FXML
    private TextArea var99;
    
    @FXML
    private Button btnlimpiar;
    
    @FXML
    private DatePicker fechafinal;
 //----------------------------------------------------------------------------------------------------------------------   
    @FXML
    void adjuntar(ActionEvent event) {
       try {
            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("/fxml/AjuntarIMG.fxml"));          
            Scene scene = new Scene(root);
            Stage stage = new Stage();           
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 //----------------------------------------------------------------------------------------------------------------------   
    @FXML
    void fechfinal(ActionEvent event) {
        if (var11.getValue() != null) {
       String[] parts = String.valueOf(var11.getValue()).split("-");
       var mes = fechafinal.getValue().getMonth();
       var dia = fechafinal.getValue().getDayOfMonth();
       var anio = fechafinal.getValue().getYear();
       String nombremes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
       var103.setText("Lima, "+dia+" de "+nombremes+" del "+anio);
        }
        
    }
//----------------------------------------------------------------------------------------------------------------------   
    @FXML
    void urltipocambio(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.sbs.gob.pe/app/pp/SISTIP_PORTAL/Paginas/Publicacion/TipoCambioPromedio.aspx"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(RegistroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 //----------------------------------------------------------------------------------------------------------------------   
    @FXML
    void limpiar(ActionEvent event) {
    var0.setText(""); var2.setText(""); var3.setText(""); var4.setText(""); var5.setText(""); var6.setText(""); var7.setText(""); var8.setText("");var10.setText(""); var11.setValue(null); 
    var12.setText(""); var15=""; var16=""; var17=""; var18=""; var19="";var20="";var21="";var22.setText("");var23.setText("");var24.setText("");var25.setText("");
    var27.setText("");var28.setText("");var29.setText("");var30.setText("");var31.setText("");var32.setText("");var33.setText("");var34.setText("");var35.setText("");var36.setText("");var37.setText("");var38.setText("");
    var39.setText("");var40.setText("");var41.setText("");var42.setText("");var43.setText("");var44.setText("");var45.setText("");var46.setText("");var47.setText("");var48.setText("");var49.setText("");var50=null;var51=null;
    var52=null;var53=null;var54=null;var55=null;var56=null;var57=null;var58=null;var59=null;var60=null;var61=null;var62=null;var63=null;var64=null;var65=null;var69.setText("");
    var76.setText("");var77.setText("");var78.setText("");var79.setText("");var80.setText("");var81.setText("");var82.setText("");var83.setText("");var84.setText("");var85.setText("");var86.setText("");var87.setText("");
    var88.setText("");var89.setText("");var90.setText("");var91.setText("");var92.setText("");var93.setText("");var94.setText("");var95.setText("");var96.setText("");var97.setText("");
    var100.setText("");var102.setText("");fechafinal.setValue(null);var103.setText("");dir1=null;dir2=null;dir3=null;dir4=null;dir5=null;dir6=null;dir7=null;dir8=null;txtimg1="";txtimg2="";txtimg3="";txtimg4="";txtimg5="";txtimg6="";txtimg7="";txtimg8="";
    }
//----------------------------------------------------------------------------------------------------------------------    
     @FXML
    void variable22(KeyEvent event) {        
      if (var22.getText() != "" && var23.getText() != "" && var24.getText() != "" && var25.getText() != "") {
             //System.out.println("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText());
             var69.setText("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText());
      }
    }
    @FXML
    void variable23(KeyEvent event) {
        if (var22.getText() != "" && var23.getText() != "" && var24.getText() != "" && var25.getText() != "") {
             //System.out.println("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText());
             var69.setText("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText()); 
        }
    }
    @FXML
    void variable24(KeyEvent event) {
        if (var22.getText() != "" && var23.getText() != "" && var24.getText() != "" && var25.getText() != "") {
             //System.out.println("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText());
             var69.setText("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText()); 
        }
    }
    @FXML
    void variable25(KeyEvent event) {
        if (var22.getText() != "" && var23.getText() != "" && var24.getText() != "" && var25.getText() != "") {
             //System.out.println("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText());
              var69.setText("El vehículo se encuentra ubicado en: "+var22.getText()+", Distrito de "+var23.getText()+", Provincia de "+var24.getText()+", Departamento de "+var25.getText()); 
        }
    }  
//----------------------------------------------------------------------------------------------------------------------   
   @FXML
    void variable84(KeyEvent event) {
       
        if (var84.getText()!="") {
           var valor = var84.getText();  
        valor = valor.replace(",","");        
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        double valorFormateado = Double.parseDouble(valor)*0.1;              
        var86.setText(String.valueOf(formato.format(valorFormateado))); 
        }else{
            var86.setText("");
        }       
    }
//-------------------------------------------------------------------------------
     @FXML
    void variable87(KeyEvent event) {
            var sum1 = 0;
            var sum2 = 0;
         if (var87.getText()!= "") {
            sum1 =  Integer.parseInt(var87.getText());  
         }
         if (var88.getText()!= "") {
            sum2 = Integer.parseInt(var88.getText());
         }                 
            var89.setText(String.valueOf(sum1+sum2));
        
    }
//-------------------------------------------------------------------------------
    @FXML
    void variable88(KeyEvent event) {
            var sum11 = 0;
            var sum22 = 0;
            var num1 = 0.00;
            var num2 = 0.00;
            var num3 = 0.00;
            var num4 = 0.00;           
         if (var87.getText()!= "") {
            sum11 =  Integer.parseInt(var87.getText());  
         }
         if (var88.getText()!= "") {
            sum22 = Integer.parseInt(var88.getText());
         }                
        var89.setText(String.valueOf(sum11+sum22));
 //-------------------------------------------------------------------------------   
        if (var84.getText()!="") {
            num1 = Double.parseDouble(var84.getText().replace(",","")) ; 
        }
        if (var86.getText()!="") {
           num2 = Double.parseDouble(var86.getText().replace(",","")) ; 
        }
        if (var87.getText()!="") {
            num3 = Double.parseDouble(var87.getText().replace(",","")) ;
        }
        if (var89.getText()!="") {
             num4 = Double.parseDouble(var89.getText().replace(",","")) ; 
        }                                                           
            var total = (num1-num2)*num3/num4;            
            DecimalFormat formato = new DecimalFormat("#,##0.00");      
             var90.setText(String.valueOf(formato.format(total)));
            System.out.println(total);
    }    
 //-------------------------------------------------------------------------------  
    @FXML
    void variable91(KeyEvent event) {
        var valrep1 = 0.00;
        var valrep2 = 0.00;
        var valrep3 = 0.00;
        var valrep4 = 0.00;
        
        if (var84.getText()!="") {
           valrep1 = Double.parseDouble(var84.getText().replace(",","")) ; 
        }
        if (var85.getText()!="") {
            valrep2 = Double.parseDouble(var85.getText().replace(",","")) ;
        }
        if (var90.getText()!="") {
            valrep3 = Double.parseDouble(var90.getText().replace(",","")) ;
        }
        if (var91.getText()!="") {
           valrep4 = Double.parseDouble(var91.getText().replace(",","")) ;  
        }                                       
            var totalvalrepo = (((valrep1*valrep2)-valrep3)*valrep4);
            DecimalFormat formato = new DecimalFormat("#,##0.00");      
             var92.setText(String.valueOf(formato.format(totalvalrepo)));
            System.out.println(totalvalrepo); 
            
            var96.setText(var92.getText());        
    }
 //------------------------------------------------------------
   @FXML
    void variable92(KeyEvent event) {
        
        var96.setText(var92.getText());
        
    }
 //------------------------------------------------------------
    @FXML
    void variable93(KeyEvent event) {                
        var valrep1=0.00;
        var valrep2=0.00;
        
        if (var92.getText()!="") {
            valrep1 = Double.parseDouble(var92.getText().replace(",","")) ; 
        }
        if (var93.getText()!="") {
            valrep2 = Double.parseDouble(var93.getText().replace(",","")) ; 
        }                                  
            var totalvalrepo = valrep1*valrep2;
            DecimalFormat formato = new DecimalFormat("#,##0.00");      
             var94.setText(String.valueOf(formato.format(totalvalrepo)));
            System.out.println(totalvalrepo);              
            var97.setText(var94.getText());
 //------------------------------------------------------------ 
         var95.setText(String.valueOf(formato.format(totalvalrepo*0.8)));
         var100.setText(var95.getText());
    }
   //------------------------------------------------------------  
    @FXML
    void variable94(KeyEvent event) {
        var97.setText(var94.getText());
    }
    //------------------------------------------------------------  
    @FXML
    void variable95(KeyEvent event) {
        var100.setText(var95.getText());
    }   
//----------------------------------------------------------------------------------------------------------------------
    void actualizar(){
       var27.setText(var16);
       var32.setText(var17);
       var31.setText(var19);
       var33.setText(var18);
       var29.setText(var20); 
       
        if (var11.getValue() != null) {
            String[] parts = String.valueOf(var11.getValue()).split("-");
            var77.setText("Los factores determinados para la valorización al "+parts[2]+"/"+parts[1]+"/"+parts[0]+" son los siguientes:");
        }             
       var78.setText(var16);
       var79.setText(var17);
       var80.setText(var18);
       var81.setText(var19);
       var82.setText(var20);
       var83.setText(var21);
              
    }
//--------------------------------------------------------------------------------------------------------------------
    @FXML
    void Desc(ActionEvent event) {
        try {
            Parent root = null;
           root = FXMLLoader.load(getClass().getResource("/fxml/DatosAuto.fxml"));          
            Scene scene = new Scene(root);
            Stage stage = new Stage();           
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            actualizar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//----------------------------------------------------------------------------------------------------------------------
     @FXML
    void adic(ActionEvent event) {
        try {
            Parent root = null;
           root = FXMLLoader.load(getClass().getResource("/fxml/Adicionales.fxml"));          
            Scene scene = new Scene(root);
            Stage stage = new Stage();           
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//----------------------------------------------------------------------------------------------------------------------
     @FXML
    void Img(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File File = fc.showOpenDialog(null);
        if (File != null) {
             dir = File.getAbsolutePath();      
        } else{
            System.out.println("error");
            dir = null;
        }             
         if (dir != null) {
        Image img = new Image(dir);
        ImageView imgView = new ImageView(img);
        // Añadir el ImageView al panel principal de la pantalla
       ImgView.setImage(img);    
         }           
    }
//----------------------------------------------------------------------------------------------------------------------
      @FXML
    void exp(ActionEvent event) {
            var mes = var11.getValue().getMonth();
            var dia = var11.getValue().getDayOfMonth();
            var anio0 = var11.getValue().getYear();
            String nombremes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        List<String> vari = Arrays.asList("var0","var1","var2","var3","var4","var5","var6","var7","var8","var9","var10","var11","var12","var13","var14","var15","var16","var17","var18","var19","var20","var21","varcar0","varcar1","varfecha","var22",
        "var23","var24","var25","var26","var27","var28","var29","var30","var31","var32","var33","var34","var35","var36","var37","var38","var39","var40","var41","var42","var43","var44","var45","var46","var47","var48",
        "var49","var50","var51","var52","var53","var54","var55","var56","var57","var58","var59","var60","var61","var62","var63","var64","var65","var66","var67","var68","var69","var70","var71","var72","var75","var76",
        "var77","var78","var79","var80","var81","var82","var83","var84","var85","var86","var87","var88","var89","var90","var91","var92","var93","var94","var95","var96","var97","var98","var99","var100","var101","var102","var103",
        "varcar2","var104","varcar3","var105","varcar4","var106","varcar5","var107","varcar6","var108","varcar7","var109","varcar8","var110","varcar9","var111");
        List<String> variables = Arrays.asList(var0.getText(),var1.getText(),var2.getText(),var3.getText(),var4.getText(),var5.getText(),var6.getText(),var7.getText(),var8.getText(),var9.getText(),var10.getText(),
        String.valueOf(var11.getValue()),var12.getText(),var13.getText(),var14.getText(),var15,var16,var17,var18,var19,var20,var21,"1.2.    VISTA PRINCIPAL","",String.valueOf(dia+" de "+nombremes+" del "+anio0),var22.getText(),var23.getText(),var24.getText(),var25.getText(),var26.getText(),
        var27.getText(),var28.getText(),var29.getText(),var30.getText(),var31.getText(),var32.getText(),var33.getText(),var34.getText(),var35.getText(),var36.getText(),var37.getText(),var38.getText(),var39.getText(),
        var40.getText(),var41.getText(),var42.getText(),var43.getText(),var44.getText(),var45.getText(),var46.getText(),var47.getText(),var48.getText(),var49.getText(),var50,var51,var52,var53,var54,var55,var56,var57,
        var58,var59,var60,var61,var62,var63,var64,var65,var66.getText(),var67.getText(),var68.getText(),var69.getText(),var70.getText(),var71.getText(),var72.getText(),var75.getText(),"La antigüedad del vehículo es de: "+var76.getText(),var77.getText(),
        var78.getText(),var79.getText(),var80.getText(),var81.getText(),var82.getText(),var83.getText(),var84.getText(),var85.getText(),var86.getText(),var87.getText(),var88.getText(),var89.getText(),var90.getText(),
        var91.getText(),var92.getText(),var93.getText(),var94.getText(),var95.getText(),var96.getText(),var97.getText(),var98.getText(),var99.getText(),var100.getText(),var101.getText(),var102.getText(),var103.getText(),
        txtimg1,"",txtimg2,"",txtimg3,"",txtimg4,"",txtimg5,"",txtimg6,"",txtimg7,"",txtimg8,""); 
                
        for (int i = 0; i < variables.size(); i++) {
              System.out.println(variables.get(i));             
          }
        String pathHome = "";
        Properties p;           
        pathHome = System.getProperty("user.dir");
        FileChooser fc = new FileChooser();
        fc.setTitle("Guardar Archivo");
        fc.setInitialFileName("Nombre-Archivo");
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Documento de word", "*.docx"));
         // new FileChooser.ExtensionFilter("Libro de Excel 97-2003", "*.xls"));
        File file = fc.showSaveDialog(new Stage());
        fc.setInitialDirectory(file.getParentFile());
          //System.out.println(file.);
      try{   
          //org.apache.commons.io.FileUtils.copyFile(new File("C:\\Users\\juan_\\OneDrive\\Escritorio\\formatos\\vehiculos.docx"), new File(file.toString()));
//--------------------------------------------------------------------------------------------------------------------------------------------------------          
          if (var50!=null||var51!=null||var52!=null||var53!=null||var54!=null||var55!=null||var56!=null||var57!=null||var58!=null||var59!=null||var60!=null||var61!=null||
              var62!=null||var63!=null||var64!=null||var65!=null){
                vehiculo = "vehiculos1.docx"; 
                bandera = true;
          }else{
                vehiculo = "vehiculos.docx"; 
                bandera = false;
          }
//--------------------------------------------------------------------------------------------------------------------------------------------------------          
           org.apache.commons.io.FileUtils.copyFile(new File("src\\main\\resources\\formatos\\"+vehiculo), new File(file.toString()));
            try (XWPFDocument docx = new XWPFDocument(POIXMLDocument.openPackage(file.toString()))) {
                List<XWPFParagraph> paragraphs = docx.getParagraphs();
                /*  List<String> cadena=null;
                // Obtenga el primer objeto de ejecución
                XWPFWordExtractor ext = new XWPFWordExtractor(docx);
                List<String> lines = Arrays.asList(ext.getText().split("\n"));                 
                for (int i = 0; i < lines.size(); i++) {
                String text = lines.get(i);           
                compar(text, variables,vari);
                //System.out.println("<<<<<<<<<<<<<"+lines[i]);
                //String[] cadena = lines.get(i).split("(?=\\s)|(?=\\t)");
                cadena = Arrays.asList(lines.get(i).split("(?=\\s)|(?=\\t)"));
                for (int j = 0; j < cadena.size(); j++) {
                //System.out.println("cadena--" + cadena.get(j));
                String cadena1 = cadena.get(j).replaceAll("^\\s*", "");
                //System.out.println("SUBcadena--"+subcadena);
                if (cadena1.equalsIgnoreCase("var2")) {
                System.out.println("ok");
                cadena1=variables.get(i);
                cadena.set(j, "holaaaas");
                lines.set(i, cadena.set(j, "holaaaas"));
                }
                }
                //System.out.println("1----------"+(cadena));
                }
                System.out.println("M----------"+Arrays.toString(lines.toArray()));
                */
                int l =0;
                for (XWPFParagraph paragraph : paragraphs)
                {
                    String text = paragraph.getText();
                    compar(text, variables,vari);
                    
                    if(result != null) 
                    {
                        List<XWPFRun> runs = paragraph.getRuns();
                        for (XWPFRun run : runs) 
                        {                            
                            l++;
                            //System.out.println("variable: "+l);                         
                            if (l==49) {
                                if (var3.getText()!="" ) {
                                        run.addBreak();
                                    }
                            }
//-----------------------------------------------------------------------------------------------------------------------------
                            if (l==50) {
                                if (var4.getText()!= "") {                                                                       
                                    run.addBreak();                                                                                                           
                                    //System.out.println(".......................................................");
                                    //run.setText("",0);
                                    run.setText("ATT.                                               :      "+var4.getText(),0); 
                                }
                                if (var5.getText() != "") {
                                   run.setText(var5.getText(),1);
                                   run.addBreak(); 
                                }
                                if (var6.getText() != "") {
                                    if (var5.getText() == "") {
                                        run.setText("Teléf.: "+var6.getText(),1);
                                        run.addBreak();
                                    }else{
                                        run.setText("Teléf.: "+var6.getText(),2);
                                        run.addBreak();
                                    }                                    
                                }
                                if (var7.getText()!= "") {
                                   if (var5.getText() == "") {
                                        run.setText("Móvil: "+var7.getText(),1);
                                        //run.addBreak();
                                    }else if(var6.getText() == "") {
                                        run.setText("Móvil: "+var7.getText(),2);
                                        //run.addBreak();
                                    }else{
                                        run.setText("Móvil: "+var7.getText(),3);
                                        //run.addBreak();
                                    }                                    
                                }
                                   //run.addBreak();                                                                                                                                                              
                            } 
//-----------------------------------------------------------------------------------------------------------------------------
                            // Reemplazar posición de plantilla original
                            System.out.println("_"+run.toString());
                            //run.setText(changeValue(run.toString(), textMap),0);                        
                            for (int i = 0; i < vari.size(); i++)
                            {
                                if (run.toString().trim().equalsIgnoreCase(vari.get(i)))
                                {
                                    System.out.println("encontro "+i);                               
                                    if(i != 11){  
                                        if(i==22 && dir==null){
                                           run.removeBreak();
                                           run.setText("",0);
                                           run.removeBreak();
                                        }else if(i==22 && dir!=null){                                            
                                            run.setText(variables.get(i),0);
                                        }else{
                                            run.setText(variables.get(i),0); 
                                        }                                                                              
                                    }else{    
                                        if (var11.getValue()!= null) 
                                       {                                                                                                                          
                                       run.setText(dia+" DE "+nombremes.toUpperCase()+" DEL "+anio0,0);     
                                        }
                                                                           
                                    }                                                                                                            
//-------------------------------------------------------------------------------------------------------------------------
                                  if (i==10)
                                    {
                                        XWPFTable table = docx.getTables().get(0);
                                        var fila1 = table.getRow(0);
                                        fila1.getCell(2).setText(var31.getText());
                                        var fila2 = table.getRow(1);
                                        fila2.getCell(2).setText(var31.getText());
                                        var fila3 = table.getRow(2);
                                        fila3.getCell(2).setText(var27.getText());
                                        var fila4 = table.getRow(3);
                                        fila4.getCell(2).setText(var46.getText());
                                        var fila5 = table.getRow(4);
                                        fila5.getCell(2).setText(var32.getText());
                                        var fila6 = table.getRow(5);
                                        fila6.getCell(2).setText(var35.getText());
                                        var fila7 = table.getRow(6);
                                        fila7.getCell(2).setText(var34.getText());
                                        var fila8 = table.getRow(7);
                                        fila8.getCell(2).setText(var48.getText());
                                    }
//-------------------------------------------------------------------------------------------------------------------------                                 
                                  if (i==11)
                                    {
                                        double tipocamb = Double.parseDouble(var12.getText());
                                        XWPFTable table = docx.getTables().get(1);                                     
                                        System.out.println(table.getText());
                                        var tbl1 = table.getRow(2);
                                        var tbl2 = table.getRow(4); 
                                        DecimalFormat formato = new DecimalFormat("#,##0.00");
                                                                                    
                                        XWPFTableCell celd0 = tbl1.getCell(1);
                                        XWPFParagraph cd0 = celd0.getParagraphArray(0);
                                        XWPFRun rw0 = cd0.createRun();
                                        rw0.setFontFamily("Garamond");
                                        rw0.setFontSize(8);
                                        rw0.setText(var27.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell celd1 = tbl1.getCell(2);
                                        XWPFParagraph cd1 = celd1.getParagraphArray(0);
                                        XWPFRun rw1 = cd1.createRun();
                                        rw1.setFontFamily("Garamond");
                                        rw1.setFontSize(8);
                                        rw1.setText(var49.getText());
                               //------------------------------------------------------------
                                    XWPFTableCell celd2 = tbl1.getCell(3);
                                        XWPFParagraph cd2 = celd2.getParagraphArray(0);                                     
                                        XWPFRun rw2 = cd2.createRun();
                                        rw2.setFontFamily("Garamond");
                                        rw2.setFontSize(8);
                                        rw2.setText(var96.getText());
                                //------------------------------------------------------------
                                    XWPFTableCell celd3 = tbl1.getCell(4);
                                        XWPFParagraph cd3 = celd3.getParagraphArray(0);                                     
                                        XWPFRun rw3 = cd3.createRun();
                                        rw3.setFontFamily("Garamond");
                                        rw3.setFontSize(8);
                                        rw3.setText(formato.format(tipocamb*Double.parseDouble(var96.getText().replace(",",""))));
                                //------------------------------------------------------------
                                    XWPFTableCell celd4 = tbl1.getCell(5);
                                        XWPFParagraph cd4 = celd4.getParagraphArray(0);                                     
                                        XWPFRun rw4 = cd4.createRun();
                                        rw4.setFontFamily("Garamond");
                                        rw4.setFontSize(8);
                                        rw4.setText(var97.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell celd5 = tbl1.getCell(6);
                                        XWPFParagraph cd5 = celd5.getParagraphArray(0);                                     
                                        XWPFRun rw5 = cd5.createRun();
                                        rw5.setFontFamily("Garamond");
                                        rw5.setFontSize(8);
                                        rw5.setText(String.valueOf(formato.format(tipocamb*Double.parseDouble(var97.getText().replace(",","")))));
                                //------------------------------------------------------------
                                    XWPFTableCell celd6 = tbl1.getCell(7);
                                        XWPFParagraph cd6 = celd6.getParagraphArray(0);                                     
                                        XWPFRun rw6 = cd6.createRun();
                                        rw6.setFontFamily("Garamond");
                                        rw6.setFontSize(8);
                                        rw6.setText(var100.getText());
                                //------------------------------------------------------------
                                    XWPFTableCell celd7 = tbl1.getCell(8);
                                        XWPFParagraph cd7 = celd7.getParagraphArray(0);                                     
                                        XWPFRun rw7 = cd7.createRun();
                                        rw7.setFontFamily("Garamond");
                                        rw7.setFontSize(8);
                                        //tipocamb*var96.getText();                                       
                                        rw7.setText(String.valueOf(formato.format(tipocamb*Double.parseDouble(var100.getText().replace(",","")))));                                          
                                       // var92.setText(String.valueOf(formato.format(totalvalrepo)));
                                 //------------------------------------------------------------                             
                                    XWPFTableCell celd21 = tbl2.getCell(3);
                                        XWPFParagraph cd21 = celd21.getParagraphArray(0);                                     
                                        XWPFRun rw21 = cd21.createRun();
                                        rw21.setFontFamily("Garamond");
                                        rw21.setFontSize(8);
                                        rw21.setBold(true);
                                        rw21.setText(var96.getText());
                                //------------------------------------------------------------  
                                    XWPFTableCell celd31 = tbl2.getCell(4);
                                        XWPFParagraph cd31 = celd31.getParagraphArray(0);                                     
                                        XWPFRun rw31 = cd31.createRun();
                                        rw31.setFontFamily("Garamond");
                                        rw31.setFontSize(8);
                                        rw31.setBold(true);
                                        rw31.setText(formato.format(tipocamb*Double.parseDouble(var96.getText().replace(",",""))));
                                //------------------------------------------------------------
                                   XWPFTableCell celd41 = tbl2.getCell(5);
                                        XWPFParagraph cd41 = celd41.getParagraphArray(0);                                     
                                        XWPFRun rw41 = cd41.createRun();
                                        rw41.setFontFamily("Garamond");
                                        rw41.setFontSize(8);
                                        rw41.setBold(true);
                                        rw41.setText(var97.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell celd51 = tbl2.getCell(6);
                                        XWPFParagraph cd51 = celd51.getParagraphArray(0);                                     
                                        XWPFRun rw51 = cd51.createRun();
                                        rw51.setFontFamily("Garamond");
                                        rw51.setFontSize(8);
                                        rw51.setBold(true);
                                        rw51.setText(String.valueOf(formato.format(tipocamb*Double.parseDouble(var97.getText().replace(",","")))));
                                //------------------------------------------------------------
                                    XWPFTableCell celd61 = tbl2.getCell(7);
                                        XWPFParagraph cd61 = celd61.getParagraphArray(0);                                     
                                        XWPFRun rw61 = cd61.createRun();
                                        rw61.setFontFamily("Garamond");
                                        rw61.setFontSize(8);
                                        rw61.setBold(true);
                                        rw61.setText(var100.getText());
                                //------------------------------------------------------------
                                    XWPFTableCell celd71 = tbl2.getCell(8);
                                        XWPFParagraph cd71 = celd71.getParagraphArray(0);                                     
                                        XWPFRun rw71 = cd71.createRun();
                                        rw71.setFontFamily("Garamond");
                                        rw71.setFontSize(8);
                                        rw71.setBold(true);
                                        //tipocamb*var96.getText();                                       
                                        rw71.setText(String.valueOf(formato.format(tipocamb*Double.parseDouble(var100.getText().replace(",","")))));                                          
                                       // var92.setText(String.valueOf(formato.format(totalvalrepo)));
                                    }
//-------------------------------------------------------------------------------------------------------------------------
                                    if (i==14)
                                    {    
                                        if (var15 != "" || var15 != null) {
                                            
                                        }
                                        // var document = new XWPFDocument();
                                        XWPFTable table = docx.getTables().get(2);
                                        var tableRowTwo = table.getRow(1);
                                        //tableRowTwo.getCell(0).setText("1");
                                        //tableRowTwo.getCell(1).setText("VEHICULO; PLACA: Z6P-265; MARCA: CHEVROLET; SERIE: LZWADAGA9NB029972; MODELO: CAPTIVA, AÑO: 2022, EN BUEN ESTADO DE CONSERVACION");
                                        //System.out.println(table.getText());                                                                              
                                        XWPFTableCell cel = tableRowTwo.getCell(0);
                                        XWPFParagraph c = cel.getParagraphArray(0);
                                        XWPFRun r = c.createRun();
                                        r.setFontFamily("Garamond");
                                        r.setFontSize(12);
                                        r.setText(var15);
                                //---------------------------------------------------------------------------------------
                                        XWPFTableCell cel0 = tableRowTwo.getCell(1);
                                        XWPFParagraph c0 = cel0.getParagraphArray(0);
                                        XWPFRun r0 = c0.createRun();
                                        r0.setFontFamily("Garamond");
                                        r0.setFontSize(12);
                                        
                                        if (var16!="" || var16!=null) {
                                            //var16 = "PLACA: "+var16;
                                             placa = "PLACA: "+var16;
                                        }
                                        if (var17!="" || var17!=null) {
                                            //var17 = ", MARCA: "+var17;
                                             marca = ", MARCA: "+var17;
                                        }
                                        if (var18!="" || var18!=null) {
                                            //var18 = ", SERIE: "+var18;
                                             serie = ", SERIE: "+var18;
                                            
                                        }
                                        if (var19!="" || var19!=null) {
                                            //var19 = ", MODELO: "+var19;
                                             modelo = ", MODELO: "+var19;
                                            
                                        }
                                        if (var20!="" || var20!=null) {
                                            //var20 = ", AÑO: "+var20;
                                             anio = ", AÑO: "+var20;
                                        }
                                        if (var21!="" || var21!=null) {
                                            //var21 = ", ESTADO: "+var21;
                                             estado = ", ESTADO: "+var21;
                                        }
                                        r0.setText("VEHICULO; "+placa+marca+serie+modelo+anio+estado);                        
                                    }
//-------------------------------------------------------------------------------------------------------------------
                                    if (i==23) 
                                    {
                                        if ( dir!=null) {                                         
                                        run.removeTab();
                                        run.addBreak();
                                        InputStream pic = new FileInputStream(dir);
                                        run.addPicture(pic, docx.PICTURE_TYPE_JPEG, "auto"+i, Units.toEMU(210), Units.toEMU(150));                                          
                                        run.addBreak();
                                        pic.close();  
                                            
                                        }                                       
                                    }
//-------------------------------------------------------------------------------------------------------------------
                                    if (i==29)
                                    {
                                        XWPFTable table = docx.getTables().get(3);
                                        var fila1 = table.getRow(0);
                                        fila1.getCell(2).setText(var27.getText());
                                        var fila2 = table.getRow(1);
                                        fila2.getCell(2).setText(var28.getText());
                                        var fila3 = table.getRow(2);
                                        fila3.getCell(2).setText(var29.getText());
                                        var fila4 = table.getRow(3);
                                        fila4.getCell(2).setText(var30.getText());
                                        var fila5 = table.getRow(4);
                                        fila5.getCell(2).setText(var31.getText());
                                        var fila6 = table.getRow(5);
                                        fila6.getCell(2).setText(var32.getText());
                                        var fila7 = table.getRow(6);
                                        fila7.getCell(2).setText(var33.getText());
                                        var fila8 = table.getRow(7);
                                        fila8.getCell(2).setText(var34.getText());
                                        var fila9 = table.getRow(8);
                                        fila9.getCell(2).setText(var35.getText());
                                        var fila10 = table.getRow(9);
                                        fila10.getCell(2).setText(var36.getText());
                                        var fila11 = table.getRow(10);
                                        fila11.getCell(2).setText(var37.getText());
                                        var fila12 = table.getRow(11);
                                        fila12.getCell(2).setText(var38.getText());
                                        var fila13 = table.getRow(12);
                                        fila13.getCell(2).setText(var39.getText());
                                        var fila14 = table.getRow(13);
                                        fila14.getCell(2).setText(var40.getText());
                                        var fila15 = table.getRow(14);
                                        fila15.getCell(2).setText(var41.getText());
                                        var fila16 = table.getRow(15);
                                        fila16.getCell(2).setText(var42.getText());
                                        var fila17 = table.getRow(16);
                                        fila17.getCell(2).setText(var43.getText());
                                        var fila18 = table.getRow(17);
                                        fila18.getCell(2).setText(var44.getText());
                                        var fila19 = table.getRow(18);
                                        fila19.getCell(2).setText(var45.getText());
                                        var fila20 = table.getRow(19);
                                        fila20.getCell(2).setText(var46.getText());
                                        var fila21 = table.getRow(20);
                                        fila21.getCell(2).setText(var47.getText());
                                        var fila22 = table.getRow(21);
                                        fila22.getCell(2).setText(var48.getText());
                                        var fila23 = table.getRow(22);
                                        fila23.getCell(2).setText(var49.getText());                    
                                        //System.out.println(table.getText());                                        
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i==29) {
                                        System.out.println("----------------------"+bandera);
                                       if (bandera==true) {
                                           System.out.println("----------------------"+bandera);
                                        XWPFTable table = docx.getTables().get(4);
                                        var fil1 = table.getRow(0);
                                        fil1.getCell(2).setText(var50.toString());
                                        var fil2 = table.getRow(1);
                                        fil2.getCell(2).setText(var51.toString());
                                        var fil3 = table.getRow(2);
                                        fil3.getCell(2).setText(var52.toString());
                                        var fil4 = table.getRow(3);
                                        fil4.getCell(2).setText(var53.toString());
                                        var fil5 = table.getRow(4);
                                        fil5.getCell(2).setText(var54.toString());
                                        var fil6 = table.getRow(5);
                                        fil6.getCell(2).setText(var55.toString());
                                        var fil7 = table.getRow(6);
                                        fil7.getCell(2).setText(var56.toString());
                                        var fil8 = table.getRow(7);
                                        fil8.getCell(2).setText(var57.toString());
                                        var fil9 = table.getRow(8);
                                        fil9.getCell(2).setText(var58.toString());
                                        var fil10 = table.getRow(9);
                                        fil10.getCell(2).setText(var59.toString());
                                        var fil11 = table.getRow(10);
                                        fil11.getCell(2).setText(var60.toString());
                                        var fil12 = table.getRow(11);
                                        fil12.getCell(2).setText(var61.toString());
                                        var fil13 = table.getRow(12);
                                        fil13.getCell(2).setText(var62.toString());
                                        var fil14 = table.getRow(13);
                                        fil14.getCell(2).setText(var63.toString());
                                        var fil15 = table.getRow(14);
                                        fil15.getCell(2).setText(var64.toString());
                                        var fil16 = table.getRow(15);
                                        fil16.getCell(2).setText(var65.toString());
                                            }                                      
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                  
                                    if (i == 77) {
                                        if (bandera==true) {
                                          num=5; 
                                        }else{
                                            num=4;  
                                        }
                                         XWPFTable table = docx.getTables().get(num);                                     
                                        System.out.println(table.getText());
                                        var tbl1 = table.getRow(1);
                                        var tbl2 = table.getRow(2);                                                                                                                  
                                        /*tbl1.getCell(0).setText("VEHICULO;"+" PLACA: "+var78.getText()+", MARCA: "+var79.getText()+", SERIE: "+var80.getText()
                                                                 +", MODELO: "+var81.getText()+", AÑO: "+var82.getText()+", ESTADO: "+var83.getText());                                       
                                        tbl1.getCell(1).setText(var84.getText());                                        
                                        tbl1.getCell(2).setText(var85.getText());
                                        tbl1.getCell(3).setText(var86.getText());
                                        tbl1.getCell(4).setText(var87.getText());
                                        tbl1.getCell(5).setText(var88.getText());
                                        tbl1.getCell(6).setText(var89.getText());
                                        tbl1.getCell(7).setText(var90.getText());
                                        tbl1.getCell(8).setText(var91.getText());
                                        tbl1.getCell(9).setText(var92.getText());
                                        tbl1.getCell(10).setText(var93.getText());
                                        tbl1.getCell(11).setText(var94.getText());
                                        tbl1.getCell(12).setText(var95.getText());*/
                                //------------------------------------------------------------                                               
                                        XWPFTableCell cell0 = tbl1.getCell(0);
                                        XWPFParagraph c0 = cell0.getParagraphArray(0);
                                        XWPFRun r0 = c0.createRun();
                                        r0.setFontFamily("Garamond");
                                        r0.setFontSize(8);
                                         if (var78.getText()!= "" || var78.getText()!=null) {                                            
                                            //var78.setText(" PLACA: "+var78.getText()) ;
                                            placa1=" PLACA: "+var78.getText();                                           
                                        }
                                        if (var79.getText()!= "" || var79.getText()!=null) {                                            
                                            //var79.setText(", MARCA: "+var79.getText());
                                            marca1 = ", MARCA: "+var79.getText();
                                        }
                                        if (var80.getText()!= "" || var80.getText()!=null) {                                           
                                            //var80.setText(", SERIE: "+var80.getText());
                                            serie1=", SERIE: "+var80.getText();
                                        }
                                        if (var81.getText()!= "" || var81.getText()!=null) {                                           
                                            //var81.setText(", MODELO: "+var81.getText()) ;
                                            modelo1 = ", MODELO: "+var81.getText();
                                        }
                                        if (var82.getText()!= "" || var82.getText()!=null) {                                            
                                            //var82.setText(", AÑO: "+var82.getText());
                                            anio1 = ", AÑO: "+var82.getText();
                                        }
                                        if (var83.getText()!= "" || var83.getText()!=null) {                                            
                                            //var83.setText(", ESTADO: "+var83.getText());
                                            estado1 = ", ESTADO: "+var83.getText();
                                        }
                                        r0.setText("VEHICULO;"+placa1+marca1+serie1
                                                              +modelo1+anio1+estado1);
                                //------------------------------------------------------------
                                        XWPFTableCell cell1 = tbl1.getCell(1);
                                        XWPFParagraph c1 = cell1.getParagraphArray(0);
                                        XWPFRun r1 = c1.createRun();
                                        r1.setFontFamily("Garamond");
                                        r1.setFontSize(8);
                                        r1.setText(var84.getText());
                               //------------------------------------------------------------
                                        XWPFTableCell cell2 = tbl1.getCell(2);
                                        XWPFParagraph c2 = cell2.getParagraphArray(0);                                     
                                        XWPFRun r2 = c2.createRun();
                                        //InputStream pic = new FileInputStream(dir);
                                        //r2.addPicture(pic, docx.PICTURE_TYPE_JPEG, "1", Units.toEMU(200), Units.toEMU(120));
                                        r2.setFontFamily("Garamond");
                                        r2.setFontSize(8);
                                        r2.setText(var85.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell3 = tbl1.getCell(3);
                                        XWPFParagraph c3 = cell3.getParagraphArray(0);
                                        XWPFRun r3 = c3.createRun();
                                        r3.setFontFamily("Garamond");
                                        r3.setFontSize(8);
                                        r3.setText(var86.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell4 = tbl1.getCell(4);
                                        XWPFParagraph c4 = cell4.getParagraphArray(0);
                                        XWPFRun r4 = c4.createRun();
                                        r4.setFontFamily("Garamond");
                                        r4.setFontSize(8);
                                        r4.setText(var87.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell5 = tbl1.getCell(5);
                                        XWPFParagraph c5 = cell5.getParagraphArray(0);
                                        XWPFRun r5 = c5.createRun();
                                        r5.setFontFamily("Garamond");
                                        r5.setFontSize(8);
                                        r5.setText(var88.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell6 = tbl1.getCell(6);
                                        XWPFParagraph c6 = cell6.getParagraphArray(0);
                                        XWPFRun r6 = c6.createRun();
                                        r6.setFontFamily("Garamond");
                                        r6.setFontSize(8);
                                        r6.setText(var89.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell7 = tbl1.getCell(7);
                                        XWPFParagraph c7 = cell7.getParagraphArray(0);
                                        XWPFRun r7 = c7.createRun();
                                        r7.setFontFamily("Garamond");
                                        r7.setFontSize(8);
                                        r7.setText(var90.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell8 = tbl1.getCell(8);
                                        XWPFParagraph c8 = cell8.getParagraphArray(0);
                                        XWPFRun r8 = c8.createRun();
                                        r8.setFontFamily("Garamond");
                                        r8.setFontSize(8);
                                        r8.setText(var91.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell9 = tbl1.getCell(9);
                                        XWPFParagraph c9 = cell9.getParagraphArray(0);
                                        XWPFRun r9 = c9.createRun();
                                        r9.setFontFamily("Garamond");
                                        r9.setFontSize(8);
                                        r9.setText(var92.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell10 = tbl1.getCell(10);
                                        XWPFParagraph c10 = cell10.getParagraphArray(0);
                                        XWPFRun r10 = c10.createRun();
                                        r10.setFontFamily("Garamond");
                                        r10.setFontSize(8);
                                        r10.setText(var93.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell11 = tbl1.getCell(11);
                                        XWPFParagraph c11 = cell11.getParagraphArray(0);
                                        XWPFRun r11 = c11.createRun();
                                        r11.setFontFamily("Garamond");
                                        r11.setFontSize(8);
                                        r11.setText(var94.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell12 = tbl1.getCell(12);
                                        XWPFParagraph c12 = cell12.getParagraphArray(0);
                                        XWPFRun r12 = c12.createRun();
                                        r12.setFontFamily("Garamond");
                                        r12.setFontSize(8);
                                        r12.setText(var95.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell13 = tbl2.getCell(1);
                                        XWPFParagraph c13 = cell13.getParagraphArray(0);
                                        XWPFRun r13 = c13.createRun();
                                        r13.setFontFamily("Garamond");
                                        r13.setFontSize(8);
                                        r13.setText(var84.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell14 = tbl2.getCell(9);
                                        XWPFParagraph c14 = cell14.getParagraphArray(0);
                                        XWPFRun r14 = c14.createRun();
                                        r14.setFontFamily("Garamond");
                                        r14.setFontSize(8);
                                        r14.setText(var92.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell15 = tbl2.getCell(11);
                                        XWPFParagraph c15 = cell15.getParagraphArray(0);
                                        XWPFRun r15 = c15.createRun();
                                        r15.setFontFamily("Garamond");
                                        r15.setFontSize(8);
                                        r15.setText(var94.getText());
                                //------------------------------------------------------------
                                        XWPFTableCell cell16 = tbl2.getCell(12);
                                        XWPFParagraph c16 = cell16.getParagraphArray(0);
                                        XWPFRun r16 = c16.createRun();
                                        r16.setFontFamily("Garamond");
                                        r16.setFontSize(8);
                                        r16.setText(var95.getText());
                                    }
 //---------------------------------------------------------------------------------------------------------------------------
                                    if (i == 108) {
                                        if ( dir1!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();
                                       InputStream pic1 = new FileInputStream(dir1);
                                       
                                       run.addPicture(pic1, docx.PICTURE_TYPE_JPEG, "auto1", Units.toEMU(210), Units.toEMU(140)); 
                                       run.addTab();
                                       pic1.close();
                                        }
                                        }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 108) {
                                        if ( dir2!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic2 = new FileInputStream(dir2);
                                       run.addPicture(pic2, docx.PICTURE_TYPE_JPEG, "auto2", Units.toEMU(210), Units.toEMU(140));                                        
                                        pic2.close();
                                        
                                        }
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 112) {
                                        if ( dir3!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic3 = new FileInputStream(dir3);
                                       run.addPicture(pic3, docx.PICTURE_TYPE_JPEG, "auto3", Units.toEMU(210), Units.toEMU(140)); 
                                       run.addTab(); 
                                       pic3.close();
                                        }
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 112) {
                                        if ( dir4!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic4 = new FileInputStream(dir4);
                                       run.addPicture(pic4, docx.PICTURE_TYPE_JPEG, "auto4", Units.toEMU(210), Units.toEMU(140));                                        
                                        pic4.close();
                                        }
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 116) {
                                        if ( dir5!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic5 = new FileInputStream(dir5);
                                       run.addPicture(pic5, docx.PICTURE_TYPE_JPEG, "auto5", Units.toEMU(210), Units.toEMU(140));                                        
                                       run.addTab();  
                                    }
                                    }                               
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 116) {
                                        if ( dir6!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic6 = new FileInputStream(dir6);
                                       run.addPicture(pic6, docx.PICTURE_TYPE_JPEG, "auto6", Units.toEMU(210), Units.toEMU(140));                                        
                                        pic6.close();
                                        }
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 120) {
                                        if ( dir7!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic7 = new FileInputStream(dir7);
                                       run.addPicture(pic7, docx.PICTURE_TYPE_JPEG, "auto7", Units.toEMU(210), Units.toEMU(140));                                        
                                        run.addTab();
                                        pic7.close();
                                    }
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    
                                    if (i == 120) {
                                        if ( dir8!=null ) {  
                                        System.out.println("****************************************************"+dir1);  
                                       run.removeTab();                                       
                                       InputStream pic8 = new FileInputStream(dir8);
                                       run.addPicture(pic8, docx.PICTURE_TYPE_JPEG, "auto8", Units.toEMU(210), Units.toEMU(140));                                        
                                        pic8.close();
                                        }
                                    }
//---------------------------------------------------------------------------------------------------------------------------                                    

                                }
                            }
                        }
                        
                    }
                }
                /* XWPFTable table1 = docx.getTables().get(1);
                System.out.println(table1.getText());
                for (int j = 0; j < 23; j++)
                {
                table1.removeRow(0);
                }*/
                /*   XWPFDocument docx= new XWPFDocument(new FileInputStream("C:\\Users\\juan_\\OneDrive\\Escritorio\\formatos\\vehiculos.docx"));
                XWPFWordExtractor we = new XWPFWordExtractor(docx);
                System.out.println(we.getText());
                         
                for (int i = 0; i < we.getText().length(); i++) {
                System.out.println(we.getText());
                System.out.println(i+"--------------------------------------");
                }*/                
                FileOutputStream ouputStream = new FileOutputStream("src\\main\\resources\\formatos\\vehiculoscopia.docx");
                docx.write(ouputStream);
                ouputStream.close();                                
            }         
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Máster");
                alert.setHeaderText("Documento Generado");
                alert.setContentText("Documento Generado con éxito!");
                alert.showAndWait();
                Runtime.getRuntime().exec("cmd /c start "+file.toString()); 
        //Platform.exit();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
public static String changeValue(String value, Map<String, String> textMap){
        Set<Entry<String, String>> textSets = textMap.entrySet();
        for (Entry<String, String> textSet : textSets) {
            // Hacer coincidir plantilla y valor de reemplazo Formato $ {clave}
            String key = "${"+textSet.getKey()+"}";
            if(value.indexOf(key)!= -1){
                value = textSet.getValue();
            }
        }
        // La plantilla no coincide con el área y se reemplaza por una vacía
       /* if(checkText(value)){
            value = "";
        }*/
        return value;
    }    
//-----------------------------------------------------------------------------------------------------------------------
    public static boolean checkText(String text,List<String> variables){
        boolean check  =  false;
        for (int i = 0; i < variables.size(); i++) {
            if(text.indexOf(variables.get(i))!= -1){
            check = true;
            break;
        }           
        }     
        return check;
    }
//----------------------------------------------------------------------------------------------------------------------
 public static void compar(String text,List<String> variables,List<String> vari){
        result = null;
        var = null;
        for (int i = 0; i < variables.size(); i++) {
            if(text.indexOf(vari.get(i),0)!=-1){
                 result = variables.get(i);
                 var = vari.get(i);                
            break;
        }           
        }
    } 
//----------------------------------------------------------------------------------------------------------------------
    @Override
    public void initialize(URL url, ResourceBundle rb) {      
        //Connect();       
        var year = LocalDate.now().getYear();
        var1.setText(String.valueOf(year));
        //var11.setValue(LocalDate.now());
    }       
}