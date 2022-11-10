package datos;

import java.util.ArrayList;

import model.ListadoVideojuegosImpl;
import model.Videojuegos;

public class Datos {

	public Datos() {
		// TODO Auto-generated constructor stub
	}

	public static void leerfichero(ArrayList<Videojuegos> Listaactual) {
	
		for(Videojuegos v:Listaactual) {
			System.out.println(v.toString());
			
		}
		
		
	}
}
