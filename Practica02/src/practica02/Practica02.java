/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author DiegoGo
 */
public class Practica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problemática ¿Cuáles son los pasos necesarios para realizar un programa en Java que 
        //determine las raíces reales  de una ecuación cuadrática de segundo orden mediante la formula general?
        
        
         
         double a, b, c, x1, x2;
        
         Scanner leervar;
         leervar = new Scanner(System.in);
         
         System.out.println("Ingrese una ecuacion cuadrática para determinar sus raices reales: ");
         System.out.println("Considere que una ecuación cuadrática se expresa de la forma ax^2+bx+c=0");
         
         System.out.println("Ingrese el valor de a: ");
         a = leervar.nextDouble();
          
         System.out.println("Ingrese el valor de b: ");
         b = leervar.nextDouble(); 
         
         System.out.println("Ingrese el valor de c: ");
         c = leervar.nextDouble();
         
         System.out.println("La ecuación a calcular será la siguiente: " + a +"x^2+" + b + "x+" + c + "=0");
             
         x1 = (-b + sqrt(pow(b,2)-4*a*c))/(2*a);
         x2 = (-b - sqrt(pow(b,2)-4*a*c))/(2*a);
          
         
         
         System.out.println("Los resultados son x1: " + x1 + " x2: " + x2 );
         //ya quedo
    }
}
