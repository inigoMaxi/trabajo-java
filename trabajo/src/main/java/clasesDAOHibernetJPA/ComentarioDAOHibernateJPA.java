package clasesDAOHibernetJPA;

import clasesDAO.ComentarioDAO;
import modelo.Comentario;


public class ComentarioDAOHibernateJPA  extends GenericDAOHibernateJPA<Comentario> implements ComentarioDAO {

	public ComentarioDAOHibernateJPA() {
		super(Comentario.class);
	}
}
 
