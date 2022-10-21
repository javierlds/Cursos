/**
 * GENERICOS = Evitan que se haga casteo y podemos pasar cualquier tipo de objeto
 * */

package genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalGenericos {

    public static void main(String args[]){
        List<Clientes> clientes = new ArrayList<>();
        clientes.add(new Clientes("Javier","Paez","1018415765",34));

        // Clientes javier2 = (Clientes)clientes.iterator().next(); // otra forma de obtener el dato con un iterator // se hace el CAST
        Clientes javier = clientes.get(0); // una forma para obtener el cliente
        Clientes javier2 = clientes.iterator().next(); // otra forma de obtener el dato con un iterator // se hace el CAST

        Clientes[] clientesArreglo = {new Clientes("Javier","Paez","1018415765",34),
                new Clientes("Jose","Paez","39747330",34)}; // Arreglo de objetos
        Integer[] enterosArreglo= {1,2,3};   // arreglo de enteros

        List<Clientes> clientesLista = desdeArrayaLista(clientesArreglo);
        List<Integer> enterosLista =desdeArrayaLista(enterosArreglo);

        clientesLista.forEach((n) -> System.out.println(n.getNombre())); // para imprimir la lista de clientes
        enterosLista.forEach(System.out::println);

        List<String> nombres =
    }

    // Genericos reutilizables T = Listas // Parametros genericos
    public static <T> List<T> desdeArrayaLista(T[] c){   //Recibe cualquier tipo, cliente, producto, enteros
        return Arrays.asList(c);
    }

    public static <T,G> List<T> desdeArrayaLista(T[] c, G[] g){   //Recibe cualquier tipo, cliente, producto, enteros
        for(G elemento: g){  //G puede ser cualquier tipo de dato
            System.out.println("Elemento G: " + elemento);
        }
        return Arrays.asList(c); // Convierte ese tipo de dato en lo que sea
    }
}
