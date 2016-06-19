package test;

import java.util.GregorianCalendar;

import negocio.ServicioMeteorologico;

public class OO2Test3Tema4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServicioMeteorologico sm = new ServicioMeteorologico();
		try {
			
			//Escenario 1
			sm.traerMedicion(new GregorianCalendar(2016,
					03, 01));
			//Escenario 2
			sm.calcularRangoPrecipitacion(new GregorianCalendar(2016,
					02, 01), new GregorianCalendar(2016,
					03, 01));
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
