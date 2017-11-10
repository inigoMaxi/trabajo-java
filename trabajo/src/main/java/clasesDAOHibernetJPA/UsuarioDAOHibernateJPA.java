package clasesDAOHibernetJPA;

import clasesDAO.UsuarioDAO;
import modelo.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
}
