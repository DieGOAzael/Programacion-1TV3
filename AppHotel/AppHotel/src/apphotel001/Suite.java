/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apphotel001;

/**
 *
 * @author sala11
 */
public class Suite extends Habitacion{
    String Servicio;
    
    //No creo que sea necesario hcaer mucho en esta clase ya que se puede trabjar de manera simple en el main

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }
    
    
}
