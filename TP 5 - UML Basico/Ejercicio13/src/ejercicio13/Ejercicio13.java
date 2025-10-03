package ejercicio13;
public class Ejercicio13 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Marcos Perez", "marcosperez12@mail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR-ABC123", u1);
       }
    
}
