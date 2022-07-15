package Practicas;

public class Cocinero {
	
	private Pizza pizza_1;  // de esta forma se maneja la asociacion entre clases
	private Pizza pizza_2;
	private String nombre;
	private String apellido;

	public Cocinero(){
		pizza_1 = new Pizza("carnes",120000,25000);
		pizza_1.darCantidadProducida();
	}

	public void mostrarDatos(){
		System.out.println("Cocinero:" + nombre + " " + apellido);
		System.out.println("Pizza :" + " " + );
		System.out.println("Cocinero:" + nombre);

	}

	public int darUnidadesProducidas(){
		return pizza_1.darCantidadProducida() + pizza_2.darCantidadProducida();
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}
}
