
package TP2_Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ejercicio 3 - Clasificación de Edad");
        System.out.println("Por favor ingrese su edad:");
        int edad = input.nextInt();
        
        if (edad<12){
            System.out.println("Eres un Niño");
        } else if (edad>=12 && edad<=17){
        System.out.println("Eres un Adolescente");
        } else if (edad>=18 && edad<=59){
        System.out.println("Eres un Adulto");
        } else
            System.out.println("Eres un Adulto mayor");
        }
          }
    
