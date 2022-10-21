package PatronesDiseno.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia; // atributo statico que tiene la referencia de la clase

    private ConexionBDSingleton(){  // Constructor privado para no generar multiples instancias
        System.out.println("Conectandose a un motor de bd.");
    }

    public static ConexionBDSingleton getInstance(){
        if(instancia == null){ //no existe la referencia es decir si ya se crea una unica vez solo valida esa vez
            instancia = new ConexionBDSingleton();  // solo dentro de la clase puedo llamar / se crea y se retorna
        }
        return instancia;
    };


}
