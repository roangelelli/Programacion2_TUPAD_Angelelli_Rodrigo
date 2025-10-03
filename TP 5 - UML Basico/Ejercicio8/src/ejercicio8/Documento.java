package ejercicio8;
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // composición 

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Documento crea su propia firma digital.
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }
}
