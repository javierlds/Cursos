package Poo.herencia.ejercicio01;

public class Animal {
    private String nombre;
    private int edad;
    private String sonido;

    public Animal(){

    }
    public Animal(String nombre, int edad, String sonido){
        this.nombre = nombre;
        this.edad = edad;
        this.sonido = sonido;
    }

    public void hacerSonido(Animal animal){
        System.out.println("El animal " + animal.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
