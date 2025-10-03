
package ejercicio_1;
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; //Referencia a Pasaporte

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
        pasaporte.setTitular(this);
        }
    }

    }
    
    
//}
