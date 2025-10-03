package ejercicio5;
public class Ejercicio5 {

    public static void main(String[] args) {
        Propietario p1 = new Propietario("Carlos López", "40123456");
        Computadora c1 = new Computadora("Dell", "SN123456", "B450M", "AMD");

        c1.setPropietario(p1);

        System.out.println("Computadora: " + c1.getMarca() + " - Serie: " + c1.getNumeroSerie());
        System.out.println("Placa Madre: " + c1.getPlacaMadre().getModelo() + " - Chipset: " + c1.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + c1.getPropietario().getNombre() + " - DNI: " + c1.getPropietario().getDni());
    }    }
    
