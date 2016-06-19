package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.EstacionMeteorologicaDao;
import dao.MedicionDao;
import dao.ProvinciaDao;
import datos.EstacionMeteorologica;
import datos.Medicion;
import datos.Provincia;
import datos.Rango;

public class ServicioMeteorologico {
	MedicionDao dao = new MedicionDao();
	EstacionMeteorologicaDao daoE = new EstacionMeteorologicaDao();
	ProvinciaDao daoP = new ProvinciaDao();

	public Provincia traerProvincia(int idProvincia) throws Exception {

		Provincia p = daoP.traerProvincia(idProvincia);

		if (p == null) {
			throw new Exception("No existe Provincia con ese id");
		}
		return p;
	}

	public EstacionMeteorologica traerEstacionMeteorologica(
			int idEstacionMeteorologica) throws Exception {

		EstacionMeteorologica e = daoE.traerEstacionMeteorologica(idEstacionMeteorologica);

		if (e == null)
			throw new Exception("No existe estacion con ese id");
		return e;
	}

	public Medicion traerMedicion(int idMedicion) throws Exception {

		Medicion m = dao.traerMedicion(idMedicion);

		if (m == null)
			throw new Exception("No se encontraron mediciones");
		return m;
	}

	public List<Medicion> traerMedicion(Provincia provincia,
			GregorianCalendar fechaInicial, GregorianCalendar fechaFinal)
			throws Exception {

		List<Medicion> m = dao.traerMedicion(provincia, fechaInicial,
				fechaFinal);

		if (m == null)
			throw new Exception("No se encontraron mediciones");
		return m;
	}

	public List<Medicion> traerMedicion(Provincia provincia,
			GregorianCalendar fecha) throws Exception {

		List<Medicion> m = dao.traerMedicion(provincia, fecha);

		if (m == null)
			throw new Exception("No se encontraron mediciones");
		return m;
	}

	public List<Medicion> traerMedicion(GregorianCalendar fecha)
			throws Exception {

		List<Medicion> m = dao.traerMedicion(fecha);

		if (m == null)
			throw new Exception("No se encontraron mediciones");
		return m;
	}

	public Rango calcularRangoPresion(Provincia provincia,
			GregorianCalendar fechaInicial, GregorianCalendar fechaFinal)
			throws Exception {
		Rango rango = new Rango();

		return rango;
	}

	public Rango calcularRangoPresionCorregida(Provincia provincia,
			GregorianCalendar fechaInicial, GregorianCalendar fechaFinal)
			throws Exception {
		Rango rango = new Rango();

		return rango;
	}

	public Rango calcularRangoPrecipitacion(GregorianCalendar fechaInicial,
			GregorianCalendar fechaFinal) throws Exception {
		Rango rango = new Rango();

		return rango;
	}

}
