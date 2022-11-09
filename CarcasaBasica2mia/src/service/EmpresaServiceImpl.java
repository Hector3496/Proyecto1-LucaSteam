package service;

import datos.RecursosHumanosImpl;
import model.Persona;

public class EmpresaServiceImpl implements EmpresaService {
	
	private RecursosHumanosImpl personal = new RecursosHumanosImpl();
	public void altaPersona() {
		Persona p1 = new Persona("Antonio",30);
		personal.altaPersona(p1);
		personal.informePersona();
	}

	public EmpresaServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public void darEmpleadoMes() {
		//Pedir informe de empleados
		//Pedir objetivo del mer
		//Calcular merjor ratio empleado/objetivos
	}
	
	
	public void listaEmpleados() {
		personal.informePersona();
	}
}
