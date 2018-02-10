
public class Direccion {
	private String id;
	private String calle;
	private String poblacion;
	private int CP;
	private Empresa empresa;

	public Direccion() {
	
	}
	
	public Direccion(String id, String calle, String poblacion, int cP) {
		super();
		this.id = id;
		this.calle = calle;
		this.poblacion = poblacion;
		CP = cP;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
