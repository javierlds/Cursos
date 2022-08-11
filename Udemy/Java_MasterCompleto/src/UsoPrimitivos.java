/*
* Primitivos:
* Enteros - Flotante - Caracteres - Booleanos
* El tipo de dato se escribe en minuscula
* */

//secuencias de escape:
/*
 * \b retroceso
 * \n nueva linea
 * \r retorno del carro
 * \t tabulador
 * \\ Diagonal invertida
 * \" comillas dobles
 * */

public class UsoPrimitivos {

    boolean a = false;  // valor por defecto es FALSE
    boolean b = true;
    char a1 = 'a'; //cada caracter almacena 16 bits
    char c = '\u0021'; // codigo unicode siempre colocar u al principio

    // primitivos int  de menor a mayor => byte, short, int, long(poner L)
    // primitivo float (f al final)  , double(no lleva ninguna letra)

    // tabla resumen:

    /**
     * primitivo   descripcion          tamaño      Clase Wrapper       valor por defecto
     * boolean     valor logico        1 bit       Boolean              false
     * char        caracter            16bits      Character            u0000
     * byte        entero muy pequeño  8bits       Byte                 0
     * short       entero pequeño      16bits      Short                0
     * int         entero              32bits     Integer              0
     * long        Entero Grande       64bits     Long                 0L
     * float       Num real precision simple  32bits   Float            0.0f
     * double      Num real precision doble   64bits   Double           0.0d
     */

    public static void main(String []args){
        byte numeroByte = 7;
        System.out.println("numero byte = " + numeroByte);
        System.out.println("Tipo de byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo de byte corresponde en bits a " + Byte.SIZE);
        System.out.println("Valor maximo e un byte: " + Byte.MAX_VALUE); // Es 127
        System.out.println("Valor maximo e un byte: " + Byte.MIN_VALUE); // Es -128

        short numeroShort = 30000;
        System.out.println("numero short = " + numeroShort);
        System.out.println("Tipo de short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo de short corresponde en bits a " + Short.SIZE);
        System.out.println("Valor maximo en un short: " + Short.MAX_VALUE); // Es 32767
        System.out.println("Valor maximo en un short: " + Short.MIN_VALUE); // Es -32768

        int numeroInt = 2147483644;
        System.out.println("numero Int = " + numeroShort);
        System.out.println("Tipo de Int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo de Int corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor maximo en un Int: " + Integer.MAX_VALUE); // Es 2147483647
        System.out.println("Valor maximo en un Int: " + Integer.MIN_VALUE); // Es -2147483648

        long numeroLong = 2147483648L; // se debe poner la L
        System.out.println("numero Long = " + numeroShort);
        System.out.println("Tipo de Long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo de Long corresponde en bits a " + Long.SIZE);
        System.out.println("Valor maximo en un Long: " + Long.MAX_VALUE); // Es 9223372036854775807
        System.out.println("Valor maximo en un Long: " + Long.MIN_VALUE); // Es -9223372036854775808

        float numeroFloat = 2147483648F; // se debe poner la F
        System.out.println("numero float = " + numeroShort);
        System.out.println("Tipo de float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo de float corresponde en bits a " + Float.SIZE);
        System.out.println("Valor maximo en un float: " + Float.MAX_VALUE); // Es 3.4028235E38
        System.out.println("Valor maximo en un float: " + Float.MIN_VALUE); // Es  1.4E-45

        var numeroVar = 465456; // si se usa var toma el valor por defecto segun se asigne sin usar tipo dato.

        char caracter = 'a';  //UNICODE BUSCAR EN INTERNET
        System.out.println("char = " + caracter);
        System.out.println("Tipo de char corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo de char corresponde en bits a " + Character.SIZE);
        System.out.println("Valor maximo en un char: " + Character.MAX_VALUE); // Es 3.4028235E38
        System.out.println("Valor maximo en un char: " + Character.MIN_VALUE); // Es  1.4E-45



    }

}
