/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sala11
 */
public class ProductoProveedor extends Proveedor{
    //Proveedor Pr;
    //ArrayList <Proveedor> Proveedor;
    //ArrayList <Producto> Catalogo;
    ProductoProveedor() {
        Catalogo = new ArrayList<>();  
    }
    
     Scanner txt = new Scanner(System.in);
     
    public void CrearCatalogo(Proveedor Pr, Producto P){
        
        System.out.println("Ingrese su nombre de Proveedor: ");
       
        String Nombre = txt.nextLine();
        Pr.setNombre(Nombre);
        System.out.println("Y su dirección: ");
        String Dirección = txt.nextLine();
        Pr.setDirección(Dirección);
        
      Pr.agregarProducto(P);
         
    }
    
    @Override
    public String toString() {
        // Asegúrate de implementar toString de manera adecuada
        return "Nombre: " + getNombre() + " Dirección: " + getDirección();
    }
    
   
  

    
}
