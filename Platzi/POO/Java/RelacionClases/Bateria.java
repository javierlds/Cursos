package Java.RelacionClases;

public class Bateria {

    private int mAh;
    private String marca;

    //constructor
    public Bateria(int mAh, String marca){
        this.mAh   = mAh;
        this.marca = marca;
    }

    //metodos
    public void mostrar(){
        System.out.println("Cantidad mAh: " + mAh); 
        System.out.println("Marca: " + marca);
    }

}
