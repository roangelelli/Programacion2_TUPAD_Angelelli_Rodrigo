package ejercicio11;
public class Ejercicio11 {

    public static void main(String[] args) {
        Artista a1 = new Artista("Gustavo Cerati", "Rock");
        Cancion c1 = new Cancion("Crimen", a1);
        Reproductor r1 = new Reproductor();
        r1.reproducir(c1);
    }  
}
    

