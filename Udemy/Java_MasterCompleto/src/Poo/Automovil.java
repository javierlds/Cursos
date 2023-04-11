/*
* Ejemplo de programacion orientada a objetos
* */

package Poo;

import Poo.enums.Color;
import Poo.enums.TipoAutomovil;

public class Automovil {

    private String marca;
    private String fabricante;
    private Color color;
    private int modelo;
    private int capacidadLitros;
    private TipoAutomovil tipoAut;  // uso de enums con argumentos

    public Automovil(String marca, String fabricante, Color color, int modelo, int capacidadLitros, TipoAutomovil tipoAut){ // sobrecarga de constructor
        this.marca = marca;
        this.fabricante = fabricante;
        this.color = color;
        this.modelo = modelo;
        this.capacidadLitros = capacidadLitros;
        this.tipoAut = tipoAut;
    }
    public Automovil(){

    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public TipoAutomovil getTipoAut() {
        return tipoAut;
    }

    public void setTipoAut(TipoAutomovil tipoAut) {
        this.tipoAut = tipoAut;
    }

    public String acelerar(int rpm){
        return "El auto " + getMarca() + " acelera a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " esta frenando...";
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(getCapacidadLitros() * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina){  //sobrecargando el metodo, ya que tiene diferente firma
        return km/(getCapacidadLitros() * porcentajeGasolina);
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca()
                + " \nFabricante:" + getFabricante()
                + " \nColor: " + this.color.getColor()
                + " \nModelo: " + getModelo()
                + "\nTipo:" + getTipoAut().getNombre() + " - Puertas: " + getTipoAut().getPuertas() + " - Descripcion:" + getTipoAut().getDescripcion() + "\n"; // el \n es para nueva linea
    }

    @Override // se sobreescribio el metodo Equals para comparar dos de los atributos y que sea considerado como unico
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){ //si el objeto que llega no es una instancia de automovil
            return false;
        }
        Automovil a = (Automovil)obj; // se hace cast
        System.out.println("Este fabricante: " + this.fabricante);
        return (this.fabricante.equals(a.getFabricante()) && this.modelo == a.modelo);//comparo el objeto creado 1 vs el objeto creado 2
    }
}
