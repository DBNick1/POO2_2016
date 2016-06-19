package test;

import negocio.ServicioMeteorologico;

public class OO2Test1Tema3 {
	
	public static void main(String[] args) {
		
		ServicioMeteorologico sm= new ServicioMeteorologico();
		
		int id = 7;
		int idM = 10;
		int idE = 47;
		try{
		System.out.println(""+sm.traerProvincia(id));
		
		System.out.println(""+sm.traerMedicion(idM));
		
		System.out.println(""+sm.traerEstacionMeteorologica(idE));
		
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());}
		
	}

}
