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
                    Inventario I;
                    I = new Inventario();
                    I.VerInventario();
                    
                    break;
                
                case 2:
                    System.out.println("2.-Agregar a inventario");
                    Inventario A;
                    A = new Inventario();
                    //Aqui se agrega un medicamento
                    //A.AgregarMedicamento();
                    break;
                case 3:
                    System.out.println("3.-Vender");
                    //Aqui se vende
                    break;
                case 4:
                    System.out.println("4.-Salir");
                    //Aqui se sale xd
                    break;
            }
        } while (opc == 7);
        
        
    }
}
