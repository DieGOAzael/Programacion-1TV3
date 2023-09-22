/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica03;

/**
 *
 * @author DiegoGo
 */


import java.util.Scanner;

public class Practica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int ncompus;
    //umbral=ancho de banda
    double umbral, bandaCU, promedio, bandasuma = 0;
    
    Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Ingresa el numero de equipos de computo: ");
        ncompus = scan.nextInt();
        System.out.println("Ingresa el valor del ancho de banda de red aceptable para los equipos: ");
        umbral = scan.nextDouble();
        System.out.println("Valor registrado");
        int i;
         for (i = 1; i <= ncompus; i ++){
             
             System.out.println("Equipo "+i+" <--Ingresa el Ancho de banda de este equipo : ");
             
            bandaCU = scan.nextDouble();
            
            bandasuma =  bandasuma + bandaCU;
            
             System.out.println("Suma: " + bandasuma);
        }
        
         //System.out.println("Lo que se uso despues del for: " + bandasuma);
         promedio =  bandasuma/ncompus;
         
         if (promedio <= umbral) {
             
             
             System.out.println("El promedio de la ancha de banda utilizado por las computadoras es de: " + promedio);
             System.out.println("El ancho de banda es suficiente");
            System.out.println("Ancho de banda disponible total --> " + umbral + "Promedio usado --> " + promedio);
        } else if (promedio > umbral) {
            System.out.println("El promedio de la ancha de banda utilizado por las computadoras es de: " + promedio);
             System.out.println("El ancho de banda NO es suficiente");
             
             System.out.println("Ancho de banda disponible total --> " + umbral + "Promedio usado --> " + promedio);
         }
         
   
    }
}
