package flujosControl;

import java.util.Scanner;

public class usoSwitch {

    public static void main (String args[]){


        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = Integer.parseInt(scan.nextLine());

        switch(num){
            case 0:
                System.out.println("Es el numero 0");
                break;
            case 1:
                System.out.println("entro a 1");
                break;
            case 2:
                System.out.println("entra a 2.");
                break; // para acabar hasta aca si no va break imprim
            default:
                System.out.println("no es un numero valido");
        }
    }
}