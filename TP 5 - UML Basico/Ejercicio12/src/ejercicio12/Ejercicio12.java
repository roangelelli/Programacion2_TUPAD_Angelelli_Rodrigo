package ejercicio12;
public class Ejercicio12 {
    public static void main(String[] args) {
        Contribuyente c1 = new Contribuyente("Ana Martínez", "27-34567890-1");
        Impuesto imp1 = new Impuesto(10000, c1);
        Calculadora calc = new Calculadora();

          calc.calcular(imp1);
    }
    }
    