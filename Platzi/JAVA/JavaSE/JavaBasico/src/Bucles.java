/**
 * Clase que muestra el uso de diferentes tipos de bucles practica
 * @autor Javier Paez Cruz
 * @version 1.0
 * @since 2021-08-25
 */
import java.util.Scanner;

public class Bucles {

    public static void main(String args[]) {
        int opcion;

        do {
            System.out.println("Seleccione opcion:");
            System.out.println("1. Uso while");
            System.out.println("2. Uso for");
            System.out.println("3. Uso do While");
            System.out.println("0. Salir");
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(defineCiclo(opcion));
                    break;
                case 2:
                    System.out.println(usoFor(5));
                    break;
                case 3:
                    System.out.println(defineCiclo(opcion));
                    break;
                default:
                    System.out.println("Opcion no encontrada.");
            }

        } while (opcion != 0);


    }

    public static String defineCiclo(int opcion) {
        String texto;
        if (opcion == 1) {
            texto = "Usted escogio la opcion while";
        } else if (opcion == 2) {
            texto = "Usted selecciono ciclo for";
        } else if (opcion == 3) {
            texto = "Usted escogio ciclo do while";
        } else {
            texto = "Opcion no encontrada.";
        }
        return texto;
    }


    public static String usoFor(int finalCiclo) {
        String texto = " ";
        for (int i = 0; i <= finalCiclo; i++) {
            if(i == finalCiclo - 1){
                texto = "Entre al ciclo numero: " + i;
                break;
            }else{
                texto = "No llegue al final del ciclo";
            }

        }
        return texto;
    }


}


