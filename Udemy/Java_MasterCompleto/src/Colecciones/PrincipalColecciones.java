package Colecciones;

import Colecciones.List.UsoArrayList;
import Colecciones.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalColecciones {

    public static void main(String args[]){
        String nombre;
        String apellido;
        int edad;
        int cantidad;
        int valida;

        ArrayList<Persona> pers = new ArrayList<>();
        UsoArrayList uso = new UsoArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas a registrar:");
        cantidad = Integer.parseInt(scan.nextLine());
        for(int i = 0 ; i < cantidad; i++){
            Persona per1 = new Persona();
            System.out.println("Ingrese nombre persona No" + (i +1) + ":");
            nombre = scan.nextLine();
            System.out.println("Ingrese apellido persona No" + (i +1) + ":");
            apellido = scan.nextLine();
            System.out.println("Ingrese edad persona No" + (i +1) + ":");
            edad = Integer.parseInt(scan.nextLine());
            per1.setNombre(nombre);
            per1.setApellido(apellido);
            per1.setEdad(edad);
            uso.llenaArregloPersona(per1);
            System.out.println("*** Registro exitoso....");
        }
        System.out.println("Desea ver el listado de personas? , 1 -> si, 2 -> no");
        valida = Integer.parseInt(scan.nextLine());
        if(valida == 1){
            uso.muestraArregloPersona();
        }else{
            System.out.println("Finaliza programa..");
        };

    }
}
