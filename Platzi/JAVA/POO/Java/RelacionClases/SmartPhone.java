package Java.RelacionClases;

public class SmartPhone {
    
    //atributos
    private String modelo;
    private Bateria bateria;
    private int nroChips;
    private Chip[] chips;

    //Constructor
    public SmartPhone(String modelo, int cantMAH, String marcaBateria){
        this.modelo   = modelo;
        this.bateria  = new Bateria(cantMAH,marcaBateria);   //se debe inicializar en el constructor de la clase Contenedora
        this.nroChips = 0;
        this.chips    = new Chip[2];
    }

    //Metodos
    public void mostrar(){
        System.out.println("Modelo: " + modelo);
        bateria.mostrar();
        System.out.println("Nro chips: " + nroChips);
        for(int i = 0; i < nroChips; i++){
            chips[i].mostrar();
        }
    }

    
}
