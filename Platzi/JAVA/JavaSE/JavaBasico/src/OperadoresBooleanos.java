public class OperadoresBooleanos {

    public static void main(String args[]){
        boolean evaluaRes = false;
        String nombre = "javieer";
        String nombre2 = "jose";
        int valNombre = 80;
        if(nombre != "javier"){
            valNombre++;
            System.out.println("entra a validar");
        }
        //Operadores relacionales
        if(valNombre <= 52){
            System.out.println("Tiene 52");
        }else if(nombre.equals("javierr")){
            System.out.println("Entra a 81");
        }else if(nombre == "javieer"){
            System.out.println("entra al final");
        }
        //Uso de OR y NOT
        if(nombre == "javieeer" || nombre2 != "jose"){
            System.out.println("Igualdad en nombres");
        }else if(!evaluaRes && nombre == "javieer" || nombre == "jose"){
            System.out.println("Evalua nombres largos");
        }


    }


}
