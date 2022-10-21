package ProyectoCitas;
import java.util.Scanner;
public class PruebaEnums {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un tipo de identificacion, CEDULA_CIUDADANIA, CEDULA_EXTRANJERIA, TARJETA_IDENTIDAD");
        String entrada = scan.nextLine().toUpperCase();//

        EnumTiposDoc evaluaDoc = Enum.valueOf(EnumTiposDoc.class, entrada);// valueOf convierte a String el parametro pasado
        System.out.println("Documento:" + evaluaDoc);
        System.out.println("Abreviatura documento: " + evaluaDoc.getAbreviatura());

        Scanner scanDia = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana:");
        String diaSem = scanDia.nextLine().toUpperCase();
        EnumDiaSemana  enumDia =  EnumDiaSemana.valueOf(EnumDiaSemana.class,diaSem);
        System.out.println("Dia semana:" +enumDia);
        System.out.println("Abreviatura :" + enumDia.getAbreviatura());



    }
    
}
