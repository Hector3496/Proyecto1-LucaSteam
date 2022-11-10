package gui;

import model.ListadoVideojuegosImpl;
import java.util.Scanner;


public class AbrirTienda {

	public static void abrir() {
		ListadoVideojuegosImpl listado = new ListadoVideojuegosImpl();
		datoelegidomenu(listado);
	}
	
	//Metodo para pedir un numero del menu y que te devuelva el numero
	int numeromenu;
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
				System.out.println("case1");
				listado.importarFichero("vgsales");
				break;
			case 2:
				
				//Llamamos al metodo que LISTE LOS DATOS DEL ARCHIVO
				//ListadoVideojuegosImpl aaa = new ListadoVideojuegosImpl();
				listado.mostrarListado();
				System.out.println("case2");
				break;
			case 3:
				
				//llamamos al metodo A�ADIR UN VIDEOJUEGO A LA LISTA (pero habria que comprobar cual es el ultimo dato )
				System.out.println("case3");
				
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
