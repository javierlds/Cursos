/**
 * 
 * Clase que muestra el comportamiento del mismo nombre, al metodo principal pero solo imprime el llamado del correcto
 * */

package PaqueteInicial;

public class HelloExam {
	public static void main(String args) {
		System.out.println("Hola mundo 2");
	}
	
	public static void main(String args[]) {
		System.out.println("Hola mundo");
		// System.out.println("parametro 1:" + args[0]);
		// System.out.println("parametro 1:" + args[1]);
	}
	
	public static void main(int number) {
		System.out.println("hola mundo 3");
	}

}
