package ejercicio6;
public class Ejercicio6 {
    public static void main(String[] args) {
       Cliente c1 = new Cliente("Laura Fernández", "223-456789");
       Mesa m1 = new Mesa(5, 4);
       Reserva r1 = new Reserva("2025-10-10", "20:30", c1, m1);

        System.out.println("Reserva para el " + r1.getFecha() + " a las " + r1.getHora());
        System.out.println("Cliente: " + r1.getCliente().getNombre() + " - Tel: " + r1.getCliente().getTelefono());
        System.out.println("Mesa Nº: " + r1.getMesa().getNumero() + " (capacidad " + r1.getMesa().getCapacidad() + ")");
    
    }
    
}
