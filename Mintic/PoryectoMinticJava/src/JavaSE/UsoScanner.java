package JavaSE;
import java.util.Scanner;
public class UsoScanner {

    public String imprimiendoMensaje(){
        String nombre;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();
        return nombre += " -Empleado";
    }

    public void capturaCaracter(){
        char caracter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        caracter = scan.nextLine().charAt(0);
        System.out.println("Caracter: " + caracter);
    }

    public String usoSwitch(int validaDia){
        String diaSemana = "";
        switch(validaDia){
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Dia de la semana invalido";
        }
        return diaSemana;
    }

}
