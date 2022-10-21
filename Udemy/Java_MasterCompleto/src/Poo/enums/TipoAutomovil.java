/**
 *Implementacion de enumeradoes con multiples atributos
 *
 *
 */

package Poo.enums;

public enum TipoAutomovil {

    SEDAN("Sedan",4,"Auto mediano"),
    STATION_WAGON("Station wagon",4,"Auto grande"),
    HATCHBACK("Hatchback",4,"Camioneta"),
    PICKUP("Pickup",4,"Camionenta pequeña"),
    COUPE("Coupe",2,"Auto pequeño"),
    CONVERTIBLE("Convertible",2,"Auto deportivo"),
    FURGON("Furgon",4,"Auto utilitario");

    private final String nombre;
    private final int puertas;
    private final String descripcion;

    TipoAutomovil(String nombre, int puertas, String descripcion){
        this.nombre = nombre;
        this.puertas = puertas;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
