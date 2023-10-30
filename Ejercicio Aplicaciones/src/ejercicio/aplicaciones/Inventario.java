/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.aplicaciones;

import java.util.ArrayList;

/**
 *
 * @author sala11
 */
public class Inventario {
    int CantidadDisponible;
    boolean Hay;
    int CRebastecer;
    ArrayList <Medicamento> Medicamento;
    ArrayList <Venta> Venta;
    
    public void VerInventario(){
        
        for (int i = 0; i < Medicamento.size(); i++) {
            System.out.println(Medicamento);
        }
    }
    
    public void Vender(){

          System.out.println("Que medicamento quieres vender?");
          VerInventario();
          System.out.println("Elije el medicamento: ");
         int med=0;
         
         switch (med){
             case 1:
                   Inventario V;
                   V = new Inventario();
                 V.AgregarVenta(CantidadDisponible, CantidadDisponible);
                 break;
             case 2:
                 
                   V = new Inventario();
                 V.AgregarVenta(CantidadDisponible, CantidadDisponible);
                 break;
             case 3:
                
                   V = new Inventario();
                 V.AgregarVenta(CantidadDisponible, CantidadDisponible);
                 break;
             default:
                 break;
         }
        
          
    }
    
     
    public void AgregarMedicamento(String Nombre, int Tipo, double Costo, int EdadApropiada){
        Medicamento P;
        P = new Medicamento();
        P.setNombre(Nombre);
        P.setCosto(Costo);
        P.setTipo(Tipo);
        P.setEdadApropiada(EdadApropiada);
        Medicamento.add(P);
        
    }

   
    public void AgregarVenta(int CantidadVendida, double GananciaTotalM){
        Venta V;
        V = new Venta();
        V.setCantidadVendida(CantidadVendida);
        V.setGananciaTotalM(GananciaTotalM);
        Venta.add(V);
        
    }

  
   
}
