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
public class Banco {
    
    protected String nombre;
    protected String direccion;
    private ArrayList <Cliente> clientes;
    //Aqui hya dos formas de crear un objeto banco
    //Tipo en este primero namas se inicializa el arraylist pero también se inicializan direccion y nombre
    public  Banco(){
        clientes = new ArrayList();
        
    }
    //En este segundo se inicializa el nombre y la direccion PERO no el ArrayList
    public Banco (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void AgregarCliente (Cliente Ce){
        if (clientes == null) {
            clientes = new ArrayList ();
        }
        clientes.add(Ce);
    }
    
    public int ObtenerNumClientes (){
        return clientes.size();
    }
    
    public Cliente ObtenerCliente (int index){
        return clientes.get(index);
    }
    
    public void AsignarDatosdelBanco(String n, String d){
        nombre = n;
        direccion = d;
    }
    
    public String ObtenerNombre (){
        return nombre;
    }
    
    public String ObtenerDireccion(){
        return direccion;
    }
    
}
