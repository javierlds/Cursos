package Poo.enums;

import Poo.Automovil;

public class EjemploEnums {

    public void asignaEnum(){
        Automovil auto1 = new Automovil();
        auto1.setMarca("Subaru");
        auto1.setCapacidadLitros(1600);
        auto1.setFabricante("Subaru motors");
        auto1.setColor(Color.AMARRILLO);
        auto1.setTipoAut(TipoAutomovil.CONVERTIBLE);

        Automovil auto2 = new Automovil("Megane","Renault",Color.AZUL,2006,1600,TipoAutomovil.SEDAN);
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
    }
}