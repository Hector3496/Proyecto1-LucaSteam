package datos;

import java.util.ArrayList;

import model.Genero;
import model.Plataforma;
import model.Videojuegos;
import utils.LecturaDatos;

public class Datos {

	public Datos() {
		// TODO Auto-generated constructor stub
	}

	//Metodo para leer el fichero a partir de introducirle un ArrayList
	public static void leerfichero(ArrayList<Videojuegos> Listaactual) {
	
		for(Videojuegos v:Listaactual) {
			System.out.println(v.toString());
			
		}
	}
	
	//Metodo apra dar de alta un nuevo videojuego dentro de un ArrayList
	public static void altaVidejuego(ArrayList<Videojuegos> Listaactual) {
		Videojuegos v = new Videojuegos();
		String num;
		if(Listaactual.isEmpty()) {
			v.setOrden("1");
		} else {
			num = (Listaactual.get(Listaactual.size()).getOrden());
			int n = Integer.parseInt(num);
			n++;
			String orden= Integer.toString(n);
			v.setOrden(orden);
		}
		v.setNombre(LecturaDatos.leerString("Introduzca nombre de videojuego:"));
		v.setYear(LecturaDatos.leerString("Introduce el año: "));
		String genero = LecturaDatos.leerString("Introduce el género: ");
		for(int i=0; i<Genero.values().length; i++) {
			String gen = Genero.values()[i].toString();
			if(gen.equals(genero)) {
				v.setGenero(Genero.values()[i]);
			}
		}
		String plataforma = LecturaDatos.leerString("Introduce la plataforma: ");
		for(int i=0; i<Plataforma.values().length; i++) {
			String pl = Plataforma.values()[i].toString();
			if(pl.equals(plataforma)) {
				v.setPlataforma(Plataforma.values()[i]);
			}
		}
		v.setEditor(LecturaDatos.leerString("Introduzca el editor: "));
		Listaactual.add(v);
	}
}
