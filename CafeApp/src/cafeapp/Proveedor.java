/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

import java.util.ArrayList;

/**
 *
 * @author sala11
 */
public class Proveedor {
    String Nombre;
    String Dirección;
        ArrayList <Producto> Catalogo;

    public ArrayList<Producto> getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(ArrayList<Producto> Catalogo) {
        this.Catalogo = Catalogo;
    }


    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void agregarProducto(Producto producto) {
        if (Catalogo == null) {
            Catalogo = new ArrayList<>();
        }
        Catalogo.add(producto);
    }
    
      // Método para obtener un Producto del inventario ESTO AL FINAL NO SIRVEE
    public Producto getProductoDelCatalogo(int index) {
        return Catalogo.get(index);
    }


   
}
