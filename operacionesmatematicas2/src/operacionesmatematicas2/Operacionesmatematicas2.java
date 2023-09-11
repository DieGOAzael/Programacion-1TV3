/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas2;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.*;

/**
 *
 * @author Sala11
 */
public class Operacionesmatematicas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
          
         double a1, a2, x, y;
         double L1 = 4, L2 = 3, L3;
         double alfa, beta, gama;
         
         
        Scanner Tec;
        Tec = new Scanner(System.in);
        System.out.println("Ingresa los valores de X & Y: ");
        
        x = Tec.nextDouble();
        y = Tec.nextDouble();
        
        L3 = Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
        alfa = Math.atan(y/x);
        beta = acos((Math.pow(L1, 2)+ Math.pow(L3,2)- Math.pow(L2,2))/(2*L1*L3));
        a1 = alfa - beta;
        System.out.println("El valor de a1 es " + Math.toDegrees(a1));
        
        gama = acos((Math.pow(L1, 2)+ Math.pow(L2,2)- Math.pow(L3,2))/(2*L1*L2));
        
        a2 =Math.PI - gama;
        
        System.out.println("Los resultados, a1= " + a1 + "y a2= " + a2);
        
    }
}
