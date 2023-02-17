package Colecciones.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjemploHashMap {

    public static void main(String args[]){
        HashMap<String,Integer> mapPrueba = new HashMap<String, Integer>();
        //agregando elementos
        mapPrueba.put("Javier",34);
        mapPrueba.put("Jose", 45);
        mapPrueba.put("Hernan",34);

        //accediendo a los elementos:
        int edad = mapPrueba.get("Javier");
        for(String key: mapPrueba.keySet()){
            System.out.println("Edad de " + key + ":" +mapPrueba.get(key));
        }

        listaAnidada();
    }

    public static void listaAnidada(){
        Map<String, List<Integer>> map = new HashMap<>();

        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        map.put("ESTRATOS_BAJOS",valores);


        List<Integer> valores2 = new ArrayList<>();
        valores2.add(4);
        valores2.add(5);
        valores2.add(6);
        map.put("ESTRATOS_ALTOS",valores2);

        map.forEach((key,values)-> {
            for(Integer value: values){
                System.out.println("Llave:" + key + ", valor: " + value);
            }
        });



    }
}