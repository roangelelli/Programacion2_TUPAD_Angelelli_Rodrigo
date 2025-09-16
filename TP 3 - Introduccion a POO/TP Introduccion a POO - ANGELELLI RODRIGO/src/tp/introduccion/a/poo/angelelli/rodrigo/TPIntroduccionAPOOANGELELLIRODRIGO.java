
package tp.introduccion.a.poo.angelelli.rodrigo;
public class TPIntroduccionAPOOANGELELLIRODRIGO {

    public static void main(String[] args) {
   
   // EJERCICIO 1 - ESTUDIANTES 
    System.out.println("============== EJERCICIO 1 ==============");
    
    Estudiantes estudiante1 = new Estudiantes();
    estudiante1.nombre = "Lautaro";
    estudiante1.apellido = "Perez";
    estudiante1.curso = "7 - A";
    estudiante1.calificacion = 8; 
    
    estudiante1.mostrarInfo();
    
    System.out.println("=".repeat(40));
    
    estudiante1.subirCalificacion(2);
    estudiante1.mostrarInfo();
    
    System.out.println("=".repeat(40));
    
    estudiante1.bajarCalificacion(3.5);
    estudiante1.mostrarInfo();
    
    // EJERCICIO 2 - MASCOTAS
    System.out.println("============== EJERCICIO 2 ==============");
    
    Mascotas mascota1 = new Mascotas();
    mascota1.nombre = "Pancho";
    mascota1.especie = "Dachshund";
    mascota1.edad = 1;
    mascota1.mostrarInfo();
    
    System.out.println("=".repeat(40));
    
    mascota1.cumplirAnios(4);
    mascota1.mostrarInfo();
    
    
    // EJERCICIO 3 - LIBRO 
   System.out.println("============== EJERCICIO 3 ==============");
    
    Libro miLibro = new Libro ();
    miLibro.setTitulo("Mi libro favorito");
    miLibro.setAutor("Mi autor favorito");
    miLibro.setAnioPublicacion(1980);
    miLibro.mostrarInfo();
      
    System.out.println("=".repeat(40));
    miLibro.setAnioPublicacion(1300); //Valor invalido en el pasado
    miLibro.setAnioPublicacion(2027); //Valor invalido en el futuro
    miLibro.mostrarInfo();
    
    System.out.println("=".repeat(40));
    miLibro.setAnioPublicacion(2000); //Valor valido
    miLibro.mostrarInfo();
    
    
   // EJERCICIO 4 - GALLINAS 
     System.out.println("============== EJERCICIO 4 ==============");
     Gallinas g1 = new Gallinas();
     g1.idGallina = 123;
     g1.edad = 1;
     
     Gallinas g2 = new Gallinas ();
     g2.idGallina = 456;
     g2.edad = 2; 
     
     g1.mostrarEstado();
     g2.mostrarEstado();
     System.out.println("=".repeat(40));
     
     g1.ponerHuevo(2);
     g1.envejecer(1);
     
     g2.ponerHuevo(4);
     g2.envejecer(1);
     
     g1.mostrarEstado();
     g2.mostrarEstado();
     System.out.println("=".repeat(40));
             
     g1.ponerHuevo(-2); // Error "Cantidad Invalida"
     g1.envejecer(1);
     
     g2.ponerHuevo(4);
     g2.envejecer(-1); // Error "Imposible envejecer hacia atras" 
     
     g1.mostrarEstado();
     g2.mostrarEstado();
   
   
    
    // EJERCICIO 5 - NAVE ESPACIAL 
    System.out.println("============== EJERCICIO 5 ==============");
   
    NaveEspacial nave1 = new NaveEspacial ();
    nave1.setNombre("Apolo 23");
    nave1.setCombustible(50);
    
    System.out.println("Estado inicial de la nave ");
    nave1.mostrarEstado();
    
    System.out.println("=".repeat(40));
    
    nave1.despegar();
    nave1.avanzar(50);
    
    System.out.println("=".repeat(40));
    nave1.recargarCombustible(100);
   
    System.out.println("=".repeat(40));
    
    nave1.avanzar(200);
    nave1.avanzar(80);
    System.out.println("=".repeat(40));
    
    nave1.avanzar(40);
    nave1.recargarCombustible(10);
    nave1.mostrarEstado();
    
    
    

    
    
    
    
    }
}