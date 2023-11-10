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
public class Cafeteria {
    ArrayList <Producto> Inventario;
    ArrayList <Venta> Ventas;
    
    Cafeteria(){
        Inventario=new ArrayList();
        Ventas=new ArrayList();
    }
    
    public void addProducto(Producto P)
    {
        Inventario.add(P);
    }
    
    public void addProducto(String N,String D)
    {
        Producto Temporal;
        Temporal=new Producto();
        Temporal.setNombre(N);
        Temporal.setDescripcion(D);
        addProducto(Temporal);
    }
    
    public boolean eliminarProducto(int index)
    {
        Inventario.remove(index);
        return true;       
    }
    
    public int getNumProductos(){
        return Inventario.size();
    }
    
    public Producto getProducto(int index){
        return Inventario.get(index);
    }
    
    public void addVenta(Venta V){
        Ventas.add(V);       
    }
    
    public int getNumVentas(){
        return Ventas.size();
    }
    
    public Venta getVenta(int index){
        return Ventas.get(index);
    }
}
