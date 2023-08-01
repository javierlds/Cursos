package Poo.herencia.ejercicio01;

public class Gato extends Animal{

    private String raza;
    public Gato(String nombre,int edad, String sonido,String raza){
        super(nombre,edad,sonido);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
