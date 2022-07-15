public class Variables {

    public static void main(String args[]){
        int variableEntera = 45; // espacio en memoria nombre -> valor., el 45 se considera literal
        int speed = 45; // limite de 10 digitos
        double valor = 4.545; // es mas grande que float
        float numFloat = 53.66f;
        char letra = 'd';  // un solo elemento y comillas simples
        int salario = 5000;
        long numLong = 4889999966L;  // Permite datos numericos mas grandes se debe poner L al final
        boolean valida =  true;
        final String jefe = "JAVIER AUGUSTO PAEZ CRUZ"; //Variables constantes

        String $ciudadNombre = "bogota";
        String nombre = "javier";

        System.out.println("Variable entera: " + variableEntera + " y velocidad:" + speed);
        System.out.println("Nombre persona: " + nombre);
        System.out.println("Flotante: " + numFloat);
        System.out.println("letra: " + letra);
        System.out.println("Numero long " + numLong);
        System.out.println("nombre ciudad: " + $ciudadNombre);

        if(salario <= 5000){
            salario = salario * 50;
            System.out.println("Salario con bono: " + salario);
        }
        salario += 50000;
        System.out.println("salario con otro aumento: " + salario);
        salario -= 145000;
        System.out.println("Salario con disminucion: " + salario);
        System.out.println("Nombre del jefe: " + jefe);

        if(valida){
            System.out.println("Entre si porque valide");
        }
        var validaBool = true;  // A partir de java 10 no es necesario colocar el tipo de dato solo con VAR
        var numEntero = 5; // Tambien no es necesario colocar el tipo de dato
        if(validaBool){
            System.out.println("Ahora entre a segundo validador");
        }

        // ****************** var inferencia de tipos de datos en java
        var numero = 10;
        var nombrePersona = "Javier";
        System.out.println("numero es :" + numero);
        System.out.println("nombrePersona = " + nombrePersona); // soutv es un atajo para poder imprimir



    }
}
