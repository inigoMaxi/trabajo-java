package clasesDAOHibernetJPA;

import clasesDAO.ItemDAO;
import modelo.Item;

public class ItemDAOHibernateJPA  extends GenericDAOHibernateJPA<Item> implements ItemDAO {

	public ItemDAOHibernateJPA() {
		super(Item.class);
	}
}
 
