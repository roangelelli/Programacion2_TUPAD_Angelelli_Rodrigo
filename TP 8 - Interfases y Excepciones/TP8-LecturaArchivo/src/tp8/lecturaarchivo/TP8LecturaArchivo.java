package tp8.lecturaarchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TP8LecturaArchivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la ruta del archivo: ");
        String ruta = sc.nextLine();

        try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}
