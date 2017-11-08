package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	protected String nombre;
	@Column(name = "contraseña")
	protected String contraseña;
	@Column(name = "proyecto")
	protected ArrayList<Proyecto> proyectos;
	@Column(name = "tarjetas")
	protected ArrayList<Tarjeta> tarjetas;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	
	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(ArrayList<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	public ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	public Usuario() {

	}
	public Usuario(String nombre, String contraseña) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.proyectos = new ArrayList<Proyecto>(null);
		this.tarjetas = new ArrayList<Tarjeta>(null);
	}
	
	
	
}
