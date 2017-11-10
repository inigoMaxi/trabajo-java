package modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proyecto_id")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fechaInicio")
	private Date fechaInicio;
	@Column(name = "fechaFin")
	private Date fechaFin;
	@Column(name = "usuarios")
	@ManyToMany(mappedBy = "proyectos")
	private List<Usuario> usuarios;
	@Column(name = "listas")
	@OneToMany
	private List<Lista> listas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Lista> getListas() {
		return listas;
	}

	public void setListas(List<Lista> listas) {
		this.listas = listas;
	}

	public Proyecto(String nombre, Date fechaInicio, Date fechaFin) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Proyecto() {
		
	}

}
