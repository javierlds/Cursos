package Poo.herencia.ejercicio01;

import java.util.HashMap;

public class Principal {
    public static void main(String args[]){
        HashMap<String,Animal> mapAnimales= new HashMap<String, Animal>();
        Perro perro = new Perro("Molly",1,"ladrar","minipincher");
        Perro perro2 = new Perro("bruno",15,"ladrar","criollo");
        Gato gato1 = new Gato("mia",3,"maullar","criolla");

        mapAnimales.put("perro1",perro);
        mapAnimales.put("perro2",perro2);
        mapAnimales.put("gato1",gato1);
        for(Animal animal: mapAnimales.values() ){
            System.out.println("Nombre: "+" " + animal.getNombre()+ "-Edad:" +animal.getEdad());
        }


    }
}
