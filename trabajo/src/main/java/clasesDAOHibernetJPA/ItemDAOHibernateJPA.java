package clasesDAOHibernetJPA;

import clasesDAO.ItemDAO;
import modelo.Item;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class ItemDAOHibernateJPA  extends GenericDAOHibernateJPA<Item> implements ItemDAO {

	public ItemDAOHibernateJPA() {
		super(Item.class);
	}
}
 
