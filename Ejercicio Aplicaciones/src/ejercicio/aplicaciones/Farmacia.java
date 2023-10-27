/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.aplicaciones;

import java.util.ArrayList;

/**
 *
 * @author sala11
 */
public class Farmacia {
    String Nombre;
    int Calle;
    ArrayList <Inventario> Inventario;
    public void NombreFarmacia(String Nombre){
        this.Nombre = Nombre;
    }
    
     public void Calle(int Calle){
        this.Calle = Calle;
    }
    
     
     
}
