package clasesDAO;

import clasesDAOHibernetJPA.*;


public class FactoryDAO {
	
	public static UsuarioDAO getUsuarioDao() {
		return new UsuarioDAOHibernateJPA();
	}
	
	public static ProyectoDAO getProyectoDao() {
		return new ProyectoDAOHibernateJPA();
	}
	
	public static TarjetaDAO getTarjetaDao() {
		return new TarjetaDAOHibernateJPA();
	}
	
	public static ItemDAO getItemDao() {
		return new ItemDAOHibernateJPA();
	}
    
	public static ComentarioDAO getComentarioDao() {
		return new ComentarioDAOHibernateJPA();
	}
	
	public static ListaDAO getListaDao() {
		return new ListaDAOHibernateJPA();
	}
}

