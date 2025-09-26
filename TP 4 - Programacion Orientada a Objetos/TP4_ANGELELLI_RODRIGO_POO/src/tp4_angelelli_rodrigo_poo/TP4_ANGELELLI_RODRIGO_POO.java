package tp4_angelelli_rodrigo_poo;
public class TP4_ANGELELLI_RODRIGO_POO {

    public static void main(String[] args) {
    
        Empleado emp1 = new Empleado(01, "Carlos", "Cajero", 1500000.00);
        Empleado emp2 = new Empleado(02, "Roxana", "Encargada", 1600000.00);
        Empleado emp3 = new Empleado("Marcela","Cajera");
        Empleado emp4 = new Empleado("Fabian","Recepcionista");
        
        System.out.println("---------- DATOS INICIALES ---------");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println("-------- FIN DATOS INICIALES -------");
        
        //Actualizamos los salarios 
        
        emp1.actualizarSalario(15);//Porcentaje
        emp2.actualizarSalario(120000.00);//Monto fijo
        emp3.actualizarSalario(20);//Porcentaje
        emp4.actualizarSalario(250000.00);//Monto fijo
        
        //Visualizamos si se actualizaron
        System.out.println("---------- DATOS ACTUALIZADOS ---------");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println("-------- FIN DATOS ACTUALIZADOS -------");
        
        //Total de empleados
        System.out.println("Total empleados:" + Empleado.mostrarTotalEmpleados());
    }
    
}
