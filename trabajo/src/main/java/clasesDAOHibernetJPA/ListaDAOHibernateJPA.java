package clasesDAOHibernetJPA;

import clasesDAO.ListaDAO;
import modelo.Lista;

public class ListaDAOHibernateJPA  extends GenericDAOHibernateJPA<Lista> implements ListaDAO {

	public ListaDAOHibernateJPA() {
		super(Lista.class);
	}
}
 
