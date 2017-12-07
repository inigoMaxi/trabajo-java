package clasesDAOHibernetJPA;

import clasesDAO.ComentarioDAO;

import modelo.Comentario;
import org.springframework.transaction.annotation.Transactional;


@Transactional


public class ComentarioDAOHibernateJPA  extends GenericDAOHibernateJPA<Comentario> implements ComentarioDAO {

	public ComentarioDAOHibernateJPA() {
		super(Comentario.class);
	}
}
 
