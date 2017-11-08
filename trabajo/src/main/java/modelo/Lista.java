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
@Table(name="lista")
public class Lista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	protected String nombre ;
	@Column(name = "tarjetas")
	protected ArrayList<Tarjeta> tarjetas;
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	public Lista() {

	}
	
}
