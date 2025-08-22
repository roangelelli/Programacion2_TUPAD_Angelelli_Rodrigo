package TP2_Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.println("Ejercicio 2 - Mayor de 3 números");
        System.out.println("Por favor ingrese un número entero:");
        int num1 = input.nextInt();
        System.out.println("Por favor ingrese otro número entero:");
        int num2 = input.nextInt();
        System.out.println("Por favor ingrese otro número entero:");
        int num3 = input.nextInt();
        
        if (num1>=num2 && num1>=num3){
            System.out.println("El número mayor es: "+num1);
        } else if (num2>=num1 && num2>=num3){
            System.out.println("El número mayor es: "+num2);
        } else {
            System.out.println("El número mayor es: "+num3);
        }                
    }
}
