/*
 * @author Javier Paez
 * @version 0.1
 * 
 * Clase que muestra el correcto uso de import y los comentarios
 * */

package PaqueteInicial;
import java.util.ArrayList;  // el import va despues de la declaracion del paquete

public class Ejercicio1 {
	
	public static void main(String args[]) {
		System.out.println("Hola mundo");  // comentario individual
		Ejercicio1 eje = new Ejercicio1();
		eje.usoComentarios();
	}
	
	public void usoComentarios() {
		String name  = "/*coment*/ paul";
		String name2 = /*comentario */"Javier";
		/*String name3 = "comentaro multi"
				          linea */
		
		/*
		 * Comentarios multilinea
		 * pueden tener caracteres especiales
		 * */
		System.out.println("nombre: " + name);
		System.out.println("nombre2: " + name2);
	}

}
