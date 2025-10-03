package ejercicio_1;
public class Ejercicio_1 {

    public static void main(String[] args) {
  
        Titular t1 = new Titular("Juan Perez", "38963458");
        Pasaporte p1 = new Pasaporte("AR123456", "2025-10-02","foto4x4","png");
        
        p1.setTitular(t1);
        
        System.out.println("Pasaporte numero:" + p1.getNumero());
        System.out.println("Titular:" + p1.getTitular().getNombre());
        System.out.println("Foto:" +p1.getFoto().getImagen());
        
    }
    
}
