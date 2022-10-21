package ProyectoCitas;

public enum EnumDiaSemana{
    LUNES("LUN"), MARTES("MA"), MIERCOLES("MIE"), JUEVES("JUE"), VIERNES("VIE"), SABADO("SAB"), DOMINGO("DOM");

    String abreviatura;
    private EnumDiaSemana(String abreviatura){
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura(){
        return this.abreviatura;
    }


}