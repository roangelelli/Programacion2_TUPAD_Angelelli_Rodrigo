package ejercicio9;
public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("María López", "OSDE");
        Profesional prof1 = new Profesional("Dr. Juan Pérez", "Cardiología");
        CitaMedica c1 = new CitaMedica("2025-10-08", "15:30", p1, prof1);

        System.out.println("Cita médica el " + c1.getFecha() + " a las " + c1.getHora());
        System.out.println("Paciente: " + c1.getPaciente().getNombre() + " - Obra social: " + c1.getPaciente().getObraSocial());
        System.out.println("Profesional: " + c1.getProfesional().getNombre() + " - Especialidad: " + c1.getProfesional().getEspecialidad());
        }
    
}
