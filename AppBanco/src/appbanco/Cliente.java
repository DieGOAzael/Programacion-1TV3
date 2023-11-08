/*
        CLASE PUBLICA QUE MANEJA LOS DATOS PERSONALES COMO LO SON NOMBRE Y 
        EDAD ASI COMO LAS CUENTAS DE CADA CLIENTE
        BGD 2MV5 PA
 */
package appbanco;
import java.util.ArrayList;

public class Cliente {
    //ATRIBUTOS
    protected String            nombre;
    protected int               edad;
    private ArrayList <Cuenta>  Cuentas;
    
    //METODOS
    public Cliente(){
        Cuentas=new ArrayList();
    }
    
    public void AsignarNombre(String S){
        nombre=S;
    }
    
    public boolean AsignarEdad(int E){
        if (E>=18){
            edad=E;
            return true;
        }
        return false;
    }
    
    public void AgregarCuenta(Cuenta c){
        Cuentas.add(c);
    }
    
    public int ObtenerNumCuentas(){
        return Cuentas.size();
    }   

    public Cuenta ObtenerCuenta(int index){
        if ( (index<0) || (ObtenerNumCuentas()==0) || (index>=ObtenerNumCuentas()) )
            return null;
        return Cuentas.get(index);
    }
    
    public String ObtenerNombre(){
        return nombre;
    }

    public int ObtenerEdad(){
        return edad;
    }  
}
