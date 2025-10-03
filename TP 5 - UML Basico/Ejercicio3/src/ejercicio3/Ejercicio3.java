package ejercicio3;
public class Ejercicio3 {

    public static void main(String[] args) {
    
    Editorial e1 = new Editorial("Editorial Palito", "Calle Falsa 1234");
    Autor a1 = new Autor("Autor Falso Perez","Argentina");
    Libro l1 = new Libro("Libro Falso ABC","025-2022-200-160",e1);
    
    l1.setAutor(a1);
    
        System.out.println("Libro: " + l1.getTitulo()+" - ISBN: "+l1.getIsbn());
        System.out.println("Autor: " +l1.getAutor().getNombre() + " - Nacionalidad: " +l1.getAutor().getNacionalidad());
        System.out.println("Editorial: " +l1.getEditorial().getNombre() + " - Domicilio: " +l1.getEditorial().getDireccion());
    }
    
}
