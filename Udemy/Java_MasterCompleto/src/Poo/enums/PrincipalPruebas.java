package Poo.enums;

import Poo.interfaces.Ejemplo;

public class PrincipalPruebas {

    public static void main(String args[]){
        EjemploEnums enums = new EjemploEnums();
        enums.asignaEnum();

        System.out.println("" + Rol.ROLE_ADMIN_CONFIGURACION_GENERAL.getCodigo());



    }
}
