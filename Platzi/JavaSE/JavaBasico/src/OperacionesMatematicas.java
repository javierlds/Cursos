public class OperacionesMatematicas {
    public static void main(String[]args){
        double x = 2.1;
        double y = 3;
        // devuelve un entero hacia arriba
        System.out.println("Redondeo hacia arriba: " +Math.ceil(x));
        // devuelve un entero hacia abajo
        System.out.println("Redondeo hacia abajo:" +Math.floor(x));
        // Potencia
        System.out.println("Potencia: " + Math.pow(x,3));
        // Numero mayor
        System.out.println("Numero mayor: " + Math.max(x,y));
        // Numero menor
        System.out.println("numero menor: " + Math.min(x,y));
        // Raiz cuadrada
        System.out.println("raiz cuadrada: " + Math.sqrt(x));
    }
}
