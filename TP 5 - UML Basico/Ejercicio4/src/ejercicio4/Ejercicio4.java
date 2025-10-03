
package ejercicio4;
 class Ejercicio4 {
    public static void main(String[] args) {
       Banco b1 = new Banco("Banco Nación", "30-12345678-9");
       Cliente c1 = new Cliente("Juan Perez", "38963458");
       TarjetaDeCredito t1 = new TarjetaDeCredito("1234-5678-9876-5432", "12/2028", b1);

       
        t1.setCliente(c1);

        System.out.println("Tarjeta: " + t1.getNumero() + " - Vence: " + t1.getFechaVencimiento());
        System.out.println("Banco: " + t1.getBanco().getNombre() + " (CUIT: " + t1.getBanco().getCuit() + ")");
        System.out.println("Cliente: " + t1.getCliente().getNombre() + " - DNI: " + t1.getCliente().getDni());
    }
}
       

