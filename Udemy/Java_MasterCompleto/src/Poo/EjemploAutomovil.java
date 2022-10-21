package Poo;

import Poo.enums.Color;
import Poo.enums.TipoAutomovil;
import jdk.swing.interop.SwingInterOpUtils;

public class EjemploAutomovil {

    public static void main(String[] args){
        String cadenaPrueba = new String();
        System.out.println("********* Creando auto 1 ***********");
        Automovil autoRenault = new Automovil();
        autoRenault.setModelo(2003);
        autoRenault.setColor(Color.AMARRILLO);
        autoRenault.setFabricante("Renault");
        autoRenault.setMarca("Laguna");
        autoRenault.setTipoAut(TipoAutomovil.CONVERTIBLE);

        System.out.println(autoRenault.toString());
        System.out.println(autoRenault.acelerar(500));
        System.out.println(autoRenault.frenar());
        System.out.println(autoRenault.calcularConsumo(500,0.75f));

        System.out.println("********* Creando auto 2 ***********");
        Automovil autoMazda = new Automovil();
        autoMazda.setModelo(2018);
        autoMazda.setColor(Color.AZUL);
        autoMazda.setFabricante("Mazda");
        autoMazda.setMarca("Mazda 3");
        autoMazda.setTipoAut(TipoAutomovil.HATCHBACK);
        System.out.println(autoMazda.toString());
        System.out.println(autoMazda.acelerar(250));
        System.out.println(autoMazda.frenar());
        System.out.println(autoMazda.calcularConsumo(500,0.75f));

        System.out.println("********* Creando auto 3 ***********");
        Automovil autoRenault2 =  new Automovil("Megane", "Renault99", Color.AZUL,2008,1600, TipoAutomovil.SEDAN);
        Automovil autoRenault3 =  new Automovil("Megane", "Renault", Color.GRIS,2008,1600,TipoAutomovil.HATCHBACK);
        System.out.println(autoRenault2.toString());
        System.out.println("Comparando autos ******");
        System.out.println("Son iguales: " + (autoRenault2 == autoRenault3));
        System.out.println("Son iguales: " + (autoRenault2.equals(autoRenault3))); //tambien se comparar objetos con equals
        System.out.println("**** Comparando dos objetos diferentes");
        System.out.println("Automovil vs string =" + (autoRenault2.equals(cadenaPrueba)));
        System.out.println("Automovil vs Automovil =" + (autoRenault2.equals(autoRenault3)));

        System.out.println("* ********  GENERACION AUTO 3");
        TipoAutomovil autoMazda3 = autoMazda.getTipoAut();
        System.out.println("tipo mazda: " + autoMazda3.getNombre());
        System.out.println("tipo mazda puertas: " + autoMazda3.getPuertas());








    }
}
