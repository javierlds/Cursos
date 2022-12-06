/**
 * SET => No puede tener elementos duplicados
 * */

package Colecciones.Set.HashSet;

import Arreglos.Producto;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

    public static void main(String args[]){
        Producto producto1 = new Producto("javier",45000);
        Producto producto2 = new Producto("jose",60000);
        Producto producto3 = new Producto("andres",70000);
        Producto producto4 = new Producto("maria",85000);

        Set<Producto> productosSet = new HashSet<Producto>();
        productosSet.add(producto1);
        productosSet.add(producto2);
        productosSet.add(producto3);
        productosSet.add(producto4);

        for(Producto producto: productosSet){
            System.out.println(producto.getNombreProducto());
        }

    }
}
