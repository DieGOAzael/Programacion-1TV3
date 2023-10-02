/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app05;

/**
 *
 * @author sala11
 */

import java.util.ArrayList;
import java.util.Scanner;
public class App05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ArrayList <String> Contactos;
        Contactos = new ArrayList();
        int opc=0;
        String Nombre;
        
        do {
            System.out.println("-----------------Agenda---------------");
            System.out.println("1.- Agregar contacto");
            System.out.println("2.- Listar contactos");
            System.out.println("3.- Eliminar contactos");
            System.out.println("Elige una opcion (1-3)");
            opc = Opcion();
            
            switch (opc) {
                
                case 1: AgregarContacto(Contactos); break;
                case 2: ListarContactos(Contactos); break;
                case 3: EliminarContacto(Contactos); break;
                
            }
        } while (opc != 9);
        
        
    }
    
    
    static void EliminarContacto(ArrayList C){
        
        ListarContactos (C);
        System.out.println("Ingresa el indice de contacto");
        int opc;
        opc = Opcion ();
        C.remove (opc -1);
        
    }
    
    static void AgregarContacto(ArrayList C){
        
        String Nombre;
        System.out.println("Ingresa el nombre del contacto: ");
        Nombre = Texto();
        C.add(Nombre);
        
    }
    
    static void ListarContactos (ArrayList C){
        
        int Tam;
        Tam = C.size();
        System.out.println("*******Tus contactos son: ");
        for (int i = 0; i < Tam; i++) {
            System.out.println((i+1) + " " + C.get(i));
        }
        
    }
    
    static int Opcion(){
        Scanner Teclado;
        Teclado = new Scanner(System.in);
        return Teclado.nextInt();
        
    }
    
    static String Texto(){
        Scanner Teclado;
        Teclado = new Scanner (System.in);
        return Teclado.nextLine();
        
    }
}
