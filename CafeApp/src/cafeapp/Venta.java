/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

import java.util.ArrayList;

/**
 *
 * @author ivazq
 */
public class Venta {
    ArrayList <VentaProducto> Ventas;
    int idVenta;
    String Fecha;
   
     String NCliente;

    public String getNCliente() {
        return NCliente;
    }

    public void setNCliente(String NCliente) {
        this.NCliente = NCliente;
    }
    
    Venta(){
        Ventas=new ArrayList();
    }
    
    void addProducto(VentaProducto V)
    {
        Ventas.add(V);
    }
    
    public int getNumProductos(){
        return Ventas.size();
    }
    
    public VentaProducto getProducto(int index){
        return Ventas.get(index);
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
