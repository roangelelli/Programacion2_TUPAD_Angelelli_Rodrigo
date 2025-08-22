
package TP2_Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
        
    public static void main(String[] args) {
        System.out.println("Ejercicio 8 - Precio Final");
         Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase =  input.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje (Ej. 10 para 10%: ");
        double impuesto = input.nextDouble();
        System.out.println("Ingrese el descuento en porcentaje (Ej. 5 para 5%: ");
        double descuento = input.nextDouble();
    
        System.out.println("El precio final de su producto es: " + calcularPrecioFinal(impuesto,descuento,precioBase));
        
    } //Cierre de main
    
    static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        double imp = impuesto / 100.0;
        double desc = descuento / 100.0;
    return precioBase + (precioBase*imp)-(precioBase*desc);

} //Cierre de funcion
    
} //Cierre de clase
