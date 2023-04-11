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

        System.out.println("Color del auto: " + auto1.getColor());

    }
}
