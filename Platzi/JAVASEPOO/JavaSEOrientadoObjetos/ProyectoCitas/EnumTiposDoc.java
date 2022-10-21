package ProyectoCitas;

public enum EnumTiposDoc {

    CEDULA_CIUDADANIA("CC"), CEDULA_EXTRANJERIA("CE"), TARJETA_IDENTIDAD("TE");

    private String abreviatura;
    private EnumTiposDoc(String abreviatura){ //el constructor para enum debe ser privado. para no crear instancias
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura(){
        return this.abreviatura;
    }

    
    
}
