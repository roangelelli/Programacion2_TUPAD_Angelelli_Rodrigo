package ejercicio8;
public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro Perez", "pedroperez@mail.com");
        Documento d1 = new Documento("Contrato de Alquiler","Contenido del contrato...","HASH-ABC123","2025-10-05",u1);

             System.out.println("Documento: " + d1.getTitulo());
        System.out.println("Contenido: " + d1.getContenido());
        System.out.println("Firma Digital: " + d1.getFirma().getCodigoHash() + " - Fecha: " + d1.getFirma().getFecha());
        System.out.println("Usuario: " + d1.getFirma().getUsuario().getNombre() + " - Email: " + d1.getFirma().getUsuario().getEmail());
    }    }
    
