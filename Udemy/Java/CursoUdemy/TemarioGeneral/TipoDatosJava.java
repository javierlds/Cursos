
public class TipoDatosJava {

    private int numero;
    private String cadena;
    private float  valorFloat;
    private char   caracter;
    private boolean esValido;
    private final int numeroNoModif =15;  //tipo FINAL no se puede modificar.
    

    public TipoDatosJava(int numero, String cadena,float valorFloat, char caracter,boolean esValido){
        this.numero = numero;
        this.cadena = cadena;
        this.valorFloat = valorFloat;
        this.caracter = caracter;
        this.esValido = esValido;
    }

    public void asignaValores(){

    }

    public void mostrarDatos(){
        System.out.println("El numero es:" + numero);
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String cadena(){
        return cadena;
    }

    public void setCadena(String cadena){
        this.cadena = cadena;
    }
}
