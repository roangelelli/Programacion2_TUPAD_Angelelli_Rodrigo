package ejercicio_1;
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; //Composicion 1:1
    private Titular titular; //Asociacion 1:1

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto (imagen, formato);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
        titular.setPasaporte(this);
    }
    }

    }
    
    
    

    
