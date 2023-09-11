/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

/**
 *
 * @author DiegoAzael
 */

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
public class Operacionesmatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        double L1 = 4, L2 = 3;
        
        double a1, a2, x, y;
        Scanner Articulaciones;
        Articulaciones = new Scanner(System.in);
        System.out.println("Ingresa los ángulos a1 y a2: ");
        a1 = Articulaciones.nextDouble();
        a2 = Articulaciones.nextDouble();
          x = L1*cos(a1*PI/180)+L2*cos((a1+a2)*PI/180);
          y = L1*sin(a1*PI/180)+L2*sin((a1+a2)*PI/180);
          
        System.out.println("X = " + x + "& Y = " + y);
        
      
        
      
        
    }
}
