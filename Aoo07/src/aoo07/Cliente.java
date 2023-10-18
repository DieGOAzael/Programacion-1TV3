/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aoo07;

import java.util.ArrayList;

/**
 *
 * @author sala11
 */
public class Cliente {
    
    protected String Nombre;
    protected int edad;
    private ArrayList <Cuenta> Cuentas;
    
    //El constructor de la clase
    //En este caso estamos usando ArrayList y estos se tienen que inicializar para que no de error
    public Cliente(){
        Cuentas = new ArrayList();
    }
    
    public void AsignarNombre(String Nombre){
        //Al poner this. nos referimos a la variable Nombre de este método
        //Si no tuviera eso se estaría trabajando con el parámetro Nombre que es el protected
        this.Nombre = Nombre;
    }
    
    public boolean AsignarEdad(int E){
        if (E > 18) {
            edad = E;
            return true;
        }
        return false;
    }
    
    public void AgregarCuenta(Cuenta c){
        Cuentas.add(c);
    }
    
    public int ObtenerNumCuentas(){
        return Cuentas.size();
    }
    
    public Cuenta ObtenerCuenra (int index){
        
        if ((index < 0) || (ObtenerNumCuentas()==0) || (index >= ObtenerNumCuentas())) {
            return null;
        }
            return Cuentas.get(index);
            
    }
    
    public String ObtenerNombre(){
        //Nombre es el parámetro global ya que no existe ninguna otra cosa llamada "Nombre"
        return Nombre;
    }
    public int ObtenerEdad(){
        return edad;
    }
    
}
