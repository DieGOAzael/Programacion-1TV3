/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04;

import java.util.Scanner;

/**
 *
 * @author DiegoGo
 */
public class Practica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         Objetivo: Desarrollar programas utilizando cadenas, datos numéricos para el despliegue de información.

Problemática: ¿Cuales son los pasos necesarios para crear un programa en Java para realice conversiones entre diferentes divisas (Peso, Dolar, Euro, Libra y Yen)?

El programa solicitará el valor equivalente de 1 dolar en Pesos, Euros, Libra y Yen. Posteriormente el programa mostrará en pantalla que ingrese la cantidad a convertir misma que se ingresará de la forma:

cantidad sigla

donde: sigla pueden ser (USD - Dolar, MXN - Peso, EUR - Euro, JPY - Yen japones, GBP - Libra Esterlina).

Una vez ingresada la cantidad y la divisa correspondiente, se solicitará se ingrese la divisa a la cual se desea realizar la conversión. finalmente mostrará en pantalla el valor corresondiente.
         */
        
        System.out.println("----------------Sistema de conversión----------------");
        
        Scanner Teclado;
        Teclado = new Scanner (System.in);
        
        
        
        String Moneda;
        String MonedaV;
        String Divisa;
        String DivisaC;
        //double Dolar = 1, Peso = 17.70, Euro = 0.95, Libra = 0.82, Yen = 17.70;
        System.out.println("Ingrese la cantidad a convertir de la forma  CANTIDAD SIGLA");
        System.out.println("Sigla puede ser (USD - Dolar, MXN - Peso, EUR - Euro, JPY - Yen japones, GBP - Libra Esterlina)");
        Moneda = Teclado.nextLine();
        
        //Moneda = "200000 MNX";  
        MonedaV = Moneda.substring(0,Moneda.indexOf(" "));        
        Divisa = Moneda.substring(Moneda.indexOf(" ") + 1, Moneda.length());
        
        System.out.println("Ingresa la divisa a la que quieres convertir:");
        DivisaC = Teclado.nextLine();
        
        //8 IF, convertir todo a DOLAR  Y de ahi a la moneda 
        
        if (DivisaC.equals("USD")) {
            System.out.println("Dolar"); 
        double Dolar = 1, Peso = 17.70, Euro = 0.95, Libra = 0.82, Yen = 17.70;
        double Valor, dolar, peso, euro, libra, yen, c;
        Valor = Double.parseDouble(MonedaV);//parse para convertir el valor string a double
        //C = Valor 0
        System.out.println("El valor es: " + Valor + " " + Divisa);
            
        }else if(DivisaC.equals("MXN")){
            
            System.out.println("Peso");   
             double Valor;
            Valor = Double.parseDouble(MonedaV);//parse para convertir el valor string a double
            System.out.println("El valor es: " + Valor + " " + Divisa);
            
        }else if (DivisaC.equals("EUR")){
            System.out.println("Euro");   
             double Valor;
            Valor = Double.parseDouble(MonedaV);//parse para convertir el valor string a double
            System.out.println("El valor es: " + Valor + " " + Divisa);
            
        }else if (DivisaC.equals("JPY")){
            System.out.println("Yen");  
             double Valor;
            Valor = Double.parseDouble(MonedaV);//parse para convertir el valor string a double
            System.out.println("El valor es: " + Valor + " " + Divisa);
            
        }else if (DivisaC.equals("GBP")){
            System.out.println("Libra");  
             double Valor;
            Valor = Double.parseDouble(MonedaV);//parse para convertir el valor string a double
            System.out.println("El valor es: " + Valor + " " + Divisa);
            
        }
        
        
        
       
        
        
        
        
        
        
        
        
    }
}
