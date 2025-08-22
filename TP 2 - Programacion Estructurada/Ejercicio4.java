
package TP2_Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    
   static double descuentoDiez = 10.0;
   static double descuentoVeinte = 20.0;
   static double descuentoTreinta = 30.0;
   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("Ejercicio 4 - Calculadora de Descuentos");
        System.out.println("Ingrese el precio del producto:");
        double precioOriginal = input.nextDouble();
        System.out.println("Ingrese la categoria del producto (A,B o C)");
        char categoria = input.next().charAt(0);
        
    if (categoria == 'A'){
        double precioFinal = precioOriginal - (precioOriginal*descuentoDiez/100);
        System.out.println("Precio Original: $"+precioOriginal);
        System.out.println("Porcentaje de descuento: "+descuentoDiez + " %.");
        System.out.println("Precio final : $"+precioFinal);
    }else if (categoria == 'B'){
        double precioFinal = precioOriginal - (precioOriginal*descuentoVeinte/100);
        System.out.println("Precio Original: $"+precioOriginal);
        System.out.println("Porcentaje de descuento: "+ descuentoVeinte + " %.");
        System.out.println("Precio final : $"+ precioFinal);
    }else if (categoria == 'C'){
        double precioFinal = precioOriginal - (precioOriginal*descuentoTreinta/100);
        System.out.println("Precio Original: $"+precioOriginal);
        System.out.println("Porcentaje de descuento: "+ descuentoTreinta + " %.");
        System.out.println("Precio final : $"+ precioFinal);}
    else
        System.out.println("Opcion Invalida");
   
        }
        
    }   
 
 
        
   
    

