package StudyTool;

import java.util.Scanner;

public class CalculoGalones {
    final double LITRO = 4.54609;
    final double GALON = 0.264;

    private double galon;
    private double valorGalones;
    private double valorLitros;

    public void mostrarDatos(double valor, int opcion) {
        if(opcion == 1) {
            System.out.println("Galones ingresados: "+ valorGalones + "- valor en Litros: " + valor);
        }
    }

    // metodo que convertira los galones en litros.
    public double conversionGalones() {
        double operacion = 0;
        Scanner newgalon = new Scanner(System.in);
        System.out.println("Ingrese Galones: \n");
        valorGalones = Double.parseDouble(newgalon.nextLine());
        return operacion = valorGalones * LITRO;
    }

    public double conversionLitros() {
        double operacion = 0;
        Scanner datoLitro = new Scanner(System.in);
        System.out.println("Ingrese Litros: \n");
        valorLitros = Double.parseDouble(datoLitro.nextLine());
        return operacion = valorLitros * GALON;
    }

    public double getValorGalones() {
        return this.valorGalones;
    }

    public void setValorGalones(double valorGalones) {
        this.valorGalones = valorGalones;
    }

}
