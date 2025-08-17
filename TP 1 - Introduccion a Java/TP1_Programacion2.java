package tp1_programacion2;
import java.util.Scanner;

public class TP1_Programacion2 {

        public static void main(String[] args) {
      
//Ejercicio 2:
        System.out.println("Hola Java");
//Ejercicio 3:
       String nombre = "Marcelo";
        int edad = 29;
        double altura = 1.86;
        boolean estudiante = true;
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su altura es: " + altura);
        System.out.println("Usted es estudiante: " + estudiante);
      
//Ejercicio 4:
    Scanner input = new Scanner (System.in);
          System.out.println("Ingrese su nombre:");
          String nombre2 = input.nextLine();
          System.out.println("Ingrese su edad:");
          int edad2 = input.nextInt();
          System.out.println("Su nombre es " + nombre2 + " y usted tiene " + edad2 + " años.");
  
//Ejercicio 5:
//        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese su primer numero entero: ");
        int enteroUno = input.nextInt();
        System.out.println("Ingrese su segundo numero entero: ");
        int enteroDos = input.nextInt();
        int suma = enteroUno + enteroDos;
        int resta = enteroUno - enteroDos;
        int multiplicacion = enteroUno * enteroDos;
        double division =(double)enteroUno / enteroDos;
        
        System.out.println(
         "La suma de " + enteroUno + " mas " + enteroDos + " es: " + suma + "\n" +
         "La resta de " + enteroUno + " menos " + enteroDos + " es: " + resta + "\n" +
         "La multiplicación de " + enteroUno + " por " + enteroDos + " es: " + multiplicacion + "\n" +
         "La división de " + enteroUno + " dividido " + enteroDos + " es: " + division);
    
//Ejercicio 6:
        System.out.println(
        "Nombre: Juan Pérez\n"+
        "Edad: 30 años\n"+  
        "Direccion: \"Calle Falsa 123\"");
 

//Ejercicio 8:
//Scanner input = new Scanner (System.in);
        System.out.println("Ingrese su primer numero entero: ");
        int enteroTres = input.nextInt();
        System.out.println("Ingrese su segundo numero entero: ");
        int enteroCuatro = input.nextInt();
        double division2 = (double) enteroTres / enteroCuatro;
          System.out.println("La división de " + enteroTres + " dividido " + enteroCuatro + " es: " + division2);
          
//Ejercicio 9:
Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre4 = scanner.nextLine(); 
        System.out.println("Hola, " + nombre4); 
}
 }
