package modelo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proyecto")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	protected String nombre;
	@Column(name = "fechaInicio")
	protected Date fechaInicio;
	@Column(name = "fechaFin")
	protected Date fechaFin;
	@Column(name = "usuarios")
	protected ArrayList<Usuario> usuarios;
	@Column(name = "listas")
	protected ArrayList<Lista> listas;
	

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
	
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Lista> getListas() {
		return listas;
	}
	public void setListas(ArrayList<Lista> listas) {
		this.listas = listas;
	}
	public Proyecto() {

	}
	
}
