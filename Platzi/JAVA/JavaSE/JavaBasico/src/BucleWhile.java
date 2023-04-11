public class BucleWhile {

    static boolean isTurnOnLight = false;
    static int i = 0;

    public static void main(String args[]){
        turnOnOffLight();

        while(isTurnOnLight && i <=10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println("...- - -...");
    }

    public static boolean turnOnOffLight(){
        return isTurnOnLight = (isTurnOnLight)?false:true;  //Operador terniario
    }
}
