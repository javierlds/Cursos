package Poo;

import Poo.enums.Color;
import Poo.enums.TipoAutomovil;

public class EjemploAutomovilSwitchEnum {

    public static void main(String[] args){

        Automovil autoRenault2 =  new Automovil("Megane", "Renault99", Color.AZUL,2008,1600, TipoAutomovil.SEDAN);
        Automovil autoRenault3 =  new Automovil("Megane", "Renault", Color.GRIS,2008,1600,TipoAutomovil.HATCHBACK);

        System.out.println("* ********  GENERACION AUTO 3");
        TipoAutomovil renault2 = autoRenault2.getTipoAut();
        System.out.println("tipo mazda: " + renault2.getNombre());
        System.out.println("tipo mazda puertas: " + renault2.getPuertas());

        switch (autoRenault2.getTipoAut()){
            case SEDAN:
                System.out.println("El auto es sedan");
                break;
            case HATCHBACK:
                System.out.println("el auto es hatchback");
            default:
                    System.out.println("No aplica");
        }

        //Ejemplo con foreach, un enum puede ser iterable como un arreglo:
        System.out.println("RECORRIENDO UN ENUM: ");
        TipoAutomovil[] tipos = TipoAutomovil.values();  // Se utiliza el VALUES
        for(TipoAutomovil ta: tipos){
            System.out.println(ta.getNombre() + " - " +
                    ta.getPuertas()  + " - " +
                    ta.getDescripcion()+ "\n");
        }
    }
}
