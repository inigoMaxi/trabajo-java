package test;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import clasesDAO.TarjetaDAO;
import clasesDAOHibernetJPA.ComentarioDAOHibernateJPA;
import clasesDAOHibernetJPA.ItemDAOHibernateJPA;
import clasesDAOHibernetJPA.ListaDAOHibernateJPA;
import clasesDAOHibernetJPA.ProyectoDAOHibernateJPA;
import clasesDAOHibernetJPA.TarjetaDAOHibernateJPA;
import clasesDAOHibernetJPA.UsuarioDAOHibernateJPA;
import javassist.expr.NewArray;
import modelo.*;


public class testBD {
	
	public static void main(String[] args) {
		
		Usuario user = new Usuario("juan", "juancito"); //se crea un usario nuevo
		Usuario user2 = new Usuario("jose", "1234"); //se crea otro usario nuevo
		UsuarioDAOHibernateJPA userDao = new UsuarioDAOHibernateJPA();  
		ProyectoDAOHibernateJPA proyectoDao = new ProyectoDAOHibernateJPA(); 
		userDao.persistir(user); //se agrega user a la base de datos
		userDao.persistir(user2); //se agrega user2 a la base de datos
		user.setNombre("pedro"); //se modifica el nombre del usuario
	    
		userDao.actualizar(user); //se actualiza cambio en la base de datos
		long n = 1;  
		//Usuario user=userDao.recuperar(n);//se recupera un usuario de la base de datos
		//userDao.borrar(user3.getId()); //se lo elimina
		Date fechaI=new Date();
		Date fechaF=new Date();
		Proyecto proyecto = new Proyecto("proyecto de prueba", fechaI, fechaF); //se crea un proyecto 
		ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>(); //se crea un listado de proyectos
		proyectos.add(proyecto); //se agrega un proyecto al listado
		user.setProyectos(proyectos); //se agrega un nuevo listado de proyectos al user
		//userDao.actualizar(user);//se actualiza cambios en base de datos
		proyectoDao.persistir(proyecto); //se agrega proyecto a la base de datos
		// tarjeta //////////////////////////////////
		Tarjeta tarjeta1= new Tarjeta ( "En proceso",fechaI,fechaF);// se crea una tarjeta nueva
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); // se crea un listado de usuarios 
		usuarios.add(user); //se agrega un usuario a la lista de usuarios 
		tarjeta1.setUsuarios(usuarios);// cargo la lista de usuarios de la tarjeta
		ArrayList<Item> items = new ArrayList<Item>();
		Item item1= new Item("realizar bd","se debe realiar la base de datos",false);//se crea un item
		items.add(item1);//se agrega un item a la lista 
		tarjeta1.setItems(items);// se carga la lista de items a la tarjeta1
		ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
		Comentario comentario1= new Comentario(fechaI,"la base ya esta en proceso");
		comentarios.add(comentario1);
		tarjeta1.setComentarios(comentarios);
		TarjetaDAOHibernateJPA tarjetaDao = new TarjetaDAOHibernateJPA();
		//tarjetaDao.persistir(tarjeta1);
		//Item////////////////////////////////////////////
		Item item2= new Item("realizar bd","se debe realiar la base de datos",false);//se crea un item
		ItemDAOHibernateJPA itemDao = new ItemDAOHibernateJPA();
		//itemDao.persistir(item2);
		//// comentario
		Comentario comentario = new Comentario(fechaI,"un comentario");
		ComentarioDAOHibernateJPA comentarioDao = new ComentarioDAOHibernateJPA();
		//comentarioDao.persistir(comentario1);
		//lista///////////////////////////////////////////////
		Lista lista1 = new Lista( "listaproyecto ");
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
		lista1.setTarjetas(tarjetas);
		ListaDAOHibernateJPA listaDao = new ListaDAOHibernateJPA();
		listaDao.persistir(lista1);
	
	
	}

}
