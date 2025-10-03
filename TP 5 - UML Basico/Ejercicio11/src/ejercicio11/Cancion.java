package ejercicio11;
public class Cancion {
    private String titulo;
    private Artista artista; // asociación unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }    
}
