
package TP2_Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
     System.out.println("Ejercicio 10 - Stock");
         Scanner input = new Scanner (System.in);
         
         System.out.println("Ingrese el stock actual: ");
         int stockActual = input.nextInt();
         System.out.println("Ingrese la cantidad vendida: ");
         int cantVendida = input.nextInt();
         System.out.println("Ingrese la cantidad recibida: ");
         int cantRecibida = input.nextInt();
         int nuevoStock = actualizarStock(stockActual,cantVendida,cantRecibida);
         
        System.out.println(" El nuevo stock de su producto es: "+nuevoStock);
        
    }//cierre main
    
    static int actualizarStock (int stockActual, int cantVendida, int cantRecibida) {
       int nuevoStock = (stockActual - cantVendida)+cantRecibida;
       return nuevoStock;
    } // cierre de funcion
    
}//cierre class
