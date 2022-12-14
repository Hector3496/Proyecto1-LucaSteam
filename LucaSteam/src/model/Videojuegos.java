package model;

import java.util.Objects;


//Clase que construye el objeto videojuego para introducirlo en nuestro ArrayList
public class Videojuegos {
	
	//atributos
	private String orden;
	private String nombre;
	private String year;
	private Genero genero;
	private Plataforma plataforma;
	private String editor;
	
	public Videojuegos() {
		
	}

	public Videojuegos(String nombre, String year) {
		this.nombre = nombre;
		this.year = year;
	}

	public Videojuegos(String nombre, String year, Genero genero, Plataforma plataforma) {
		this.nombre = nombre;
		this.year = year;
		this.genero = genero;
		this.plataforma = plataforma;
	}

	public Videojuegos(String orden, String nombre, String year, Genero genero, Plataforma plataforma) {
		super();
		this.orden = orden;
		this.nombre = nombre;
		this.year = year;
		this.genero = genero;
		this.plataforma = plataforma;
	}

	public Videojuegos(String orden, String nombre, String year, Genero genero, Plataforma plataforma, String editor) {
		super();
		this.orden = orden;
		this.nombre = nombre;
		this.year = year;
		this.genero = genero;
		this.plataforma = plataforma;
		this.editor = editor;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nombre, plataforma, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Videojuegos other = (Videojuegos) obj;
		return genero == other.genero && Objects.equals(nombre, other.nombre) && plataforma == other.plataforma
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "Videojuegos [orden=" + orden + ", nombre=" + nombre + ", year=" + year + ", genero=" + genero
				+ ", plataforma=" + plataforma + ", editor=" + editor + "]";
	}
	
}