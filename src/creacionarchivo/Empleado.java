/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivo;

import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author juan_manuel.arias
 */
class Empleado {

    boolean crearFileXML(LinkedList<Empleado> EgregarEmpleado) {
      try{
          Element company= new Element("company");
          Document doc = new Document(company);
          Element staff =new Element("staff");
                 staff.addContent(new Element( "Nombre").setText(ListaEmpleados.get(i).getDireccion())); 
      }
    }
    
}
