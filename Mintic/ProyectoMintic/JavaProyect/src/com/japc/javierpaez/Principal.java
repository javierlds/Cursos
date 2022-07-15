package com.japc.javierpaez;
import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		Student s1 = new Student(123,"Javier Paez","999-99-9999",3.4);
		System.out.println(s1);
		Student s2 = new Student();
		s2.setStudentId(124);
		s2.setName("Adriana Arango");
		s2.setSsn("1234-4-598778");
		s2.setGpa(5.0);
		System.out.println(s2);
		Student s3 = new Student();
		System.out.println(s3);
		
		CasteoJava cast = new CasteoJava();
		UsoString uso = new UsoString();
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println(uso.concatenoCadenaUpper("Javier", "Augusto"));
		System.out.println(uso.longitudCadena("JAVIER AUGUSTO PAEZ CRUZ"));
		System.out.println(uso.extraeCaracteres("DIEGO FERNANDO PAEZ CRUZ", 8));
		uso.manejoMemoria();
		uso.concatenacionStrings();
		
		
		String cadena1, cadena2;
		System.out.println("Ingrese cadena 1");
		cadena1 = scan.nextLine();
		System.out.println("Ingrese cadena 2");
		cadena2 = scan.nextLine();
		
		uso.compararStrings(cadena1, cadena2);
		uso.comparaStringReferencia(cadena1, cadena2);
		uso.usoSubstring();
		System.out.println("Ingrese letra a buscar:");
		char car;
		car = scan.nextLine().charAt(0); // convirtiendo un String a caracter.
		uso.usoIndexOf(cadena1,car);
		uso.usoCharArt(cadena2, 4);*/
		System.out.println("Ingrese correo electronico");
		String correo;
		correo = scan.nextLine();
		System.out.println("El dominio es:" + uso.retornaDominio(correo));
		String s = "\\\\\\\\";
		System.out.println(s);
		
		
		// String name;
		// System.out.println("Impresion de nombre: " + name); // debe ser inicializada la variable el programa no compilara
		
	}
}
