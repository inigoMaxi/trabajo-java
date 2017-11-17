package modelo;



import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tarjeta_id")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fechaAsignacion")
	private Date fechaAsignacion;
	@Column(name = "fechaVencimiento")
	private Date fechaVencimiento;
	@Column(name = "comentarios")
	@OneToMany
	private List<Comentario> comentarios;
	@Column(name = "items")
	@OneToMany
	private List<Item> items;
	@Column(name = "usuarios")
	@ManyToMany(mappedBy = "tarjetas")
	private List<Usuario> usuarios;

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

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Tarjeta() {

	}

	public Tarjeta( String nombre, Date fechaAsignacion, Date fechaVencimiento) {
		super();
		
		this.nombre = nombre;
		this.fechaAsignacion = fechaAsignacion;
		this.fechaVencimiento = fechaVencimiento;
		
	}

}
