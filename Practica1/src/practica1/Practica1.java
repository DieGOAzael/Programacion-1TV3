/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Diego Azael
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double fahrenheit, celsius;
        
        Scanner leerGrados;
        leerGrados = new Scanner (System.in);
        
        
        System.out.println("Conversion de grados Fahrenheit a Celsius");
        System.out.println("Ingresa los grados Fahrenheit: ");
        
        fahrenheit = leerGrados.nextDouble();
        
        
       celsius = ((fahrenheit - 32)*5/9);
        System.out.println("Proceso exitoso");
        
        System.out.println("Conversion a Celsius: " + celsius + "°");
    }
}
