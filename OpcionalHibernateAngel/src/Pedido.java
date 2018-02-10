import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int id;
	private String fecha;	
	private Empresa empresa;
	
	public Pedido() {
		
	}
	
	public Pedido(int id, String fecha) {
		this.id = id;
		this.fecha = fecha;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
}
