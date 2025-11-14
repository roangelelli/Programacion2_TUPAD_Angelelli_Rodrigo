package Ejercicio3;
public class EmpleadoPlanta extends Empleado {

    protected double sueldoBase;
    protected double bonoAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, double bonoAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.bonoAntiguedad = bonoAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bonoAntiguedad;
    }
}

