package Poo.herencia.ejercicio01;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, String sonido, String raza){
        super(nombre,edad,sonido); // inicializo los atributos de la clase padre para poderlos usar
    }
    public Perro(){

    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }

    public void jugar(){
        System.out.println("El perro esta jugando");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}