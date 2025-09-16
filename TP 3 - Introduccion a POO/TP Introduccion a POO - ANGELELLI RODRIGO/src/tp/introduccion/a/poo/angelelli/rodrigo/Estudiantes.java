package tp.introduccion.a.poo.angelelli.rodrigo;
public class Estudiantes {
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion; 
    
    public void mostrarInfo(){
        System.out.println(
            "Datos del estudiante: \n" 
            + "Nombre: " + nombre + "\n"
            + "Apellido: " + apellido + "\n"
            + "Curso: " + curso + "\n"
            + "Calificación: " + calificacion);
    }
    
    void subirCalificacion (double puntos){
    calificacion = calificacion + puntos;
    }
    
    void bajarCalificacion (double puntos){
    calificacion = calificacion - puntos; 
    }
}
