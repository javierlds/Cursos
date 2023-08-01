/**
 * Equals: Para comparar referencias de objetos es lo mismo que decir  ==
 *
 * */
package Poo.metodoEquals;
import Poo.enums.Color;

import Poo.Automovil;

import java.awt.*;

public class Clase1Ejemplo {

    public void usoEquals(){
        Automovil auto1 = new Automovil();
        auto1.setMarca("Renault");
        auto1.setFabricante("Sofasa francia");
        auto1.setColor(Color.AZUL);

        Automovil auto2 = new Automovil();
        auto2.setMarca("Mazda");
        auto2.setFabricante("Mazda motors");
        auto2.setColor(Color.AMARRILLO);

        System.out.println(auto1.equals(auto2));

        System.out.println("Color del auto: " + auto1.getColor());

    }
}
