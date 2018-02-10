import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String cif;
	private String nombre;
	private int empleados;
	private String direccion;
	private List <Pedido> misPedidos = new ArrayList<Pedido>();
	private Direccion direccionObjeto;
	

	
	public Empresa(String cif, String nombre, int empleados, List<Pedido> misPedidos) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.empleados = empleados;		
		this.misPedidos = misPedidos;
		
		setDireccionObjeto(new Direccion());
	}

	public Empresa() {
		
	}

	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEmpleados() {
		return empleados;
	}
	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Pedido> getMisPedidos() {
		return misPedidos;
	}

	public void setMisPedidos(List<Pedido> misPedidos) {
		this.misPedidos = misPedidos;
	}
	
	public void addPedidos(Pedido pedido) {
		pedido.setEmpresa(this);
		this.misPedidos.add(pedido);
	}
	public void setDireccionObjeto(Direccion direccionObjeto) {
		this.direccionObjeto = direccionObjeto;
		direccionObjeto.setEmpresa(this);
	}
}
