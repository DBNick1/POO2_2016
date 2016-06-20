package datos;

public class EstacionMeteorologica {
	
	 private int idEstacionMeteorologica;
	 private String estacionMeteorologica;
	 private int altura;
	 
	 
	public EstacionMeteorologica()
	{}
	 
	public EstacionMeteorologica(String estacionMeteorologica, int altura) {
		super();
		this.estacionMeteorologica = estacionMeteorologica;
		this.altura = altura;
	}

	public int getIdEstacionMeteorologica() {
		return idEstacionMeteorologica;
	}

	protected void setIdEstacionMeteorologica(int idEstacionMeteorologica) {
		this.idEstacionMeteorologica = idEstacionMeteorologica;
	}

	public String getEstacionMeteorologica() {
		return estacionMeteorologica;
	}

	public void setEstacionMeteorologica(String estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "EstacionMeteorologica "
				+ estacionMeteorologica + ", altura=" + altura + "msnm";
	}
	
	 
	 

}
