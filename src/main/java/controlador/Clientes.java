/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.ComboBox;

public class Clientes {
   
    private final StringProperty numero;
    private final StringProperty Fecha;
    private final StringProperty FechaPago;
    private final StringProperty cotizacion;
    private final StringProperty tasacion;
    private final StringProperty  empresa;
     private final StringProperty agencia;
    private final StringProperty contacto;
    private final StringProperty ubicacion;
    private final StringProperty  cliente;
    private final StringProperty perito;
    private final StringProperty costo;
    private final StringProperty tipo;
    private final StringProperty  descripcion;
    private final StringProperty  estado;
    private final StringProperty  comprobantes;
    public Clientes()
    {
        numero = new SimpleStringProperty(this, "numero");
        Fecha = new SimpleStringProperty(this, "Fecha");
        cotizacion = new SimpleStringProperty(this, "cotizacion");
        tasacion = new SimpleStringProperty(this, "tasacion");
        empresa = new SimpleStringProperty(this, "empresa");
        agencia = new SimpleStringProperty(this, "agencia");
        contacto = new SimpleStringProperty(this, "contacto");
        ubicacion = new SimpleStringProperty(this, "ubicacion");
        cliente = new SimpleStringProperty(this, "cliente");
        perito = new SimpleStringProperty(this, "perito");
        costo = new SimpleStringProperty(this, "costo");
        tipo = new SimpleStringProperty(this, "tipo");
        descripcion = new SimpleStringProperty(this, "descripcion");
        estado = new SimpleStringProperty(this, "estado");
        FechaPago = new SimpleStringProperty(this, "FechaPago");
        comprobantes = new SimpleStringProperty(this, "comprobantes");
    }
    
    public StringProperty numeroProperty() { return numero; }
    public String getnumero() { return numero.get(); }
    public void setnumero(String newnumero) { numero.set(newnumero); }
    
    public StringProperty FechaProperty() { return Fecha; }
    public String getFecha() { return Fecha.get(); }
    public void setFecha(String newFecha) { Fecha.set(newFecha); }
 
    public StringProperty cotizacionProperty() { return cotizacion; }
    public String getcotizacion() { return cotizacion.get(); }
    public void setcotizacion(String newcotizacion) { cotizacion.set(newcotizacion); }
 
    public StringProperty tasacionProperty() { return tasacion; }
    public String gettasacion() { return tasacion.get(); }
    public void settasacion(String newtasacion) { tasacion.set(newtasacion); }
    
    public StringProperty empresaProperty() { return empresa; }
    public String getempresa() { return empresa.get(); }
    public void setempresa(String newempresa) { empresa.set(newempresa); }
    
    public StringProperty agenciaProperty() { return agencia; }
    public String getagencia() { return agencia.get(); }
    public void setagencia(String newagencia) { agencia.set(newagencia); }
 
    public StringProperty contactoProperty() { return contacto; }
    public String getcontacto() { return contacto.get(); }
    public void setcontacto(String newcontacto) { contacto.set(newcontacto); }
 
    public StringProperty ubicacionProperty() { return ubicacion; }
    public String getubicacion() { return ubicacion.get(); }
    public void setubicacion(String newubicacion) { ubicacion.set(newubicacion); }
    
    public StringProperty clienteProperty() { return cliente; }
    public String getcliente() { return cliente.get(); }
    public void setcliente(String newcliente) { cliente.set(newcliente); }
    
    public StringProperty peritoProperty() { return perito; }
    public String getperito() { return perito.get(); }
    public void setperito(String newperito) { perito.set(newperito); }
 
    public StringProperty costoProperty() { return costo; }
    public String getcosto() { return costo.get(); }
    public void setcosto(String newcosto) { costo.set(newcosto); }
 
   /* public StringProperty tipoProperty() { return tipo; }
    public String gettipo() { return tipo.get(); }
    public void settipo(String newtipo) { tipo.set(newtipo); }
    */
    public StringProperty descripcionProperty() { return descripcion; }
    public String getdescripcion() { return descripcion.get(); }
    public void setdescripcion(String newdescripcion) { descripcion.set(newdescripcion); }
    
    public StringProperty estadoProperty() { return estado; }
    public String getestado() { return estado.get(); }
    public void setestado(String newestado) { estado.set(newestado); }
    
    public StringProperty FechaPagoProperty() { return FechaPago; }
    public String getFechaPago() { return FechaPago.get(); }
    public void setFechaPago(String newFechaPago) { FechaPago.set(newFechaPago); }
    
    public StringProperty comprobantesProperty() { return comprobantes; }
    public String getcomprobantes() { return comprobantes.get(); }
    public void setcomprobantes(String newcomprobantes) { comprobantes.set(newcomprobantes); }
       

}
