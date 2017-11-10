package clasesDAO;

import clasesDAOHibernetJPA.ProyectoDAOHibernateJPA;
import clasesDAOHibernetJPA.UsuarioDAOHibernateJPA;

public class FactoryDAO {
	
	public static UsuarioDAO getUsuarioDao() {
		return new UsuarioDAOHibernateJPA();
	}
	
	public static ProyectoDAO getProyectoDao() {
		return new ProyectoDAOHibernateJPA();
	}

}

