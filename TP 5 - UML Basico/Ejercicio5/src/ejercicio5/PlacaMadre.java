package ejercicio5;
public class PlacaMadre {
private String modelo;
private String chipset;

    PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { return modelo; }
    public String getChipset() { return chipset; }   
}
