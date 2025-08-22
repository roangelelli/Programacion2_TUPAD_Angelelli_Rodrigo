package TP2_Ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
      System.out.println("Ejercicio 7 - Validacion de nota");
         Scanner input = new Scanner (System.in);
    int notaUsuario = 0;
    
    do {
            System.out.print("Ingrese una nota (0-10): ");
            notaUsuario = input.nextInt();
            if (notaUsuario < 0 || notaUsuario > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (notaUsuario < 0 || notaUsuario > 10);

        System.out.println("Nota guardada correctamente.");
    }  
}
