package Arreglos;

public class ArreglosInverso {

    public void forInverso(){
        Producto bodega[] = new Producto[4];
        Producto prd1 = new Producto("Pantalla", 1500);
        Producto prd2 = new Producto("Teclado",1600);
        Producto prd3 = new Producto("Casco",1700);
        Producto prd4 = new Producto("maleta", 5000);
        bodega[0] = prd1;
        bodega[1] = prd2;
        bodega[2] = prd3;
        bodega[3] = prd4;

        System.out.println("************* FOR INVERSO *************");
        for(int i = 0; i < bodega.length; i ++){
            System.out.println("indice: " + (bodega.length - 1 -i) + " - Nombre producto: " + bodega[bodega.length-1-i].getNombreProducto());
            System.out.println("indice: " + (bodega.length - 1 -i) + " - Precio producto: " + bodega[bodega.length-1-i].getPrecioProducto());
        }

        System.out.println("************ FOR INVERSO 2");
        for(int i = bodega.length -1 ; i >= 0 ; i--){
            System.out.println("indice: " + i + " - Nombre producto: " + bodega[i].getNombreProducto());
            System.out.println("indice: " + i + " - Precio producto: " + bodega[i].getPrecioProducto());
        }
    }

    public void modificaArrInverso(){
        Producto bodega[] = new Producto[4];
        Producto prd1 = new Producto("Pantalla", 1500);
        Producto prd2 = new Producto("Teclado",1600);
        Producto prd3 = new Producto("Casco",1700);
        Producto prd4 = new Producto("maleta", 5000);
        bodega[0] = prd1;
        bodega[1] = prd2;
        bodega[2] = prd3;
        bodega[3] = prd4;

        for(int i = 0; i < bodega.length; i ++){
            String actualNombProducto = bodega[i].getNombreProducto();
            double actualPrecProducto = bodega[i].getPrecioProducto();
            String inverNombProducto = bodega[i-1-i].getNombreProducto();
            double inverPrecProducto = bodega[i-1-i].getPrecioProducto();

            bodega[i].setNombreProducto(inverNombProducto);
            bodega[i].setPrecioProducto(inverPrecProducto);
            bodega[i-1-i].setNombreProducto(actualNombProducto);
            bodega[i-1-i].setPrecioProducto(actualPrecProducto);
        }
    }
}