package Poo.enums;

public enum Rol {

    ROLE_ADMIN_AFILIACIONES  ("ROL_ADM_AFIL"),
    ROLE_ADMIN_CONSULTA_AFILIACIONES ("ROL_ADM_CONAFIL"),
    ROLE_ADMIN_CONFIGURACION_GENERAL ("ROL_ADM_CONFGE");

    private String codigo;

    Rol(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

}