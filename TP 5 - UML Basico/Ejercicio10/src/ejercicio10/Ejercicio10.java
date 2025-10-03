package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        Titular t1 = new Titular("Juan Pérez", "40123456");
        CuentaBancaria c1 = new CuentaBancaria("1234567890123456789012", 150000.75, "ABC123", "2025-10-06");

        c1.setTitular(t1);

        System.out.println("Cuenta Bancaria: " + c1.getCbu() + " | Saldo: $" + c1.getSaldo());
        System.out.println("Clave: " + c1.getClave().getCodigo() + " - Última modificación: " + c1.getClave().getUltimaModificacion());
        System.out.println("Titular: " + c1.getTitular().getNombre() + " - DNI: " + c1.getTitular().getDni());
       }
    
}
