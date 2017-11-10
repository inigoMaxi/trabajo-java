package test;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import clasesDAOHibernetJPA.ProyectoDAOHibernateJPA;
import clasesDAOHibernetJPA.UsuarioDAOHibernateJPA;
import javassist.expr.NewArray;
import modelo.Proyecto;
import modelo.Usuario;

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
		Usuario user3=userDao.recuperar(n);//se recupera un usuario de la base de datos
		userDao.borrar(user3.getId()); //se lo elimina
		Date fechaI=new Date();
		Date fechaF=new Date();
		Proyecto proyecto = new Proyecto("proyecto de prueba", fechaI, fechaF); //se crea un proyecto 
		ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>(); //se crea un listado de proyectos
		proyectos.add(proyecto); //se agrega un proyecto al listado
		proyectoDao.persistir(proyecto); //se agrega proyecto a la base de datos
		user.setProyectos(proyectos); //se agrega un nuevo listado de proyectos al user
		userDao.actualizar(user);//se actualiza cambios en base de datos
	}

}
