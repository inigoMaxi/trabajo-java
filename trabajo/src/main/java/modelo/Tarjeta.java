package modelo;
import java.sql.Date;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarjeta")
public class Tarjeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	protected String nombre;
	@Column(name = "fechaAsignacion")
	protected Date fechaAsignacion;
	@Column(name = "fechaVencimiento")
	protected Date fechaVencimiento;
	@Column(name = "comentarios")
	protected ArrayList<Comentario> comentarios;
	@Column(name = "items")
	protected ArrayList<Item> items;
	@Column(name = "usuarios")
	protected ArrayList<Usuario> usuarios ;
	

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
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Tarjeta() {

	}
	
	
	

}
