/**
 * Clase para el uso de funciones y condicionales.
 * @autor Javier Paez Cruz
 * @version 1.0
 * @since 2021-08-08
 * */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Funciones {
    /*- Organizar y modularizar el codigo
      - reutilizar el codigo
      - Evitar codigo repetido*/

    public static void main(String args[]){
        String fecha;
        String numero1;
        String numero2;
        String nombre;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento en formato(YYYY-MM-DD):");
        fecha = entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println(calculaEdad(fecha,nombre));

        // Ahora hace el llamado a la funcion para determinar si es mayor de edad o no
    }

    /**
     * Metodo para calcular la edad de una persona
     * @param fecha parametro que se envia con la fecha de nacimiento de la persona
     * @return Retorna la edad de acuerdo a la fecha de nacimiento de la persona
     * */
    public static String calculaEdad(String fecha, String persona){ // esta es la firma de la funcion
        int dia;
        int mes;
        int ano;
        int diaActual;
        int mesActual;
        int anoActual;
        long edad;
        String respuesta;
        String busqueda = "";

        if(fecha.length()>10) {
            respuesta = "Fecha de nacimiento incorrecta, debe ingresar un valor correcto";
        }else if(busqueda.indexOf("-")!=-1){
            respuesta = "Formato incorrecto, debe ingresar un formato valido";
        }

        else {
            ano = Integer.parseInt(fecha.substring(0,4));
            mes = Integer.parseInt(fecha.substring(5,7));
            dia = Integer.parseInt(fecha.substring(8,10));

            LocalDate currentdate = LocalDate.now(); // obtengo la fecha actual
            diaActual = currentdate.getDayOfMonth(); // obtengo el dia actual
            mesActual = currentdate.getMonthValue(); // obtengo el mes actual
            anoActual = currentdate.getYear();// Obtengo el año actual
            LocalDate start = LocalDate.of(ano,mes,dia);
            LocalDate end = LocalDate.of(anoActual,mesActual,diaActual);
            edad = ChronoUnit.YEARS.between(start,end);
            respuesta = "El señor " + persona + " tiene " + edad + " años.";
        }
        return  respuesta;
    }

    public int suma(int a, int b){
        int resultado;

        resultado = a + b;
        return resultado;
    }

}
