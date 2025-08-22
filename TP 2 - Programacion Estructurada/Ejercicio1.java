package TP2_Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.println("Ejercicio 1 -  Verificacion de año Bisiesto");
        System.out.println("Ingrese un año:");
        int anioUsuario = input.nextInt();
        
        if ((anioUsuario % 4==0 && anioUsuario%100!=0 )|| (anioUsuario % 400==0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año NO es bisiesto.");
        }
        
    
    }
    
}
