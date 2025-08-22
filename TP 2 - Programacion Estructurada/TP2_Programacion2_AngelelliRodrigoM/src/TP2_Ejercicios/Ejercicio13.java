package TP2_Ejercicios;
public class Ejercicio13 {
    public static void main(String[] args) {
double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
    private static void imprimirRecursivo(double[] precios, int indice) {
        if (indice == precios.length) {
            return; 
        }
        System.out.println("Precio: $" + precios[indice]);
        imprimirRecursivo(precios, indice + 1); 
    }
}    
    

