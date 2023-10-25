/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06;

/**
 *
 * @author sala11
 */
public class Habitaciones {
   
    int NumHabitacion;
    int Costo;
    int NumCuartos;
    int Tipo; //(0.-Sencilla, 1.-Doble, 2.-Suite, 3.-...)

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getNumCuartos() {
        return NumCuartos;
    }

    public void setNumCuartos(int NumCuartos) {
        this.NumCuartos = NumCuartos;
    }

    public int getNumHabitacion() {
        return NumHabitacion;
    }

    public void setNumHabitacion(int NumHabitacion) {
        this.NumHabitacion = NumHabitacion;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    
    
    
    
}
