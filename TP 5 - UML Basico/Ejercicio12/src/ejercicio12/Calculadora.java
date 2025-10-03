package ejercicio12;
public class Calculadora {
    // Dependencia de uso: recibe el impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // ejemplo: aplicar IVA del 21%
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre() +
                           " | CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("Monto con impuestos: $" + total);
    }
}
    