package tp8.lecturacontryresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TP8LecturaConTryResources {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la ruta del archivo: ");
        String ruta = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}