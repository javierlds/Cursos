package Arreglos;

public class EjemploNumMayor2 {

    public void numeroMayor(){

        int arreglo[] = {250,5,6,8,7,1800,36000,1,20,500};
        int max =0;
        for(int i = 1; i < arreglo.length; i++){
            max = (arreglo[max]> arreglo[i])?max: i;
        }
    }

    public void numeroMenor(){

    }

    public void numerosPares(){

    }

    public void numerosImpares(){

    }
}
