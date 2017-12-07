package clasesDAOHibernetJPA;

import clasesDAO.ProyectoDAO;

import modelo.Proyecto;
import org.springframework.transaction.annotation.Transactional;


@Transactional

public class ProyectoDAOHibernateJPA  extends GenericDAOHibernateJPA<Proyecto> implements ProyectoDAO {

	public ProyectoDAOHibernateJPA() {
		super(Proyecto.class);
	}
}
 
