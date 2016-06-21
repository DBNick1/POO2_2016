package test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import datos.Medicion;

import negocio.ServicioMeteorologico;

public class OO2Test3Tema4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServicioMeteorologico sm = new ServicioMeteorologico();
		try {
			
			//Escenario 1
			Calendar fecha = new GregorianCalendar(2016,3,1);
			
			List<Medicion> lista = sm.traerMedicion(fecha);

			for (Medicion m : lista) {
					System.out.println("\n" + m.toString());
				}
			//Escenario 2
			sm.calcularRangoPrecipitacion(new GregorianCalendar(2016,
					02, 01), new GregorianCalendar(2016,
					03, 01));
			
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
