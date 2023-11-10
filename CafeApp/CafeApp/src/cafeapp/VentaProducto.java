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
public class VentaProducto {
    Producto IdProducto;
    int Cantidad;

    public Producto getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Producto IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
