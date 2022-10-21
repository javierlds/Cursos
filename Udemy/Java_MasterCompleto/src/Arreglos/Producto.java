/*
* Clase para crear varios objetos y almacenarlos en un array de objetos
* */
package Arreglos;

public class Producto {

    private String nombreProducto;
    private double precioProducto;

    public Producto(){

    }
    public Producto(String nombreProducto, double precioProducto){
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto(){
         return precioProducto;
    }

    public void setPrecioProducto(double precioProducto){
        this.precioProducto = precioProducto;
    }
}
