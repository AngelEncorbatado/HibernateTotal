import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
@IdClass(Miembro.class)	
public class Grupo{
	
	/*@OneToOne
	@JoinColumn(name = "Miembro")
	@OneToMany(mappedBy="grupo.miembro")*/
	/* @Id
	    @ManyToOne
	    @JoinColumns({
	            @JoinColumn(referencedColumnName = "nombre"),
	             })*/
	
	/*@OneToMany(
		    cascade = CascadeType.ALL, 
		    orphanRemoval = true)*/
private String nombre;
private String estilo;
private List miembros = new ArrayList<Miembro>();


	public Grupo() {
		// TODO Auto-generated constructor stub
	}
	public Grupo(String nombre, String estilo, List miembros) {
		super();
		this.nombre = nombre;
		this.estilo = estilo;
		this.miembros = miembros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public List getMiembros() {
		return miembros;
	}
	public void setMiembros(List miembros) {
		this.miembros = miembros;
	}

}
