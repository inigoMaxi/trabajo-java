package clasesDAOHibernetJPA;

import org.springframework.transaction.annotation.Transactional;

import clasesDAO.UsuarioDAO;
import modelo.Usuario;
@Transactional
public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
}
