package ejercicio5;
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;   // composición
    private Propietario propietario; // asociación bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // La placa madre se crea dentro de la computadora (composición)
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
}
