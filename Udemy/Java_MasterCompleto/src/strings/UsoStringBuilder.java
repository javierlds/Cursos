package strings;

public class UsoStringBuilder {

    public void usoString(){
        StringBuilder str = new StringBuilder(20);
        str.append("hola");
        str.append("como ");
        str.append("estas");
        str.append(0);
        System.out.println(str.toString());


    }
}
