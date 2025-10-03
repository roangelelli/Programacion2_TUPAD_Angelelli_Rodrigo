package ejercicio7;
public class Ejercicio7 {
    public static void main(String[] args) {
       Motor m1 = new Motor("Nafta", "MTR-12345");
       Conductor c1 = new Conductor("Lucía Gómez", "LIC-987654");
       Vehiculo v1 = new Vehiculo("AB123CD", "Toyota Corolla", m1);

 
        v1.setConductor(c1);

        System.out.println("Vehículo: " + v1.getPatente() + " - Modelo: " + v1.getModelo());
        System.out.println("Motor: " + v1.getMotor().getTipo() + " - Nº Serie: " + v1.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + v1.getConductor().getNombre() + " - Licencia: " + v1.getConductor().getLicencia());
    }
    }
    

