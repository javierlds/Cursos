package Arreglos;

public class EjemploNumeroMayor {

    public static void main(String args[]){
        int a[] = {8,5,9,720,2,1280};

        int max = 0;
        for(int i = 1; i < a.length; i ++){
            max = (a[max] > a[i])? max:i;
        }
        System.out.println("a = " + a[max]);
    }
}
