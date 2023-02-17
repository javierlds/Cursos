package Poo;

import java.text.*;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class PruebaFechas {

    public static void main(String args[]) throws ParseException {
        String date_string = "2022-04-06";
        Date fechaVinculacion = new SimpleDateFormat("yyyy-MM-dd").parse(date_string);
        Date fechaActual = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat getYearMonth = new SimpleDateFormat("MM");
        String currentYear = getYearFormat.format(fechaActual);
        String currentMonth = getYearMonth.format(fechaActual);

        System.out.println("fecha vincualacion: " + fechaVinculacion);
        String anioVinculacion = getYearFormat.format(fechaVinculacion);
        String mesVinculacion = getYearMonth.format(fechaVinculacion);

        int anio1 = Integer.valueOf(currentYear);
        int mes1 = Integer.valueOf(currentMonth);
        System.out.println("MES 1 " + mes1);

        int anio2 = Integer.valueOf(anioVinculacion);
        int mes2 = Integer.valueOf(mesVinculacion);
        System.out.println("MES 2 " + mes2);

        int diferencia = anio1 - anio2;
        int diferenciaMeses = diferencia * 12 + mes1 - mes2;
        System.out.println("años: " + diferencia);
        System.out.println("meses: " + diferenciaMeses);
        }
}


