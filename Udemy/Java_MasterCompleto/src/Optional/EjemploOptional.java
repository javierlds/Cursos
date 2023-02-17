/**
 * Optional => que un valor este presente o ausente, para evitar error null pointer exception en tiempo de ejecucion
 *             anidando el objeto dentro de esta clase es un contenedor, solo se puede guardar un solo valor,
 *             no se controla si es null con un if
 * empty => se crea un optional vacio
 * of => se crea a partir de una referencia (T value) = no se puede pasar un nulo
 * ofNullable => se crea a partir de una referencia (T value) = se puede pasar un nulo
 * */

package Optional;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String args[]){
        String nombre = null;
        String nombre2 = "Javier";
        Optional<String>opt1 = Optional.of(nombre2);//Optional.of(nombre);  // no se puede pasar nulo cuando es of
        Optional<String>opt2 = Optional.ofNullable(nombre);//Optional.of(nombre);
        System.out.println("opt1 = " +  opt1);
        System.out.println("opt2 = " +  opt2);
        System.out.println("nombre1 esta presente? " + opt1.isPresent());  // indica si esta presente el objeto
        System.out.println("nombre2 esta presente? " + opt2.isPresent());  // indica si esta presente el objeto
        if(opt1.isPresent()){
            System.out.println("Hola estoy presente:" + opt1.get());  // .get para obtener el valor del optional
        }else{
            System.out.println("No esta presente");
        }
        System.out.println("op:" + opt1.isEmpty());  // es la negacion, si esta vacio

        //Con expresiones lambdas
        opt1.ifPresent(valor -> System.out.println("Hola:  " + valor));

        opt2.ifPresentOrElse(valor -> System.out.println("Hola:  " + valor),()-> System.out.println("No esta presente"));


    }
}

