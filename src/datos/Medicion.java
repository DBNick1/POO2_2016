package datos;

import java.util.GregorianCalendar;

import funciones.Funciones;

public class Medicion {
	
	  
	private int idMedicion;
	private GregorianCalendar fecha;
	private float presion;
	private float temperatura;
	private float humedad;
	private float precipitacion;
	private float velocidadViento;
	private String direccionViento;
	private EstacionMeteorologica estacion;
	private Provincia provincia;
	
	public Medicion()
	{
	}
	
	public Medicion(GregorianCalendar fecha, float presion, float temperatura, float humedad,
			float precipitacion, float velocidadViento, String direccionViento, EstacionMeteorologica estacion,
			Provincia provincia) {
		super();
		this.fecha = fecha;
		this.presion = presion;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.precipitacion = precipitacion;
		this.velocidadViento = velocidadViento;
		this.direccionViento = direccionViento;
		this.estacion = estacion;
		this.provincia = provincia;
	}

	public int getIdMedicion() {
		return idMedicion;
	}

	protected void setIdMedicion(int idMedicion) {
		this.idMedicion = idMedicion;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public float getPresion() {
		return presion;
	}

	public void setPresion(float presion) {
		this.presion = presion;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getHumedad() {
		return humedad;
	}

	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}

	public float getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}

	public float getVelocidadViento() {
		return velocidadViento;
	}

	public void setVelocidadViento(float velocidadViento) {
		this.velocidadViento = velocidadViento;
	}

	public String getDireccionViento() {
		return direccionViento;
	}

	public void setDireccionViento(String direccionViento) {
		this.direccionViento = direccionViento;
	}

	public EstacionMeteorologica getEstacion() {
		return estacion;
	}

	public void setEstacion(EstacionMeteorologica estacion) {
		this.estacion = estacion;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	public String toString()
	{
		return "Medicion: "+Funciones.traerFechaCorta(fecha);
	}


}
