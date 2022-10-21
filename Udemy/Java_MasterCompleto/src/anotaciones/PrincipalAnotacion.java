package anotaciones;

import java.lang.reflect.*;

import java.time.LocalDate;
import java.util.Arrays;

public class PrincipalAnotacion {
    public static void main(String args[]) {
        Producto pr = new Producto();
        pr.setFecha(LocalDate.now());
        pr.setNombre("Mesa centro");
        pr.setPrecio(1000l);
        Field[] atributos = pr.getClass().getDeclaredFields();

    }
}