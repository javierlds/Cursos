package flujosControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UsoIf {
    public int edad;

    public void validaDatos(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese edad:");
        edad = Integer.parseInt(scan.nextLine());
        if(edad > 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}