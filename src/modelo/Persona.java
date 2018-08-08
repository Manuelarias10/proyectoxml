/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_manuel.arias
 */
public class Persona {
    
    private String Nombre;
        
    private String direccion;
    
  
     private int EDAD;

    /**
     * Get the value of EDAD
     *
     * @return the value of EDAD
     */
    public int getEDAD() {
        return EDAD;
    }

    /**
     * Set the value of EDAD
     *
     * @param EDAD new value of EDAD
     */
    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }


    


    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}
