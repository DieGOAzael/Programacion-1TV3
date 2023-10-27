/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.aplicaciones;

/**
 *
 * @author sala11
 */
public class Medicamento {
    String Nombre;
    int Tipo;
    double Costo;
    //int Cantidad;
    int EdadApropiada;

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public int getEdadApropiada() {
        return EdadApropiada;
    }

    public void setEdadApropiada(int EdadApropiada) {
        this.EdadApropiada = EdadApropiada;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
}
