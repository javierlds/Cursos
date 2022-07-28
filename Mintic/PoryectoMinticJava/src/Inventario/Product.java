package Inventario;

public class Product {

    //Declaraciones de campo de instancia
    private int numeroElemento;
    private String nombreProducto;
    private int numeroUnidades;
    private double precioUnidad;

    //Constructor para inicializar los valores por defecto
    public Product() {

    }

    public Product(int numeroElemento, String nombreProducto, int numeroUnidades, double precioUnidad) {
        this.numeroElemento = numeroElemento;
        this.nombreProducto = nombreProducto;
        this.numeroUnidades = numeroUnidades;
        this.precioUnidad = precioUnidad;
    }

    //metodo toString para imprimir los atributos de la instancia
    @Override
    public String toString() {
        return "Numero Elemento: " + this.numeroElemento + "\n"
                + "Nombre producto:" + this.nombreProducto +"\n"
                + "Numero unidades:" + this.numeroUnidades + "\n"
                + "Precio unidad: " + this.precioUnidad;

    }


    public int getNumeroElemento() {
        return this.numeroElemento;
    }

    public void setNumeroElemento(int numeroElemento) {
        this.numeroElemento = numeroElemento;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNumeroUnidades() {
        return this.numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    public double getPrecioUnidad() {
        return this.precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
}

