package clasesDAOHibernetJPA;

import clasesDAO.TarjetaDAO;

import modelo.Tarjeta;
import org.springframework.transaction.annotation.Transactional;


@Transactional

public class TarjetaDAOHibernateJPA  extends GenericDAOHibernateJPA<Tarjeta> implements TarjetaDAO {

	public TarjetaDAOHibernateJPA() {
		super(Tarjeta.class);
	}
}
 
