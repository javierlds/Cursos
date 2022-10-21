package ProyectoCitas;
import java.util.Date;

public class PruebaPrincipal {

    public static void main(String args[]){

        //showMenu();
        // String nombre, String apellido, int edad, char genero, String email, String direccion, String phoneNumber, String speciality
        Doctor myDoctor = new Doctor("Javier", "Paez", 34, 'M', "javierlds@gmail.com", "DIAG 5A #37 B-60", "3202269666","Otorrino");
        //Adicionando las citas al doctor
        myDoctor.addAvailableAppointment(new Date(),  "10am");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(),  "5pm");

        System.out.println("Doctor: " + myDoctor);

        //Adicionando pacientes a las citas
        Patient myPatient = new Patient("Ana", "Perez", 23, 'F', "ana@gmail.com", "CRA 5A #96 4", "3165984512", "1988-03-21", 75, 175 , "A+");
        System.out.println("Patient: " + myPatient);

    }
}