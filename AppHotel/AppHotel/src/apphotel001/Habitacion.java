/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphotel001;

import java.util.ArrayList;

/**
 *
 * @author Israel Cianca
 */
public class Habitacion {
    protected int numCamas;
    protected int IDHabitacion;
    ArrayList<Suite> HSuite;
    ArrayList<HResidente> HResidente;
    ArrayList<HGrupal> HGrupal;

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getIDHabitacion() {
        return IDHabitacion;
    }

    public void setIDHabitacion(int IDHabitacion) {
        this.IDHabitacion = IDHabitacion;
    }
    
}
