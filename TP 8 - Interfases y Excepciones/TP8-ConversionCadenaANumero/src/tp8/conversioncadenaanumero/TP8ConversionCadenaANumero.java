package tp8.conversioncadenaanumero;
import java.util.Scanner;
public class TP8ConversionCadenaANumero {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
    }
}