public class CastJava {
    public static void main(String args[]) {
        double calculo = 30.0 / 12.0;

        //casteo
        int estima = (int) calculo; // Cuando se transforma a un valor mas pequeño se trunca parte decimal
        System.out.println("VALOR DESPUES DE CAST: " + estima);

        int a = 30;
        int b = 12;
        int operacion = a /b;
        System.out.println("valor calculo con casteo: " + (double)operacion + " ,valor sin casteo: " + operacion); // lo casteo para que el resultado de lo mas exacto posible

        char n = '1';
        int ni = n;
        System.out.println("valor de n1: " + ni);
    }
}
