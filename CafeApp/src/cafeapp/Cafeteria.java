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
    ArrayList <ProductoProveedor> Catalogo;
    ArrayList<Producto> Inventario;
    ArrayList<Venta> Ventas;

    Cafeteria() {
        Inventario = new ArrayList<>();
        Ventas = new ArrayList<>();
        Catalogo = new ArrayList<>();
    }

    // Método para agregar un Producto al inventario
    public void addProducto(Producto producto, ProductoProveedor catalogo) {
        Inventario.add(producto);
        Catalogo.add(catalogo);
    }

    // Método para eliminar un Producto del inventario
    public boolean eliminarProducto(int index) {
        Inventario.remove(index);
        return true;
    }

    // Método para obtener el número de productos en el inventario
    public int getNumProductos() {
        return Inventario.size();
    }

    // Método para obtener un Producto del inventario
    public Producto getProducto(int index) {
        return Inventario.get(index);
        
    }
    //es necesario?
    public ProductoProveedor getProductoP(int index){
        return Catalogo.get(index);
    }

    // Método para agregar una venta al historial de ventas
    public void addVenta(Venta V) {
        Ventas.add(V);
    }

    // Método para obtener el número de ventas en el historial
    public int getNumVentas() {
        return Ventas.size();
    }

    // Método para obtener una venta del historial
    public Venta getVenta(int index) {
        return Ventas.get(index);
    }
    
    
}
