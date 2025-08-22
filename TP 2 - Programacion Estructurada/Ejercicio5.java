
package TP2_Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 5 - Suma de números pares");
         Scanner input = new Scanner (System.in);
         int pares = 0;
         int impares = 0;
                 
         System.out.println("Ingrese un número (0 para terminar): ");
         int numBase = input.nextInt();
         while (numBase != 0) {
             if (numBase % 2 == 0){
                 pares++;
             } else {impares++;  
             }
                 System.out.println("Ingrese otro número (0 para terminar):");
                 numBase = input.nextInt();
         }
             System.out.println("La cantidad de numeros pares fueron: "+pares);
    }
    
}
