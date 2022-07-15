package CursoUdemy.dominio;
public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;  //con tipos booleanos se debe poner en su encapsulación la palabra "is"

    public Persona(String nombre,double sueldo, boolean eliminado){
        this.nombre    = nombre;
        this.sueldo    = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() { //metodo para recuperar el dato de la variable y el retorno sera acorde al tipo de la variable que estamos encapsulando.
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { // para los booleanos se debe usar "is" no se debe poner get
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

}
