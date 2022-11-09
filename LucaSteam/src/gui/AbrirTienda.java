package gui;

import model.ListadoVideojuegosImpl;

public class AbrirTienda {

	public static void abrir() {
		ListadoVideojuegosImpl listado = new ListadoVideojuegosImpl();
		listado.importarFichero("vgsales");
	}
}
