/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.aplicaciones;

/**
 *
 * @author sala11
 */
public class EjercicioAplicaciones {

  
    public static void main(String[] args) {
        
        
        //Gestion de medicamentos en una farmacia
        
        //Clase Farmacia
        //Clase Medicamento
        //Clase Inventario (agregar,vender,ver)
        //Clase venta
        
        
        //Programa que va a gestionar medicamentos, con ventas, ver los medicamentos, agregar medicamentos y ya
        int opc=0;
        
        System.out.println("BUENAS, FARMCIA, SI");
        
        
        do {
            switch(opc){
                case 1:
                    System.out.println("1.-Ver inventario");
                    break;
                case 2:
                    System.out.println("2.-Vender");
                    break;
                case 3:
                    System.out.println("3.-Salir");
                    break;
            }
        } while (opc == 7);
        
        
    }
}
