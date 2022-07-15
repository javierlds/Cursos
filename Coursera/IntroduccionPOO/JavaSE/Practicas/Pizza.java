package Practicas;

public class Pizza {
	
	private String nombre;
	private double costoDeProduccion;
	private int cantidadProducida = 0;
	private double precioDeVenta;
	
	public int darCantidadProducida() {
		// instruccion de retorno
		cantidadProducida ++;
		return cantidadProducida;
	}
	
	public double modificarPrecioVenta(double nuevoPrecio) {
		return precioDeVenta = nuevoPrecio;

	}
	
	public double darGananciaUnitaria() {
		double ganancia = precioDeVenta - costoDeProduccion;
		return ganancia;  //precioDeVenta - costoDeProduccion; // se puede colocar operacion aritmetica en el retorno.
	}

	public double darGananciaTotal(){
		double resta = darGananciaUnitaria();  // obtengo el valor del calculo del metodo anterior, aplicando el llamado del metodo de la misma clase
		return resta * cantidadProducida;
	}
}