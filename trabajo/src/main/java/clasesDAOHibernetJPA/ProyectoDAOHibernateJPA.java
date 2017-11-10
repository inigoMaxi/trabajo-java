package clasesDAOHibernetJPA;

import clasesDAO.ProyectoDAO;
import modelo.Proyecto;

public class ProyectoDAOHibernateJPA  extends GenericDAOHibernateJPA<Proyecto> implements ProyectoDAO {

	public ProyectoDAOHibernateJPA() {
		super(Proyecto.class);
	}
}
 
