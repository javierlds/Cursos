/*
* Enum =>  Es una coleccion de valores constantes o atributos constantes
* los valores de un ENUM son FINAL
* */
package Poo.enums;

public enum Color {
    ROJO("rojo"),
    AMARRILLO("amarillo claro"),
    AZUL("azul"),
    BLANCO("blanco"),
    GRIS("blanco"),
    NARANJA("naranja");

    private final String color;  // se guarda el color mas personalizado, por cada constante final se puede personalizar

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
