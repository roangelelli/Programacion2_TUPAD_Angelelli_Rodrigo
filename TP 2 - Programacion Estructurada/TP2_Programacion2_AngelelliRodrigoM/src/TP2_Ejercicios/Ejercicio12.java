package TP2_Ejercicios;

public class Ejercicio12 {

    public static void main(String[] args) {
  System.out.println("Ejercicio 12 - Precios");
    double [] precios = {199.99, 299.5, 149.76, 399.0, 89.88};
        System.out.println("Precios originales: ");
        for (double p:precios){
            System.out.println("$" +p);
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        for (double p:precios){
            System.out.println("$" +p);
        
         }
    }
}
