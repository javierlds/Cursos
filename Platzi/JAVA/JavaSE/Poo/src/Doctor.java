public class Doctor {
    //declaro primero los primeros atributos.
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor"); //esto se ejecuta cada vez que lo invoque
    }


    Doctor(String name){
        System.out.println("El nombre del doctor es " + name);
    }

    //Declaro los comportamientos
    public void showName(){
        System.out.println(name);  // imprimo el nombre del doctor
    }
}
