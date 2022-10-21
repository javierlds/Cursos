package Arreglos;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Arreglos {

    //Declaracion e Instanciacion de arreglos, al final el numero de elementos, se utiliza el operador new

    // Declaracion instanciacion e inicializacion de arreglos
    public void inicializaArreglo(){
        int numeros[] = {1,2,3};
        System.out.println("Posicion 1: " + numeros[1]);
        System.out.println("Posicion 2: " + numeros[2]);

        // Inicializando arreglo de tipo objeto
        Producto productos[]= {new Producto("Computador",2000000),new Producto("silla computador",450000)};
        System.out.println("Nombre Producto 1" + productos[0].getNombreProducto());
        System.out.println("Precio Producto 1" + productos[0].getPrecioProducto());
    }

    // Arreglo de enteros
    public void arregloEnteros(){
        int numeros[] = new int[5]; // Son de tamaño fijo.

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = Integer.valueOf("5"); //convierte el caracter al primitivo para poderlo asignar
        numeros[4] = (int) 3L;  // Asignando un Long , haciendo cast a int
    }

    // Arreglos de tipo String, y ordenando el arreglo
    public void arregloStrings(){
        String nombres[] = new String[5];
        nombres[0] = "Zamudio";
        nombres[1] = "Javier";
        nombres[2] = "Andres";
        nombres[3] = "Jose";
        nombres[4] = "Lorena";
        Arrays.sort(nombres);  // Para ordenar el arreglo

        String nomb1 = nombres[0];
        String nomb2 = nombres[1];
        String nomb3 = nombres[2];
        String nomb4 = nombres[3];
        String nomb5 = nombres[4];

        System.out.println("nombres[0]" + nomb1);
        System.out.println("nombres[1]" + nomb2);
        System.out.println("nombres[2]" + nomb3);
        System.out.println("nombres[3]" + nomb4);
        System.out.println("nombres[4]" + nomb5);
    }

    // Arreglos de tipo objeto
    public void arregloObjetos(){
        Producto bodega[] = new Producto[2];
        Producto computador = new Producto("Computador",2000000);
        Producto sillaComputador = new Producto("silla computador",450000);

        bodega[0] = computador;
        bodega[1] = sillaComputador;

        Producto nuevoComputador = bodega[0]; // De esta forma se puede asignar a una variable tipo objeto , el objeto en una posicion del arreglo
    }

    public void recorrerArregloFor(){
        Producto bodega[] = new Producto[2];
        Producto computador = new Producto("Computador",2000000);
        Producto sillaComputador = new Producto("silla computador",450000);
        bodega[0] = computador;
        bodega[1] = sillaComputador;
        System.out.println("******* Recorriendo arreglos FOR *********");

        for(int i = 0; i < bodega.length; i ++){
            System.out.println("Nombre producto: = " + bodega[i].getNombreProducto());
            System.out.println("Precio producto = " + bodega[i].getPrecioProducto());
        }
    }

    public void recorrerArregloForEach(){
        Producto bodega[] = new Producto[2];
        Producto computador = new Producto("Computador",2000000);
        Producto sillaComputador = new Producto("silla computador",450000);
        bodega[0] = computador;
        bodega[1] = sillaComputador;
        System.out.println("******* Recorriendo arreglos FOREACH *********");
        for(Producto pro : bodega){
            System.out.println("Nombre producto:" + pro.getNombreProducto());
            System.out.println("Precio producto:" + pro.getPrecioProducto());
        }
    }

    public void recorrerArregloWhile(){
        Producto productos[] = new Producto[2];
        int total = productos.length;
        Producto prd1 = new Producto("Baso",2000);
        Producto prd2 = new Producto("Gafas", 3000);
        productos[0] = prd1;
        productos[1] = prd2;
        int i = 0;
        while(i < total){
            System.out.println("para el indice: " + i + " - Producto" + productos[i].getNombreProducto());
            System.out.println("para el indice: " + i + " - Producto" + productos[i].getPrecioProducto());
            i++;
        }
    }

    public void reccorrerArregloDoWhile(){  // El do while almenos ejecuta una vez
        Producto productos[] = new Producto[2];
        int total = productos.length;
        Producto prd1 = new Producto("Baso",2000);
        Producto prd2 = new Producto("Gafas", 3000);
        productos[0] = prd1;
        productos[1] = prd2;
        int i = 0;
        do{
          System.out.println("para el indice: " + i + " - Producto" + productos[i].getNombreProducto());
          System.out.println("para el indice: " + i + " - Producto" + productos[i].getPrecioProducto());
          i++;
        }while(i < total);
    }
}