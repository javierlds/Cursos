package EstructuraDatos;

import java.util.ArrayList;

public class UsoArrayList {

    //Creando arreglo ArrayList
    public ArrayList creaArray(){
        ArrayList<String> listaNombres = new ArrayList<>(); //de esta forma se declara

        //Agregando elementos a la lista:
        listaNombres.add("Javier");
        listaNombres.add("Jose");
        listaNombres.add("Maria");
        return listaNombres;
    }

    //Recorrer Arreglo
    public void recorrerArray(ArrayList<String> arrNombre){
        for(String n : arrNombre){
            System.out.println("Nombre:" + n);
        }
    }

    //Creando arreglo de objetos
    public ArrayList crearArrayObjetos(){
        ArrayList<Persona> arregloPersona =new ArrayList<>();
        arregloPersona.add(new Persona("javier","augusto",34));
        arregloPersona.add(new Persona("jose","perea",45));

        return arregloPersona;
    }

}
