package ejercicio14;
public class Render {
    private String formato;
    private Proyecto proyecto; // asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
    
}
