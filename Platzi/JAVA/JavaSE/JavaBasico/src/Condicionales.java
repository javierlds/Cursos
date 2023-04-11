public class Condicionales {
    public static void main(String args[]){

        int edad;
        int archivosEnviados = 4;
        String nombre;
        edad = 10;
        edad++;

        if(edad == 10){
            archivosEnviados--;
            System.out.println("Entre en la validacion de if: " + archivosEnviados);
        }else if(edad == 11){
            System.out.println("Entre validando 11");
        }else{
            System.out.println("No entre.");
        }

        /*otro tipo de validacion para IF*/
        int  tiempo = 18;
        tiempo--;
        String resultado = (tiempo == 18)? "Entro a 18":"No entro a 18";
        System.out.println("Valor de resultado: " + resultado);
    }
}
