package StudyTool;

public class MainClass {
    public static int opcion;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Menu men = new Menu();
        CalculoGalones calc = new CalculoGalones();

        opcion = men.mostrarMenu();

        if(opcion == 1){
            calc.mostrarDatos(calc.conversionGalones(), opcion);
        }else if(opcion == 2) {
            calc.mostrarDatos(calc.conversionLitros(), opcion);
        }
    }
}
