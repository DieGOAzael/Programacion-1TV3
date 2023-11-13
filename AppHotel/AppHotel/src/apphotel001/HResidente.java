/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apphotel001;

/**
 *
 * @author sala11
 */
public class HResidente extends Habitacion{
    
    String NombreInquilino;
    String SexoInquilino;
    int EdadInquilino;
    double MontoPagado;
    int TiempoRentado;

    public int getEdadInquilino() {
        return EdadInquilino;
    }

    public void setEdadInquilino(int EdadInquilino) {
        this.EdadInquilino = EdadInquilino;
    }

    public double getMontoPagado() {
        return MontoPagado;
    }

    public void setMontoPagado(double MontoPagado) {
        this.MontoPagado = MontoPagado;
    }

    public String getNombreInquilino() {
        return NombreInquilino;
    }

    public void setNombreInquilino(String NombreInquilino) {
        this.NombreInquilino = NombreInquilino;
    }

    public String getSexoInquilino() {
        return SexoInquilino;
    }

    public void setSexoInquilino(String SexoInquilino) {
        this.SexoInquilino = SexoInquilino;
    }

    public int getTiempoRentado() {
        return TiempoRentado;
    }

    public void setTiempoRentado(int TiempoRentado) {
        this.TiempoRentado = TiempoRentado;
    }
    
    
    
}
