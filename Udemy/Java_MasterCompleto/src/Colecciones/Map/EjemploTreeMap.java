/*
*
* TreeMap en Java es una colección de pares clave-valor que ya están ordenados.
* Utiliza un árbol rojo-negro para fines de implementación. Java TreeMap implementa
* la interfaz NavigableMap además de la interfaz Map y también extiende la clase AbstractMap
*
* Los treemap son perfectos para mostrar gran cantidad de datos de estructura jerárquica
* (estructura de árbol). El espacio de la visualización está dividido en rectángulos a los que
* se les asigna un tamaño y un orden en función de una variable cuantitativa
*
* se ordena segun el orden natural de las claves
* */

package Colecciones.Map;

import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {

    public static void main(String args[]){
        Map<String, Object> persona = new TreeMap<>();
        persona.put("nombre","Jhon");
        persona.put("apellido","paez");
        persona.put("email","j@gmail.com");
        persona.put("edad",17);
        System.out.println(persona);  // ordena segun la llave

        Map<String, String>direccion = new TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","one street");
        direccion.put("numero","120");

        persona.put("direccion", direccion); // las colecciones son objetos por tanto se agrega otra llave valor con otro objeto ya lleno en este caso direccion
        System.out.println(persona);
    }
}