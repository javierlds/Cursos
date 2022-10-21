/*
* - Es muy utilizada para la implementacion de interfacez, no permite elementos repetidos, no permite objetos repetidos
* - permite un valor nulo
* - Esta completamente basado en objetos
* - Esta respaldado por un HashMap.
* */

package Colecciones.Set.HashSet;

import java.util.HashSet;

public class EjemploHashSetAgregar {

    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        hs.add("uno"); //cada add retorna un boolean
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("Elemento: " + hs);  // cada impresion es en desorden
        hs.add("tres");   // no agrega el elemento repetido
        System.out.println("Elemento: " + hs);
        hs.add("seis");
        System.out.println("Elemento: " + hs);
    }
}
