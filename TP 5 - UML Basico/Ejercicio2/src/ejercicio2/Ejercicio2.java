
package ejercicio2;
public class Ejercicio2 {

    public static void main(String[] args) {
    Bateria bat1 = new Bateria ("Litio123", 5500);
    Usuario usu1 = new Usuario ("Pedro Sanchez","40865989");
    Celular cel1 = new Celular ("123456789123","Iphone","16 PRO MAX",bat1);
    
    usu1.setCelular(cel1);
    
        System.out.println("Celular: "+ cel1.getMarca() + " " + cel1.getModelo());
        System.out.println("IMEI:" + cel1.getImei());
        System.out.println("Bateria: "+ cel1.getBateria().getModelo() + " - Capacidad: " + cel1.getBateria().getCapacidad());
        System.out.println("Usuario: " + cel1.getUsuario().getNombre() + " - DNI: " + cel1.getUsuario().getDni());
    
    
    }
    

    
}
