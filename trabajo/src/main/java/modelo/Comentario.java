package modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comentario") 
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fechaHora")
	protected Date fechaHora;
	@Column(name = "texto")
	protected String texto;

	
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Comentario() {
		
	}
	
	public Comentario(Date fechaHora, String texto) {
		this.fechaHora = fechaHora;
		this.texto = texto;
	}
	
	
	
	
	

}
