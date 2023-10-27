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
    
    public void VerInventario(){
        
        for (int i = 0; i < Medicamento.size(); i++) {
            System.out.println(Medicamento);
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
    
   
}
