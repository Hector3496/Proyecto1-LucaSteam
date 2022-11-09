package control;

import datos.RecursosHumanosImpl;
import gui.Pantallas;
import model.Persona;
import service.EmpresaService;
import service.EmpresaServiceImpl;
public class Empresa {

	public void inicicar() {
		boolean sigo= true;
		do {
			Pantallas.pantalla01();
			sigo = elegirOpcion();
			
		}while(sigo);
	}
	private EmpresaService empresaService = new EmpresaServiceImpl();
	
	private RecursosHumanosImpl personal = new RecursosHumanosImpl();
	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	private EmpresaServiceImpl empresaServiceImpl = new EmpresaServiceImpl();
	public void iniciar() {
		
		empresaService.altaPersona();
		empresaService.darEmpleadoMes();
		
		//Quiero saber el empleado del mes
		
		
		
	}
	
	public boolean elegirOpcion() {
		boolean sigo = true;
		//Pedir datos
		//Si eliges 1
		empresaService.altaPersona();
		//Si eleges 2
		empresaService.darEmpleadoMes();
		//Si eliges 3
		empresaService.listaEmpleados();
		
		 sigo = false;
		 
		 return sigo;
	}

}
