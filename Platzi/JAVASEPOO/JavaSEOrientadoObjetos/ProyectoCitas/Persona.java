package ProyectoCitas;

// clase herencia UDEMY
public class Persona {

    //protected: permite ser accedido por los hijos de la clase
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;

    public Persona(String nombre){  // varios constructores me permiten crear los objetos de diferente forma
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad   = edad;
        this.direccion = direccion;

    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public char getGenero(){
        return genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdadd(int edad){
        this.edad = edad;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
}
