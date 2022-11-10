package model;
/**
 * @author Hector
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import datos.Datos;

public class ListadoVideojuegosImpl{
	
	public static ArrayList<Videojuegos> videojuegos;
	
	public ListadoVideojuegosImpl() {
		this.videojuegos = new ArrayList<>();
	}
	
	public ListadoVideojuegosImpl(ArrayList<Videojuegos> listado) {
		this.videojuegos = listado;
	}
	
	public ArrayList<Videojuegos> getVideojuegos() {
		return videojuegos;
	}


	public void setVideojuegos(ArrayList<Videojuegos> videojuegos) {
		this.videojuegos = videojuegos;
	}

	public void importarFichero(String name) {
		File fich1 = new File(name + ".csv");
		BufferedReader br = null;
		String line = null;
		if(fich1.exists()) {
			try {
				br = new BufferedReader(new FileReader(fich1));
				recorrerFichero(line, br);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(null != br) {
						br.close();
					}
				} catch(Exception c) {
					c.printStackTrace();
				}
			}
		}
		System.out.println("Ha importado el fichero " + name);
	}
	public void recorrerFichero(String line, BufferedReader br) throws IOException {
		
		line = br.readLine();
		line = br.readLine();
		//-------------------
		while(line != null) {
			Videojuegos v1 = new Videojuegos();
			String[] list = line.split(",");
			String num;
			if(videojuegos.isEmpty()) {
				v1.setOrden(list[0]);
			} else {
				num = list[0];
				int n = Integer.parseInt(num);
				n++;
				String orden= Integer.toString(n);
				v1.setOrden(orden);
			}
			v1.setNombre(list[1]);
			for(int i=0; i<Plataforma.values().length; i++) {
				String pl = Plataforma.values()[i].toString();
				if(pl.equals(list[2])) {
					v1.setPlataforma(Plataforma.values()[i]);
				}
			}
			v1.setYear(list[3]);
			for(int i=0; i<Genero.values().length; i++) {
				String gen = Genero.values()[i].toString();
				if(gen.equals(list[4])) {
					v1.setGenero(Genero.values()[i]);
				}
			}
			v1.setEditor(list[5]);
			line = br.readLine();
			this.videojuegos.add(v1);
		}
	}
	public static void mostrarListado() {
		Datos.leerfichero(videojuegos);
	}
	public static void altaVideojuego() {
		Datos.altaVidejuego(videojuegos);
	}
	
}
