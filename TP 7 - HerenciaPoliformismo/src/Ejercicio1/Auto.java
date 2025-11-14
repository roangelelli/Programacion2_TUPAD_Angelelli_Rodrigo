package Ejercicio1;
public class Auto extends Vehiculo {

    protected int cantidadPuertas; 

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        // Acceso directo gracias a protected
        System.out.println("Auto - Marca: " + marca 
                + " | Modelo: " + modelo 
                + " | Puertas: " + cantidadPuertas);
    }
}