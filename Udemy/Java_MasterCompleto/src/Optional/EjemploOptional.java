/**
 * Optional =>
 * empty => se crea un optional vacio
 * of => se crea a partir de una referencia (T value) = no se puede pasar un nulo
 * ofNullable => se crea a partir de una referencia (T value) = se puede pasar un nulo
 * */

package Optional;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String args[]){
        String nombre = "Jose";
        Optional<String>opt = Optional.of(nombre);
        System.out.println("opt = " +  opt);
        System.out.println(opt.isPresent());  // indica si esta presente el objeto
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());  // .get para obtener el valor del optional
        }
        System.out.println("op:" + opt.isEmpty());  // es la negacion


    }
}
