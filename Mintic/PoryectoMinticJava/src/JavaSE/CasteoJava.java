package JavaSE;

/**
 * Esta clase muestra el uso del casteo implicito y explicito, conversion implicita: java convierte a un tipo primitivo mas pequeño a un tipo primitivo mas grande.
 * conversion explicita: java convierte a un tipo primitivo mas grande en un tipo primitivo mas pequeño, mediante el uso de conversión de tipos
 * @author japaez
 * @version 1.0
 * */


import java.math.*;
public class CasteoJava {

    static int CONTADOR = 0;
    public int retorno;
    public double valordob;

    //conversion implicita ejemplo
    public double conversionImplicita(int valor) {
        valordob = valor;
        return valordob;
    }

    //conversion explicita ejemplo
    public int conversionExplicita(int valor) {
        int x = (int)12.95;
        return x;
    }

    public int conviertoEntero(double valorDouble) {
        int retornaInt = (int)valorDouble;
        return retornaInt;
    }

    public double conviertoDecimal(int valorEntero) {
        double retornaDouble = (double) valorEntero;
        return retornaDouble;
    }

    public int preIncremento(int valor) {
        retorno = ++valor;  // primero incrementa
        return retorno;
    }

    public void postIncremento(int valor) {
        retorno = valor++; // incrementa despues
        System.out.println("Incremento en metodo: " + valor++);
        System.out.println("Incremento en metodo2: " + valor); // despues de utilizar la variable se ve reflejado el aumento

    }

    public int generaRandon() {
        int  valor = 0;
        return valor = (int)Math.random() *10 ;  // casteo el valor
    }

}

