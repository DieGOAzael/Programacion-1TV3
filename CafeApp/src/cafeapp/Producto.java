/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

/**
 *
 * @author ivazq
 */
public class Producto {
    String Nombre;
    String Descripcion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    @Override
    public String toString(){
        String Prod;
        Prod="Nombre:"+Nombre+" Descripcion:"+Descripcion;
        return Prod;
    }
    
}
