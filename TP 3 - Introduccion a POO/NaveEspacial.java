
package tp.introduccion.a.poo.angelelli.rodrigo;
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: "+nombre + "\n"
        + "Combustible disponible: " + combustible + " unidades");}
    
    public void despegar (){
    if (combustible >= 10){
        combustible-=10;
        System.out.println("Nave "+nombre + " ha despegado");
        System.out.println("Combustible restante: " + combustible);
    } else {
        System.out.println("No hay suficiente combustible para despegar. Al menos se necesitan 10 unidades de combustible.");     
    }}
    
    public void avanzar (int distancia){
        if (combustible >= distancia) {
            combustible = combustible - distancia;
            System.out.println("La nave " +nombre+ " ha avanzado " +distancia+ " unidades de distancia.");
            System.out.println("Combustible restante: " +combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }
    
    public void recargarCombustible (int cantidad){
        if (cantidad <= 0){
            System.out.println("No es posible recargar una cantidad negativa de combustible");
            return;}
        if (combustible + cantidad > MAX_COMBUSTIBLE){
            combustible = MAX_COMBUSTIBLE;
            System.out.println("La cantidad ingresada es mayor a la cantidad maxima. Se ha recargado hasta el maximo disponible");
            System.out.println("Cantidad de combustible actual: " +combustible);
       } else { 
            combustible = combustible + cantidad;
            System.out.println("Se han recargado " + cantidad + "unidades de combustible");
            System.out.println("Combustible actual luego de la recarga: "+combustible);
        }
    }
    
}
