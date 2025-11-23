package tp8.edadinvalida;
import java.util.Scanner;
public class TP8EdadInvalida {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese una edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango permitido.");
            }

            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}