package ProyectoCitas;

import java.util.Scanner;


public class Menu {

    public static final String[]MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"}; // Final variable constante

    public void showMenu(){
        System.out.println("Bienvenido");
        System.out.println("Seleccione la opción deseada:");
        
        int response = 0;
        do{

            System.out.println("1. Menu Doctor");
            System.out.println("2. Menu Paciente");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response){
                case 1:
                   mostrarMenuDoctor();
                   break;
                case 2:
                   mostrarMenuPaciente();
                   break;
                case 3:
                   System.out.println("Gracias por su visita");
                   break;
                default:
                   System.out.println("Seleccione una opcion correcta..");


            }
        }while(response !=3);

 
    }

    public void mostrarMenuDoctor(){
        int response = 0;
        do{
            System.out.println("1. Registrar doctor");
            System.out.println("2. Consultar informacion doctor");
            System.out.println("3. Consultar citas segun fecha");
            System.out.println("4. Consultar fechas del dia");
            System.out.println("5. Rechazar cita");
            System.out.println("6. retornar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response){
                case 1:
                  registrarDoctor();
                  case 4:
                  showMenu();
                  default:
                  System.out.println("Seleccione opcion correcta.");
            }
        }while(response != 6);

    }

    public void registrarDoctor(){
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String name = scan.nextLine();
        System.out.println("Ingrese apellido:");
        String lastName = scan.nextLine();
        System.out.println("Ingrese mail:");
        String email = scan.nextLine();
        System.out.println("Ingrese sexo:");
        String sexo = scan.nextLine();
        System.out.println("Ingrese especialidad:");
        String especiality = scan.nextLine();





        // conexion 


    }

    public static void mostrarMenuPaciente(){
        int response = 0;
        do{
            System.out.println("1. Seleccionar Mes Cita");
            System.out.println("2. Seleccionar especialidad");
            System.out.println("3. Seleccionar doctor");
            System.out.println("4. Cancelar cita.");
            System.out.println("5. retornar");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response){
                case 1: 
                    for(int i = 1; i <= MONTHS.length; i ++){
                        System.out.println(i + "."+MONTHS[i-1]);
                    }
                    break;
                case 2:
                    mostrarEspecialidades();
                    break;
                default: 
                    System.out.println("Debe seleccionar una opcion correcta.");

            }

        }while(response != 5);
    }

    public static void mostrarFecha(){
        System.out.println("1. 31/03/2022 06:00 am");        
        System.out.println("2. 31/03/2022 06:30 am");        
        System.out.println("3. 31/03/2022 07:00 am");        
    }

    public static void mostrarEspecialidades(){
        System.out.println("1. Otorrino");
        System.out.println("2. Urologia");
        System.out.println("3. Pediatria");
    }
}
