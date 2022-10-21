package Excepciones;

import java.util.Scanner;

public class Ejemplo1_excepcion {

    public void controlaExcepcion(){
        int numero1;
        int numero2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        numero1 = Integer.parseInt(scan.nextLine());

        System.out.println("Ingrese numero 2: ");
        numero2 = Integer.parseInt(scan.nextLine());

        System.out.println("numero1 / numero2 = " + "1");

    }
}
