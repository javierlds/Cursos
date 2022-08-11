package ProyectoCitas;

import static ProyectoCitas.Menu.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String args[]){

        /*creando doctores*/
        Doctor myDoctor = new Doctor("Jose Paez"); // Llamando el metodo constructor tiene diferentes formas de construir un objeto
        myDoctor.showId();

        Doctor myDoctorJav = new Doctor("JAVIER PAEZ");
        myDoctorJav.showId(); // se incrementa por que el constructor lo hace

//        showMenu();


        /*creando empleados*/
        var tipo = 10;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Para generar una fecha
        Date fecha = new Date();     

        try{
           fecha = sdf.parse("21-03-1988");
           Cliente cliente = new Cliente("Javier Paez",'M',33,"DIAG 5A # 37B -30",1,fecha,true);
           cliente.mostrarDatos();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //ahora se crea un nuevo objeto empleado
        Empleado emp = new Empleado("Alexandra Santos",'F',33,"CALLE 5A NO",5000000,"ESPECIALISTA");
        emp.mostrarDatos();

        Empleado emp2 = new Empleado("Javier Augusto Paez",'M',33,"DIAG 5A #37 -60",6000000,"ESPECIALISTA");
        emp2.mostrarDatos();

        //ahora creamos un paciente
        Patient patient = new Patient("Alejandra","alejandra@gmail.com");  // datos minimos para que un objeto pueda ser creado
        // System.out.println(patient.name); // estoy modificando directamente la variable, por tanto sale error.
        patient.setPhoneNumber("45655555888555");

        EnumDiaSemana dia = EnumDiaSemana.LUNES; //imprimo uno de los valores del enum
        // a continuacion se mostraran todos los valores del enum
        for(EnumDiaSemana dias : EnumDiaSemana.values()){
            System.out.println(dias);
        }
        
        


    }
}
