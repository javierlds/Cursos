/**
 * Esta clase muestra el uso de Strings
 * @author japaez
 * @version 1.0
 * */
package com.japc.javierpaez;
import java.util.Scanner;
public class UsoString {
	
	// String: si se intenta modificar un String , no se modifica se crea un nuevo objeto String
	
	public void usosStrings() {
		String string1 = "hello";
		String string2 = "Lisa";
		String string3 = "";
		string3 = "How are you ".concat(string2); //Concateno strings
		System.out.println("String3: " + string3);
		int lengthString;
		lengthString = string1.length();  // determinar longitud de la cadena
		System.out.println("Length string1: " + lengthString);
		System.out.println("Sub: " + string3.substring(0,5));  // Uso de substring
		System.out.println("Upper: " + string3.toUpperCase());
	}
	
	public String concatenoCadenaUpper(String cadena1, String cadena2) {
		return cadena1.concat(cadena2).toUpperCase();
	}
	
	public int longitudCadena(String cadena) {
		return cadena.length();
	}
	
	public String extraeCaracteres(String cadena,int cantidadCar) {
		String nuevaCadena;
		return nuevaCadena = cadena.substring(cantidadCar);
	}
	
	// ambas formas crean el mismo string
	public String creacionStrings(String cadena) {
		String s2 = cadena;
		String s1 = new String(cadena);
		return s1;
	}
	
	// dos diferentes variables apuntando al mismo objeto String
	public void manejoMemoria() {
		String name,name2;
		name = "Mya";
		name2 = name;
		System.out.println("name:" + name);
		System.out.println("name2: " + name2);
	}
	
	// Al utilizar Scanner, si se ingresa el mismo texto, se crean dos objetos diferentes por ende dos referencias de memoria diferentes.
	public void ingresoDatosString() {
		Scanner in = new Scanner(System.in);
		String name, name2;
		name = in.next();
		name2 = in.next();
		
		System.out.println("name: " + name);
		System.out.println("name2: " + name2);
	}
	
	// forma de concatenar un string.
	public void concatenacionStrings() {
		String s1 = "This is a";
		String s2 = "string";
		String s3 = s1 + s2;
		String s4 = "This is a" + s2;
		System.out.println(s1 += s2);  // a la variable s1 se le concatena la variable s2
		
	}
	
	// Comparando dos Strings con compareTO compara la cadena de caracteres, devuelve 0 si es igual
	public void compararStrings(String cadena1, String cadena2) {
		int compara = cadena1.compareTo(cadena2);
		if(compara == 0) {
			System.out.println("Las cadenas son iguales.");
		}
		else {
			System.out.println("Las cadenas son diferentes.");
		}
	}
	
	// comparando dos strings con Equals compara OBJETOS
	public void compararStringsEquals(String cadena1, String cadena2) {
		if(cadena1.equals(cadena2)) {
			System.out.println();
		}
	}
	
	// compara la referencia en memoria, solo sera true si los objetos a comparar estan apuntando a la misma referencia
	public void comparaStringReferencia(String cadena1, String cadena2) {
		String s1 = cadena1;
		String s2 = cadena2;
		String s3 = new String(cadena2);
		String s4 = s1;
		String s5 = "cadena";
		String s6 = "cadena";
		System.out.println("comparando referencias: " + s1 == s2);
		System.out.println("Comparando cadena s3: " + s3 == s4);
		System.out.println("Comparando s5 y s6: " + s5 == s6);
	}
	
	//Extrae una porcion de la cadena.
	public void usoSubstring() {
		String s1 = "JAVIER AUGUSTO PAEZ CRUZ";
		String s2 = "Especialista en desarrollo de bases de datos";
		System.out.println("Extrae desde el 6 caracter:" + s1.substring(6));
		System.out.println("Extrae desde la posicion 3 hasta la9 :" + s2.substring(3, 9));
	}

	// uso de index of devuelve el valor del indice de la primera ocurrencia encontrada
	public void usoIndexOf(String cadena, char car) {
		System.out.println("Ocurrencia caracter en la cadena:"+ cadena + "= "+ cadena.indexOf(car)); // Devuelve el valor del indice de la primera ocurrencia del caracter sobre el string
	}
	
	// devuelve el caracter String ubicado en el indice pasado
	public void usoCharArt(String cadena,int indice) {
		System.out.println("Uso charArt: " + cadena.charAt(indice));
	}
	
	/* Metodo que toma correo electronico, y devuelve el dominio de dicho correo*/
	public String retornaDominio(String email) {
		ValidaCorreo val = (String correo) -> {return correo.substring(correo.indexOf('@'));}; // Utilizando lambdas, implemento la interfaz 
		return val.cadena(email);
	}
	
	interface  ValidaCorreo{
		String cadena(String correo);
	}
	
}
