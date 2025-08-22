package TP2_Ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
    final static double PORCENTAJE_DESCUENTO = 0.10;

    public static void main(String[] args) {
  System.out.println("Ejercicio 11 - Descuento");
         Scanner input = new Scanner (System.in);
         System.out.println("Ingrese el precio del producto:");
        double precioOriginal = input.nextDouble();
        descuentoEspecial (precioOriginal);
    }
    static void descuentoEspecial (double precioOriginal){
        double descuento = precioOriginal*PORCENTAJE_DESCUENTO;
        double precioFinal = precioOriginal - descuento;
        System.out.println("El descuento especial aplicado es: "+descuento);
        System.out.println("El precio final con descuento es: $ "+precioFinal);
    }
}
