package Poo.interfaces;

abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido){
        this.contenido = contenido;
    }

    abstract public String imprimir();
}
