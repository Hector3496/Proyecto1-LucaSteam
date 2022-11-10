package gui;

import java.util.Scanner;

import model.ListadoVideojuegosImpl;

public class AbrirTienda {

	public static void abrir() {
		ListadoVideojuegosImpl listado = new ListadoVideojuegosImpl();
		listado.importarFichero("vgsales");
	}
	
	//Metodo para pedir un numero del menu y que te devuelva el numero
	int numeromenu;
	public void pedirdatomenu() {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce una opcion: ");
			int numeromenu=sc.nextInt();
			sc.close();
			System.out.println(numeromenu);
			this.numeromenu=numeromenu;
	}
	
	//Metodo recoje el numero y va a su CASE
	public void datoelegidomenu() {
		switch(numeromenu) {
		
		case 1:
			
			//llamaremos al metodo que IMPORTE EL ARCHIVO
			System.out.println("case1");
			break;
		case 2:
			
			//Llamamos al metodo que LISTE LOS DATOS DEL ARCHIVO
			System.out.println("case2");
			break;
		case 3:
			
			//llamamos al metodo AÑADIR UN VIDEOJUEGO A LA LISTA (pero habria que comprobar cual es el ultimo dato )
			System.out.println("case3");
			break;
		}
		
		
	}
}
