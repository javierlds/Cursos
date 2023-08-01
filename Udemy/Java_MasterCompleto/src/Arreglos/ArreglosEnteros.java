package Arreglos;

public class ArreglosEnteros {
    public static void main(String args[]){
        int enteros[] =new int[4];// arreglo por defecto
        // inicializando los valores del arreglo
        enteros[0] = 1;
        enteros[1] = Integer.valueOf("2"); // esta linea pasa el String a valor numerico
        enteros[2] = 3;
        enteros[3] = 4;

        // variables a las cuales se les asigna los valores asignados de cada indice
        int i = enteros[0];
        int j = enteros[1];
        int k = enteros[2];
        int l = enteros[enteros.length -1]; // si quiero asignar el elemento final siempre es el total -1

        // impresion de los valores asignados
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
