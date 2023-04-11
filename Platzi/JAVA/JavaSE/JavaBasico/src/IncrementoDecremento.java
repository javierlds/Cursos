public class IncrementoDecremento {

    public static void main(String args[]){
        int vidas = 5;
        vidas = vidas -1;
        System.out.println(vidas);

        vidas --;
        System.out.println("Menos una vida: " + vidas);
        vidas++;
        System.out.println("Mas una vida: " + vidas);
        vidas += 8;
        System.out.println("Mas vidas: " + vidas);
    }
}
