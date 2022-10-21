package Colecciones.List;

import Colecciones.Persona;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class UsoArrayList  {

    List<Persona> arrPer = new ArrayList<>();  // adiciono cada elemento con add.
    public List<String> usoArray(){
        List<String> lista = new ArrayList();
        lista.add("Javier");
        lista.add("Andrea");
        lista.add("Jose");

        System.out.println("** Recorriendo con foreach");
        for(String s: lista){
            System.out.println("Lista: " + s);
        }

        System.out.println("** Recorriendo con Iterator");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println("Lista iterator:" + iterator.next());
        }

        return lista;
    }

    public List<Persona> llenaArregloPersona(Persona persLleno){
        arrPer.add(persLleno);
        return arrPer;
    }

    public void muestraArregloPersona(){
        System.out.println("*** Muestra listado personas");
        int i = 1;
        for(Persona per: arrPer){
            System.out.println("************ Persona numero: " + i + "************");
            System.out.println("Nombre persona: " + per.getNombre() + "\n" + "Apellido persona: " + per.getApellido()+ "\n" + "Edad persona: " + per.getEdad() + "\n");
            i++;
        }
    }
}