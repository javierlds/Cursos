public class UsoSwtich {
    public static void main(String args[]){
        int cilindraje = 5000;
        String marcaAuto  = "Renault";

        switch(cilindraje){
            case 5000:
                System.out.println("Cilindraje camioneta"); //si no se pone break evalua todo
                break;
            case 4000:
                System.out.println("cilindraje camaro");
            default:
                System.out.println("Cilindraje no valido");
        }

        switch(marcaAuto){
            case "Renault":
                System.out.println("Marca 1 de carro");
                break;
            case "Mazda":
                System.out.println("Marca 2 de carro");
            default:
                System.out.println("No encuentra marca");
        }
    }
}
