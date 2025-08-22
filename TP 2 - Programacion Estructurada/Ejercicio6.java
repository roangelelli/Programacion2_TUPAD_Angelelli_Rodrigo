package TP2_Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Ejercicio 6 - Contador de Positivos, Negativos y Ceros");
        Scanner input = new Scanner (System.in);
        int numPositivos = 0, numNegativos=0, numCero=0;
        
    for (int cont = 1; cont < 11; cont++){  
        System.out.println("Ingrese un número: ");
        int numUsuario = input.nextInt();
        
        if (numUsuario>0)
            numPositivos++;
        else if (numUsuario==0)
            numCero++;
        else 
            numNegativos++;
        }
        System.out.println("Resultados: ");
        System.out.println("Números positivos: "+numPositivos+ ".");
        System.out.println("Números negativos: "+numNegativos+ ".");
        System.out.println("Ceros: "+numCero+".");
                
    }
}