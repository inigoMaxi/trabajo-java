package clasesDAOHibernetJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import clasesDAO.EMF;
import clasesDAO.GenericDAO;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {
	
	protected Class<T> persistentClass;
	
	public GenericDAOHibernateJPA(Class<T> c){
		this.persistentClass=c;
		
	}

	public T actualizar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		T entity1 = em.merge(entity);
		etx.commit();
		em.close();
		return entity1;
	}

	public void borrar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.merge(entity));
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}
	}

	@SuppressWarnings("unchecked")
	public T borrar(Serializable id) {
		T entity = EMF.getEMF().createEntityManager().find((Class<T>) this.getPersistentClass(), id);
		if (entity != null) {
			this.borrar(entity);
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	private T getPersistentClass() {
		return (T) persistentClass;
	}

	public boolean existe (Serializable id) {
		T entity= this.recuperar(id);
		return entity != null;
	} 

	public T persistir(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	public T recuperar(Serializable id) {
		T entity = EMF.getEMF().createEntityManager().find((Class<T>) this.getPersistentClass(), id);
		return entity;
	}

	@SuppressWarnings("unchecked")
	public List<T> recuperarTodos(String columnOrder) {
		Query consulta = EMF.getEMF().createEntityManager()
				.createQuery("select e from " + ((Class<T>) getPersistentClass()).getSimpleName() + " e order by e." + columnOrder);
		List<T> resultado = (List<T>) consulta.getResultList();
		return resultado;
	}

}
