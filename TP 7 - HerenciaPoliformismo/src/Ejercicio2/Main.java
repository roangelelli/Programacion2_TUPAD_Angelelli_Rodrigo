package Ejercicio2;
public class Main {
    public static void main(String[] args) {

        // Array de la superclase
        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo("Círculo pequeño", 2.0);
        figuras[1] = new Rectangulo("Rectángulo mediano", 4.0, 3.0);
        figuras[2] = new Circulo("Círculo grande", 5.5);

        System.out.println("Áreas de las figuras:");

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Área: " + f.calcularArea());
        }
    }
}