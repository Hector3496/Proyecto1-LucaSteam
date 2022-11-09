package datos;

import java.util.ArrayList;


import java.util.List;

import model.Persona;

public class RecursosHumanosImpl implements RecursosHumanos {

	List empleados = new ArrayList();
	@Override
	public String toString() {
		return "RecursosHumanos [empleados=" + empleados + "]";
	}
	public List getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List empleados) {
		this.empleados = empleados;
	}
	public RecursosHumanosImpl() {
		// TODO Auto-generated constructor stub
		
	}
	
	//Metodos especiales
	
	public void altaPersona(Persona p) {
		empleados.add(p);
	}
	
	public void informePersona() {
		System.out.println(empleados);
	}

}
