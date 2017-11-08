package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class testBD {

	private static EntityManagerFactory emf;
	private static EntityManager manager;
	
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("conexion");
		manager = emf.createEntityManager();
		Usuario u = new Usuario("juan","pepe");
		manager.getTransaction().begin();
		manager.persist(u);
		manager.getTransaction().commit();
	}

}
