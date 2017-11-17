package clasesDAOHibernetJPA;

import clasesDAO.TarjetaDAO;
import modelo.Tarjeta;

public class TarjetaDAOHibernateJPA  extends GenericDAOHibernateJPA<Tarjeta> implements TarjetaDAO {

	public TarjetaDAOHibernateJPA() {
		super(Tarjeta.class);
	}
}
 
