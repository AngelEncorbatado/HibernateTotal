
public class Festival {
	private String nombre;
	private String lugar;
	private String fecha;
	public Festival() {
		// TODO Auto-generated constructor stub
	}
	public Festival(String nombre, String lugar, String fecha) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
