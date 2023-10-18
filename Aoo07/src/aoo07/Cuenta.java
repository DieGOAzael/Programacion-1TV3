/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aoo07;

/**
 *
 * @author sala11
 */
public class Cuenta {
    
    protected int numcuenta;
    protected double saldo;
    
    public boolean AsignarNumeroCuenta (int d){
        
        if (d > 0) {
            numcuenta = d;
            return true;
        }
        return false;
    }
    
    public boolean AbodonarDinero (double d){
        if (d > 0) {
            saldo = saldo + d;
            return true;
        }
        return false;
    }
    
    public boolean RetirarDinero (double d){
        
        if (saldo >= d ) {
            saldo = saldo - d;
            return true;
        }
        return false;
    }
    
    public double ObtenerSaldo (){
        return saldo;
    }
    
    public double ObtenerNumCuenta(){
        return numcuenta;
    }
    
}
