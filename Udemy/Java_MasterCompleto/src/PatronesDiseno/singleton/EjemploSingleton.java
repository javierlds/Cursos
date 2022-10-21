/**
 *  Patron de diseño singleton: Es un patron creacional
 *                              permite utilizar una unica instancia de la clase muchas veces por ejemplo una conexion a bd solo conectar una vez y que pueda ser
 *                              usado muchas veces.
 *                              Esto se logra creando el objeto deseado en una clase y recuperándolo como una instancia estática
 * */
package PatronesDiseno.singleton;

public class EjemploSingleton {

    public static void main(String args[]){
        ConexionBDSingleton con = null;
        for(int i = 0 ; i < 10 ; i++){
            con = ConexionBDSingleton.getInstance();  // se crea un unica vez el objeto, se crea una sola referencia.
            System.out.println("con= " + con);
        }
        ConexionBDSingleton con2 = ConexionBDSingleton.getInstance();  // se crea un unica vez el objeto, se crea una sola referencia.
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstance();  // se crea un unica vez el objeto, se crea una sola referencia.

        boolean b1 = ((con == con2) && (con2 == con3));
        System.out.println("b1 = " + b1);
    }
}
