package utils;

import java.util.Scanner;

//Clase para metodos que introduce datos por consola y los devuelve, 
//el metodo a utilizar dependera de si es Integer o String
public class LecturaDatos {

	public static int leerInt(String msg) {
		System.out.println(msg);
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		return n;
	}
	
	public static String leerString(String msg) {
		System.out.println(msg);
		Scanner entrada = new Scanner(System.in);
		String n = entrada.nextLine();
		return n;
	}
}
