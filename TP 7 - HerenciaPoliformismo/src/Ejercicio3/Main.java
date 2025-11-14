package Ejercicio3;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregamos empleados de planta
        empleados.add(new EmpleadoPlanta("Ana", 300000, 50000));
        empleados.add(new EmpleadoPlanta("Luis", 280000, 30000));

        // Agregamos empleados temporales
        empleados.add(new EmpleadoTemporal("Carla", 20, 8000));
        empleados.add(new EmpleadoTemporal("Diego", 15, 7500));

        int cantPlanta = 0;
        int cantTemporales = 0;

        System.out.println("Listado de empleados y sueldos:");

        for (Empleado e : empleados) {
            // Polimorfismo: se llama al calcularSueldo() de la subclase correspondiente
            double sueldo = e.calcularSueldo();
            System.out.println("Empleado: " + e.getNombre() + " - Sueldo: " + sueldo);

            // Clasificación usando instanceof
            if (e instanceof EmpleadoPlanta) {
                cantPlanta++;
            } else if (e instanceof EmpleadoTemporal) {
                cantTemporales++;
            }
        }

        System.out.println("\nClasificación de empleados:");
        System.out.println("Empleados de planta: " + cantPlanta);
        System.out.println("Empleados temporales: " + cantTemporales);
    }
}
