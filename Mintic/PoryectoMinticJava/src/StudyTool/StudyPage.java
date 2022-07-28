package StudyTool;
import java.util.Scanner;

public class StudyPage {

    public static void main(String[] args) { // tambien se denomina clase driver
        Scanner scanterm = new Scanner(System.in);
        String termvar;
        System.out.println("Enter a study term: "); // solicito se ingrese un tema de estudio
        termvar = scanterm.nextLine(); // captura lo que se solicito
        Scanner scandef = new Scanner(System.in);
        String termdef;
        System.out.println("Enter a definition: "); // solicito se ingrese una definicion.
        termdef = scandef.nextLine(); // captura lo que se solicito
        System.out.println(termvar + ": " + termdef);
    }// finalizacion metodo principal.

}


