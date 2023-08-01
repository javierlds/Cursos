package bucles;

public class UsoBucles {

    public String usoWhile(){
        int contador = 0;
        while(contador < 3){
            contador++;
        }
        if(contador ==3){
            return "Ingreso";
        }else{
            return "No Ingreso";
        }
    }

    public void usoDoWhile(){
        int contador = 0;
        do{
            contador++;
        }while(contador <3);
    }

    public void usoFor(){
        for(int i=0; i< 4; i++){
            System.out.println("Entra a ciclo: " + i);
        }
    }
}
