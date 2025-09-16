
package tp.introduccion.a.poo.angelelli.rodrigo;
public class Gallinas {
    
    public int idGallina;
    public int edad; 
    public int huevosPuestos; 
    
    public void ponerHuevo (int cantidad){
        if (cantidad > 0){
            huevosPuestos = huevosPuestos + cantidad;}
        else { System.out.println("Cantidad invalida");}
        }
    
    public void envejecer (int cantidad){
        if (cantidad > 0) {
          edad = edad + cantidad;}
        else { System.out.println("Imposible envejecer hacia atras");}
    }
    
    public void mostrarEstado (){
        System.out.println("Gallina "+idGallina + "\n" +
        "Edad: " +edad + " año(s) \n" +
        "Huevos puestos: " +huevosPuestos);
    }
}
