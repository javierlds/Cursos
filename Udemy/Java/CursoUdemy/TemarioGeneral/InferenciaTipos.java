/**
 * Var => Permite inferencia de tipos en java.
 * 
 */

public class InferenciaTipos{

    public void definoInferencia(){
        var variableEntera = 10;
        var nombre = "Javier"; // a partir de java 11 se puede utilizar var y 
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("Variable entera: " + variableEntera);
        System.out.println("Nueva linea: \n" + nombre);  // esto es un salto de linea
        System.out.println("Tabulador: \t "+ nombre);  // esto genera un espacio tab
        System.out.println("Retroceso: \b"+nombre); // quita un espacio hacia atras en la salida del programa
        System.out.println("Retroceso: \b\b"+nombre); // quita dos espacio hacia atras en la salida del programa
        System.out.println("Comilla sencilla: \'" + nombre + "\'");  // se debe utilizar diagonal inversa para poder utilizar el caracter
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}