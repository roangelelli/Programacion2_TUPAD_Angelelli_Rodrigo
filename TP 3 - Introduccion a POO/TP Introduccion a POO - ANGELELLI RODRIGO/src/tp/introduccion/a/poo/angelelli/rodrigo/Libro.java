
package tp.introduccion.a.poo.angelelli.rodrigo;
import java.time.Year;
        
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue();
        if (nuevoAnio >= 1450 && nuevoAnio<= anioActual){  //Fecha de origen de la imprenta moderna aprox.
             this.anioPublicacion = nuevoAnio;}
        else {
            System.out.println("El año de publicación debe ser entre 1450 y " +anioActual );}
    }
    
    public void mostrarInfo() {
        System.out.println("INFORMACIÒN SOBRE SU LIBRO \n"
                           + "Titulo: " + titulo + "\n"
                           + "Autor: " + autor + "\n"
                           + "Año de Publicación: " +anioPublicacion);}
    
}
