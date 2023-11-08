/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

/**
 *
 * @author sala11
 */
public class CuentraCredito extends Cuenta{
    double LimiteCredito;
    
    //Override es para cuando hay un metodo que se llama igual se use el de esta clase heredada
    //Aqui cambia el comportamiento, puede ser en objetos (polimorfismo)
    
    @Override
    public boolean RetirarDinero(double Retiro){
        if ((-saldo+Retiro)<=LimiteCredito) {
            saldo = saldo - Retiro;
            return true;
        }
        return false;
    }
    
    public void setLimite (double L){
        LimiteCredito = L;
    }
}
