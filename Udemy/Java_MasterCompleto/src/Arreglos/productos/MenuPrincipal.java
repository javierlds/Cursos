package Arreglos.productos;

import java.util.Scanner;

public class MenuPrincipal {

    public void menu(){
        int opcion;
        ControlProductos ctrlProducto = new ControlProductos();
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecciona una opcion de menu:");
        System.out.println("1. Guardar producto\n"+
                           "2. Buscar producto\n"+
                           "3. Actualizar producto\n"+
                           "4. Listar productos almacenados\n"+
                           "5. Salir");
        opcion = Integer.parseInt(scan.nextLine());
        while(opcion !=5){
            switch(opcion){
                case 1:
                    ctrlProducto
            }

        }

    }
}
