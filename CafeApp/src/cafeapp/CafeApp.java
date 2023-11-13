/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

import java.util.Scanner;

/**
 *
 * @author ivazq
 */
public class CafeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        Cafeteria Cafe;
        Cafe=new Cafeteria();
        do{
            System.out.println("Menu Cafeteria");
            System.out.println("1. Productos");
            System.out.println("2. Ventas");
            System.out.println("9. Salir");
            opc=Opcion();
            switch(opc){
                case 1:MenuProductos(Cafe);break;
                case 2:MenuVentas(Cafe);break;
            }
        }while(opc!=9);
                
    }
    
    public static void MenuVentas(Cafeteria c){
        int opc;
        do{
            System.out.println("Menu Ventas");
            System.out.println("1. Crear venta");
            System.out.println("2. Listar venta");
            System.out.println("9. Regresar");
            opc=Opcion();
            switch(opc){
                case 1:CrearVentas(c);break;
                case 2:ListarVentas(c);break;
            }
        }while(opc!=9);
    }
    
    public static void ListarVentas(Cafeteria c){
        int NumVentas,NumProd,Cant;
        int i,j;
        Venta V;
        VentaProducto Vp;
        NumVentas=c.getNumVentas();
        for(i=0;i<NumVentas;i++){
            V=c.getVenta(i);
            NumProd=V.getNumProductos();
            System.out.println("Venta:"+V.getIdVenta()+" Fecha:"+V.getFecha() + "Cliente: " + V.getNCliente());
            for(j=0;j<NumProd;j++){
                Vp=V.getProducto(j);
                System.out.println("\tNombre:"+Vp.getIdProducto().getNombre()+" Cantidad:"+Vp.getCantidad());
                
            }
        }
            
        
    }
    
    public static void CrearVentas(Cafeteria c){
        int opc,index,cant;
        String fecha,name;
        Venta V;
        V=new Venta();
        index=c.getNumVentas();
        V.setIdVenta(index);
        System.out.println("Ingrese fecha:");
        fecha=Info();
        System.out.println("Ingrese Nombre del Cliente");
        name = Info();
        V.setFecha(fecha);
        V.setNCliente(name);
        
        

        do{
            System.out.println("Menu crear ventas");
            System.out.println("1. Listar Productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Listar carrito");
            System.out.println("4. Realizar venta");
            System.out.println("5. Cancelar venta");
            opc=Opcion();
            switch(opc){
                case 1:ListarProducto(c);break;
                case 2:AgregarProductoCarrito(V,c);break;                   
                case 3:ListarCarrito(V);break;
                case 4:
                    c.addVenta(V);
                    opc=9;
                    break;
                case 5:opc=9;break;
            }
        }while(opc!=9);
    }
    
    public static void ListarCarrito(Venta V){
        int i,cant,NumPro;
        String Nombre,Cantidad,descripcion;
        NumPro=V.getNumProductos();
        for(i=0;i<NumPro;i++){
            Producto P;
            VentaProducto Vp=V.getProducto(i);
            P=Vp.getIdProducto();
            System.out.println(i+" "+P.getNombre()+"\t"+P.getDescripcion()+"\t"+Vp.getCantidad());
        }
                
    }
    
    public static void AgregarProductoCarrito(Venta V,Cafeteria C){
        int index,cant;
        String Name;
        Producto P;
        System.out.println("Ingrese ID del producto:");
        index=Opcion();
        System.out.println("Ingrese cantidad:");
        cant=Opcion();
        
        P=C.getProducto(index);
        VentaProducto Vp;
        Vp=new VentaProducto();
        Vp.setIdProducto(P);
        Vp.setCantidad(cant);
        
        
        V.addProducto(Vp);
    }
    
    public static void MenuProductos(Cafeteria c){
        int opc;
        do{
            System.out.println("Menu producto");
            System.out.println("1. Agregar productos");
            System.out.println("2. Listar productos");
            System.out.println("3. Editar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("9. regresar");
            opc=Opcion();
            switch(opc){
                case 1:AgregarProducto(c);break;
                case 2:ListarProducto(c);break;
                case 3:EditarProducto(c);break;
                case 4:EliminarProducto(c);break;
            }
        }while(opc!=9);
    }
    
    public static void AgregarProducto(Cafeteria C){
        String Nombre,Descripcion;
        System.out.println("Ingresa nombre del producto:");
        Nombre=Info();
        System.out.println("Ingresa descripción");
        Descripcion=Info();
        
        ProductoProveedor productoProveedor = new ProductoProveedor();
         
        Producto Aux;
        Aux=new Producto();
        Aux.setNombre(Nombre);
        Aux.setDescripcion(Descripcion);
        
        // Llamar al método CrearCatalogo para asociar el producto con su proveedor
    productoProveedor.CrearCatalogo(productoProveedor, Aux);

    // Agregar el objeto ProductoProveedor al inventario de la Cafeteria
    
        C.addProducto(Aux,productoProveedor);
    }
    
    public static void EditarProducto(Cafeteria C){
        String Nombre,Descripcion;
        Producto Aux;
        int Num;
        ListarProducto(C);
        System.out.println("Selecciona un producto:");
        Num=Opcion();
        Aux=C.getProducto(Num);
        if (Aux!=null){
            System.out.println("Ingresa nombre:");
            Nombre=Info();
            System.out.println("Ingresa descripcion:");
            Descripcion=Info();
            Aux.setNombre(Nombre);
            Aux.setDescripcion(Descripcion);
        }       
    }
    
    public static void ListarProducto(Cafeteria C){
        int NumProd,i;
        Producto p;
        ProductoProveedor pp;
        System.out.println("Listado de producto en inventario");
        NumProd=C.getNumProductos();
        for(i=0;i<NumProd;i++){
            p=C.getProducto(i);
            pp= C.getProductoP(i);
            System.out.println(i+" "+p.toString());
            System.out.println(i+" "+pp.toString());
        }
        
    }
    
    public static void EliminarProducto(Cafeteria C){
        int index;
        Producto P;
        ListarProducto(C);
        System.out.println("Selecciona un Producto:");
        index=Opcion();
        P=C.getProducto(index);
        if (P!=null)
            C.eliminarProducto(index);
        
    }
    public static int Opcion(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextInt();
    }
    
    public static String OpcionString(){
        Scanner TecladoS;
        TecladoS=new Scanner(System.in);
        return TecladoS.nextLine();
    }
    
    public static String Info(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextLine();
    } 
    
    public static double Real(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextDouble();
    }
}
