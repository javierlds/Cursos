package Java.RelacionClases;

public class Chip{

    //atributos
    private String empresa;
    private int numero;

    //constructor
    public Chip(String empresa, int numero){
        this.empresa = empresa;
        this.numero = numero;
    }

    //metodos
    public void mostrar(){
        System.out.println("\tEmpresa: " + empresa);
        System.out.println("\tNro Cel: " + numero);
    }
}

