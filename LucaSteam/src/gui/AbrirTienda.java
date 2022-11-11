package gui;

import model.ListadoVideojuegosImpl;
import java.util.Scanner;


public class AbrirTienda {

	//Metodo para implementr el ArrayList de videojuegos creando objetos
	public static void abrir() {
		ListadoVideojuegosImpl listado = new ListadoVideojuegosImpl();
		datoelegidomenu(listado);
	}
	
	//Metodo para pedir un numero del menu y que te devuelva el numero
	int numeromenu;
	
	//Metodo para imprimir el mennu en consola, mostrando las opciones
	public static int pedirdatomenu() {
		
		try {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una opcion: ");
		System.out.println("1. Importar fichero");
		System.out.println("2. Leer fichero");
		System.out.println("3. Añadir videojuego");
		System.out.println("4. Salir");
		
		int numeromenu=sc.nextInt();
		//sc.close();
		System.out.println(numeromenu);
		return numeromenu;
		} catch (Exception e) {
			
			return -1;
		}
	}
	
	//Metodo recoje el numero y va a su CASE
	public static void datoelegidomenu(ListadoVideojuegosImpl listado) {
		boolean salir = true;
		do {
			int numeromenu = pedirdatomenu();
			switch(numeromenu) {
			
			case 1:
				//llamaremos al metodo que IMPORTE EL ARCHIVO
				listado.importarFichero("vgsales");
				break;
			case 2:
				//Llamamos al metodo que LISTE LOS DATOS DEL ARCHIVO
				//ListadoVideojuegosImpl aaa = new ListadoVideojuegosImpl();
				listado.mostrarListado();
				System.out.println("Listado mostrado!");
				break;
			case 3:
				//llamamos al metodo A�ADIR UN VIDEOJUEGO A LA LISTA (pero habria que comprobar cual es el ultimo dato )
				listado.altaVideojuego();
				System.out.println("Ha introducido un nuevo videojuego!");
				break;
				
			case 4:
				salir = false;
				break;
				
			case -1:
				System.out.println("El dato no es correcto");
				break;
				
			default: System.out.println("El número no es correcto");
			}
		} while(salir);
				
	}
}
