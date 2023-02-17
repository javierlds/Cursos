/**
 * Lambda: implementar un metodo sin necesidad de una clase
 * es una interfaz funcional
 * es una funcion o metodo de flecha
 * CONSUMER: Solo acepta un parametro
 * BICONSUMER: Acepta dos argumentos
 * */

package expresionesLambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjempoConsumer {

    public static void main(String[]args){
        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        consumidor.accept("SALUDO DE JAVIER");

        Consumer<Date> consumidorFecha = fecha ->{   // fecha es el parametro que espera
            SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd");
            System.out.println(f.format(fecha));  // se le aplica el formato a fecha
        };
        consumidorFecha.accept(new Date());  // accept es la forma de pasar el parametro a la expresion lambda

        // para pasar dos argumentos a la expresion lambda
        BiConsumer<String, Integer> consumidorBi = (nombre, edad)->{  // obligatorio colocar dos argumentos
            System.out.println(nombre + " tiene " + edad + " años!");
        };

        consumidorBi.accept("Javier", 34);

        // Otra forma de utilizar la funcion lambda es sin poner el parametro para que autoaticamente lo detecte
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Mensaje nuevo prueba");
    }
}
