/*
        CLASE PUBLICA QUE MANEJA EL SALDO Y LA ADMINISTRACIÓN DE CADA CUENTA
        BGD 2MV5 PA
 */
package appbanco;

public abstract class Cuenta {   
    //ATRIBUTOS
    protected int       numcuenta;
    protected double    saldo;
    
    //METODOS
    public boolean AsignarNumeroCuenta(int d){
        if (d>0){
            numcuenta=d;
            return true;
        }
        return false;
    }
    
    public boolean AbonarDinero(double d){
        if (d>0){
            saldo=saldo+d;
            return true;
        }
        return false;
    }
    
    public boolean RetirarDinero(double d){
        if (saldo>=d){
            saldo=saldo-d;
            return true;
        }
        return false;
    
    }
    
    public double ObtenerSaldo(){
        return saldo;
    }
    
    public int ObtenerNumCuenta(){
        return numcuenta;
    }
}
