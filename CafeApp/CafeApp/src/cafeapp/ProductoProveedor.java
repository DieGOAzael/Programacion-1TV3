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
    Proveedor Pr;
    ArrayList <Proveedor> Proveedor;
    //ArrayList <ProductoProveedor> Catalogo;
    ArrayList <Producto> Catalogo;
    
     Scanner txt = new Scanner(System.in);
     
    public void CrearCatalogo(Proveedor Pr, Producto P){
        
        System.out.println("Ingrese su nombre de Proveedor: ");
       
        String Nombre = txt.nextLine();
        Pr.setNombre(Nombre);
        System.out.println("Y su dirección: ");
        String Dirección = txt.nextLine();
        Pr.setDirección(Dirección);
        
      addProducto(P);
         
    }
    
    public void addProducto(Producto P)
    {
        Catalogo.add(P);
    }
    
    public void addProducto(String N,String D)
    {
        Producto Temporal;
        Temporal=new Producto();
        Temporal.setNombre(N);
        Temporal.setDescripcion(D);
        addProducto(Temporal);
    }
    
}
