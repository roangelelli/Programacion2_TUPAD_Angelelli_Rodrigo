package tp.introduccion.a.poo.angelelli.rodrigo;
public class Mascotas {
    public String nombre;
    public String especie;
    public int edad; 
    
    public void mostrarInfo(){
        System.out.println(
            "Datos de la mascota: \n" 
            + "Nombre: " + nombre + "\n"
            + "Especie: " + especie + "\n"
            + "Edad: " + edad);
    }
    
    void cumplirAnios (int anios){
    edad = edad + anios;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " +edad + " años.");
    }
    
}
