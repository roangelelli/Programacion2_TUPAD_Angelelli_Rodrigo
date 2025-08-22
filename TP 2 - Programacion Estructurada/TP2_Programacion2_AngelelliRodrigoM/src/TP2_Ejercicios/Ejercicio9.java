package TP2_Ejercicios;
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
  System.out.println("Ejercicio 9  - Costo envio y total compra");
         Scanner input = new Scanner (System.in);
         System.out.println("Ingrese el precio del producto: ");
         double precioProducto = input.nextDouble();
         System.out.println("Ingrese el peso del producto: ");
         double pesoProducto = input.nextDouble();
         System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        String zonaEnvio = input.next();
        
        double totalEnvio = costoEnvio(pesoProducto,zonaEnvio);
        double precioFinal = costoTotal(precioProducto,totalEnvio);
        System.out.println("El costo de su envio es: $ " +totalEnvio);
        System.out.println("El total a pagar es: $ "+precioFinal);
         
    } // Cierre del main
    static double costoEnvio(double pesoProducto, String zonaEnvio) {
        double costo;
    if ("Nacional".equalsIgnoreCase(zonaEnvio)){
       costo = pesoProducto*5;
    }else if ("Internacional".equalsIgnoreCase(zonaEnvio)){
       costo =pesoProducto*10;
    }else {
      costo = 0;
    }
    return costo;
    }
//Cierre funcion
    
    static double costoTotal (double precioProducto, double costoEnvio){
        double costoTotal;
        return costoTotal = precioProducto+costoEnvio;
    }
    
} //Cierre de class
