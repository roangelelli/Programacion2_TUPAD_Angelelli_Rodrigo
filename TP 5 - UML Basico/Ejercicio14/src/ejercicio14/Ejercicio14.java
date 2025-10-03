package ejercicio14;
public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("Video de Viaje", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", p1);
    }
 }
    

