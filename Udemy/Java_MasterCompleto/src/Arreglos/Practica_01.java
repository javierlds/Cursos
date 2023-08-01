package Arreglos;

public class Practica_01 {

    public void InicializaArr() {
        int numeros[] = new int[3];
        int contador = 0;
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        try{Producto pr[] = new Producto[3]; // inicializando arreglo de productos;
            pr[0]= new Producto("Computador Portatil",2500);
            pr[1]= new Producto("Computador de mesa",1200000);
            pr[2]= new Producto("mesa de trabajo ",1250000);
            for(Producto prArr: pr){
                contador +=1;
                System.out.println("Producto #"+contador);
                System.out.println("Objeto 1 nombre:" + prArr.getNombreProducto());
                System.out.println("Objeto 2 precio:" + prArr.getPrecioProducto());
            }

        }catch(NullPointerException e){
            System.out.println("Falta inicializar un objeto");
        }
    }

    public void inicializa2(){
        int numeros[] = {1,2,3,4,5}; //inicializacion de forma directa arreglo numeros
        Producto pr2[] = {new Producto ("llanta",350000), new Producto("puerta",650000)};// inicializa objeto de productos directamente

        System.out.println("longitud arreglo numeros:" + numeros.length);
        //recorriendo objeto:
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice " + i + " , numero:" +  numeros[i]);
        }
    }

    public void usoForEach(){
        String nombres[] = {"javier","augusto","diego","ivan"};
        for(String nom: nombres){
            System.out.println("Nombre:" + nom);
        }
    }
}
