package ejercicio10;
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
}    

