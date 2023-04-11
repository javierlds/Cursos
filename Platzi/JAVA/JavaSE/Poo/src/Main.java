
//pendiente ver como importo de otra clase
public class Main {

    public static void main(String args[]){
        /*1. Primero va el nombre de la clase
        * 2. identificador de objeto
        * 3. new el objeto se crea, se instancia el objeto y ocupa espacio en memoria
        *  */

        /*Objeto 1*/
        Doctor myDoctor = new Doctor(); //se instancia el objeto   - Metodo constructor despues de la palabra new
        myDoctor.id   = 1001;
        myDoctor.name = "Javier Paez Cruz";
        myDoctor.showName();

        /*Objeto 2*/
        Doctor myDoctor2 = new Doctor("Diego Fernando");
        myDoctor2.id = 1002;
        myDoctor2.name = "Ivan Paez Suarez";
        myDoctor2.showName();

        //Constructor crea nuevas instancias de la clase
    }
}
