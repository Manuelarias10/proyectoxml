/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivo;

import java.awt.TextField;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author juan_manuel.arias
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lNombre;
      @FXML
    private Label lDireccion;
        @FXML
    private Label lEdad;
          @FXML
    private Label lCodigoEmpleado;
            @FXML
    private Label lDepartamento;
            
        @FXML   
       private TextField LNombre;
        
         @FXML   
       private TextField LDireccion;
          @FXML   
       private TextField LEdad;
           @FXML   
       private TextField LCodigoEmpleado;
            @FXML   
       private TextField LDepartamento;
    
            
      
    
    LinkedList<Empleado>EgregarEmpleado;
    
         @FXML   
       private void AgregarEmpleadoLista(ActionEvent event){
    
     String nombre= LNombre.getText();
     String direccion = LDireccion.getText();
     int edad =Integer.parseInt(LEdad.getText());
      String codigoEmpleado= LCodigoEmpleado.getText();
     String departamento = LDepartamento.getText();
       }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
