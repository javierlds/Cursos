package StudyTool;
import java.util.Scanner;
public class Menu {

    private int opcion;
    public int mostrarMenu() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Seleccione opcion:\n  "
                + "1. Convertir Galones a litros \n "
                + "2. Convertir Litros a Galones \n");
        return opcion = Integer.parseInt(menu.nextLine());
    }

    public int getOpcion() {
        return this.opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
}

