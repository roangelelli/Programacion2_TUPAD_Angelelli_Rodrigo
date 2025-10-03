package ejercicio13;
public class GeneradorQR {
    // Dependencia de creación: 
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); 
        System.out.println("QR generado: " + qr.getValor());
        System.out.println("Usuario asociado: " + qr.getUsuario().getNombre() + " - " + qr.getUsuario().getEmail());
    }
}