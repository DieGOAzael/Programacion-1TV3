/*
        CLASE PUBLICA QUE MANEJA LOS DATOS PERSONALES Y LAS CUENTAS DE CADA CLIENTE
        BGD 2MV5 PA   
*/
package appbanco;
import java.util.ArrayList;

public class Banco {
    //ATRIBUTOS
    protected String nombre;
    protected String direccion;
    private ArrayList <Cliente> clientes;
    
    //METODOS
    public Banco(){
        clientes=new ArrayList();
    }

    public void AgregarCliente(Cliente Ce){
        if (clientes==null){
            clientes=new ArrayList();
        }
        clientes.add(Ce);
    }

    public int ObtenerNumClientes(){
        return clientes.size();
    }
    
    public Cliente ObtenerCliente(int index){
        return clientes.get(index);
    }
    
    public void AsignarDatosdelBanco(String n, String d){
        nombre=n;
        direccion=d;
    }

    public String ObtenerNombre(){
        return nombre;
    }

    public String ObtenerDireccion(){
        return direccion;
    }
}
