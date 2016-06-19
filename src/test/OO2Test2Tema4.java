package test;

import java.util.GregorianCalendar;

import negocio.ServicioMeteorologico;

public class OO2Test2Tema4 {

	public static void main(String[] args) {
		ServicioMeteorologico sm = new ServicioMeteorologico();
		try {
			//Escenario 1
			sm.traerMedicion(sm.traerProvincia(1), new GregorianCalendar(2016,02,01));
			//Escenario 2
			sm.calcularRangoPresion(sm.traerProvincia(1), new GregorianCalendar(2016,02,25),new GregorianCalendar(2016,03,05));
			//Escenario 3
			sm.calcularRangoPresionCorregida(sm.traerProvincia(1),new GregorianCalendar(2016,02,25),new GregorianCalendar(2016,03,05));
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
