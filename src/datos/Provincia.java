package datos;

public class Provincia {
	
	private int idProvincia;
    private String provincia;
    
    public Provincia()
    {}
    
	public Provincia(String provincia) {
		super();
		this.provincia = provincia;
	}
	
	public int getIdProvincia() {
		return idProvincia;
	}
	protected void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String toString()
	{
		return("Provincia de "+provincia);
	}
	  

}
