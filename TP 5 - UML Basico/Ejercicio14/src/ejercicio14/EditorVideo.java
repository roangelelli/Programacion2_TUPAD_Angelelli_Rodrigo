package ejercicio14;
public class EditorVideo {
    // Dependencia de creación.
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); 
        System.out.println("Render exportado en formato: " + render.getFormato());
        System.out.println("Proyecto: " + render.getProyecto().getNombre() + " (" + render.getProyecto().getDuracionMin() + " min)");
    }
    
}
