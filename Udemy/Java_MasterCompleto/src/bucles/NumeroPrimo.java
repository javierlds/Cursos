package bucles;

public class NumeroPrimo {

    public void primos(){
        int arregloPrimos[]= new int[20];
        int calculo;
        int evaluaPrimo=0;
        for(int i =1; i <=19; i++){
            evaluaPrimo=0;
            for(int j=1; j<=19; j++){
                calculo = i % j;
                if (calculo == 0) {
                    evaluaPrimo++;
                }
            }
            if(evaluaPrimo <=2){
                arregloPrimos[i] = i;
            }
        }
        System.out.println("Los numeros primos son:");
        for(int z=0; z< arregloPrimos.length;z++){
            if(arregloPrimos[z]!=0){
                System.out.println(arregloPrimos[z]);
            }

        }
    }

}
