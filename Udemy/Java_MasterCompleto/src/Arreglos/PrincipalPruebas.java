package Arreglos;

public class PrincipalPruebas {

    public static void main(String args[]){
        Producto productos[] = new Producto[3];  // Almacenma referencias del objeto  -  [Contendra 3 espacios para 3 referencias de objetos tipo producto]

        Producto prod1 = new Producto();
        prod1.setNombreProducto("Jabon baño");
        prod1.setPrecioProducto(2500);

        Producto prod2 = new Producto();
        prod2.setNombreProducto("Llanta renault megane");
        prod2.setPrecioProducto(150000);

        //adicionnando los objetos al arreglo
        productos[0] = prod1;
        productos[1] = prod2;
        productos[2] = new Producto("Mesa planchar", 60000); // otra forma de cargar la posicion con otro objeto, es creando el objeto con el constructor que recibe los parametros
        System.out.println("Nombre Producto1: " + productos[0].getNombreProducto());
        System.out.println("Precio Producto1: " + productos[0].getPrecioProducto());
        System.out.println("Nombre Producto 3:" + productos[2].getNombreProducto()) ;
        System.out.println("Precio producto 3:" + productos[2].getPrecioProducto());

        Arreglos arr = new Arreglos();
        arr.recorrerArregloFor();
        arr.recorrerArregloForEach();
        arr.arregloStrings();
        arr.recorrerArregloWhile();

        ArreglosInverso arrin = new ArreglosInverso();
        arrin.forInverso();
        arrin.modificaArrInverso();


    }
}
