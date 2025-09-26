package tp4_angelelli_rodrigo_poo;
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; 

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }
    
    //Constructor 1: Uno que reciba todos los atributos como parámetros.
    public Empleado(int id, String nombre, String puesto, double salario){
    Empleado.totalEmpleados++;
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto; 
    this.salario = salario;
    }
    
    //Constructor 2: Otro que reciba solo nombre y puesto, asignando un id automático y un salario por defecto.
    public Empleado(String nombre, String puesto){
    Empleado.totalEmpleados++;
    this.id = Empleado.totalEmpleados;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 1000000;
    }
    
    //Metodo 1: Uno que reciba un porcentaje de aumento
    public void actualizarSalario(int aumento){
    this.salario += ((salario * aumento)/100);
    }
    
    //Metodo 2: Otro que reciba una cantidad fija a aumentar.
    public void actualizarSalario(double aumento){
    this.salario += aumento;
    }
    
    // Sobreescribimos el metodo toStirng() para mostrar la informacion del empleado

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
    return Empleado.totalEmpleados;
    }

}
