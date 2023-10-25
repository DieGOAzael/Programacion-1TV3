/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06;

import java.util.ArrayList;

/**
 *
 * @author sala11
 */
public class Cliente {
    
    String Nombre;
    int edad;
    
    
     public void AsignarNombre(String Nombre){
        //Al poner this. nos referimos a la variable Nombre de este método
        //Si no tuviera eso se estaría trabajando con el parámetro Nombre que es el protected
        this.Nombre = Nombre;
    }
    
    public boolean AsignarEdad(int E){
        if (E > 18) {
            edad = E;
            return true;
        }else{
            System.out.println("No eres mayor de edad");
        }
        return false;
    }
    
    
    
    public String ObtenerNombre(){
        //Nombre es el parámetro global ya que no existe ninguna otra cosa llamada "Nombre"
        return Nombre;
    }
    public int ObtenerEdad(){
        return edad;
    }
    
    
    
    
}
