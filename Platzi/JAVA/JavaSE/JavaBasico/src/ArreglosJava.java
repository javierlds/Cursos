/**
 * @author  Javier Augusto Paez Cruz
 * @version 1.0
 *
 * Arrays: Objetos en los que es posible almacenar mas de una variable.
 * */

public class ArreglosJava {
    public static void main(String argsç[]){

        String days[] = new String[7]; // Buen uso porque los dias de la semana no aumentaran
        int [][][] numbers = new int[2][2][2];  // filas - columnas - paginas
        System.out.println(arregloDosDim("Bogota"));

    }

    /*Insercion de datos en un arreglo, un arreglo empieza desde 0*/
    public static String llenoArreglo(int posicion){
        String texto = "";
        String[] androidVersiones = new String[17]; //Limitante de tamaño
        androidVersiones[0] = "apple pie";
        androidVersiones[1] = "Banana bread";
        androidVersiones[2] = "Cupcake";
        androidVersiones[3] = "Donut";
        texto = "La posicion a imprimir es la: " + androidVersiones[posicion];
        return texto;
    }

    public static String arregloDosDim(String ciudad){
        String texto = "";
        /**
         *
         * Country          City
         * Cundinamarca     Bogota
         * Antioquia        Medellin
         * Santander        Bucaramanga
         * Atlantico        Barranquilla
         * */
        String[][] cities = new String[4][2];  //La primera llave son los registros la segunda son las columnas
        cities[0][0] = "Atlantico";
        cities[0][1] = "Barranquilla";
        cities[1][0] = "Santander";
        cities[1][1] = "Bucaramanga";
        cities[2][0] = "Antioquia";
        cities[2][1] = "Medellin";
        cities[3][0] = "Cundinamarca";
        cities[3][1] = "Bogota";

        if (ciudad == cities[3][1]) {
            texto = "Se encontro la ciudad de bogota";
        }else {
            texto = "Ciudad no encontrada";
        }
        /**USO DE FOREACH*/
        //for(int i=0; i < cities.length; i++){
            for(int j=0; j < cities[1].length; j++){
                System.out.println(cities[1][j]);
            }
        //}
        return texto;
    }
}
