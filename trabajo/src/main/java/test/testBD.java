package test;

import java.util.*;
import clasesDAOHibernetJPA.*;
import modelo.*;


public class testBD {
	
	public static void main(String[] args) {
		
		Date fechaI=new Date();
		Date fechaF=new Date();
		
		//modelos
		Usuario user1 = new Usuario("juan", "juancito"); //se crea un usario nuevo
		Tarjeta tarjeta1= new Tarjeta ( "En proceso",fechaI,fechaF);// se crea una tarjeta nueva
		Proyecto proyecto1 = new Proyecto("proyecto de prueba", fechaI, fechaF); //se crea un proyecto 
		Lista lista1 = new Lista( "listaproyecto ");
		Item item1= new Item("realizar bd","se debe realiar la base de datos",false);//se crea un item
		Comentario comentario1= new Comentario(fechaI,"la base ya esta en proceso");// se crea un comentario
		
		//listas de modelos
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); // se crea un listado de usuarios 
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
		ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>(); //se crea un listado de proyectos
		ArrayList<Item> items = new ArrayList<Item>();// se crea un listado de items
		ArrayList<Comentario> comentarios = new ArrayList<Comentario>();//se crea un listado de comentarios 
		ArrayList<Lista> listas = new ArrayList<Lista>();//se crea un listado de listas
		
		//carga de listas de modelos
		usuarios.add(user1); //se agrega un usuario a la lista de usuarios 
		tarjetas.add(tarjeta1); // se agrega una tarjeta a la lista de tarjetas 
		proyectos.add(proyecto1); //se agrega un proyecto a la lista de proyectos
		items.add(item1);//se agrega un item a la lista de items
		comentarios.add(comentario1);// se agrega un comentario a la lista de comentarios;
		listas.add(lista1);//se agrega una lista al listado de listas 
		
		//clases DAO
		UsuarioDAOHibernateJPA userDao = new UsuarioDAOHibernateJPA(); //se crea un usuario dao
		TarjetaDAOHibernateJPA tarjetaDao = new TarjetaDAOHibernateJPA();//se crea una tarjeta dao
		ProyectoDAOHibernateJPA proyectoDao = new ProyectoDAOHibernateJPA(); //se crea un proyecto dao
		ListaDAOHibernateJPA listaDao = new ListaDAOHibernateJPA();//se crea una lista dao
		ItemDAOHibernateJPA itemDao = new ItemDAOHibernateJPA();//se crea un item  dao
		ComentarioDAOHibernateJPA comentarioDao = new ComentarioDAOHibernateJPA();//se crea un comentario dao

		//persistencia de clases a la base de datos
		userDao.persistir(user1); //se agrega un usuario a la base de datos
		tarjetaDao.persistir(tarjeta1);//se agrega una tarjeta a la base de datos
		proyectoDao.persistir(proyecto1); //se agrega un proyecto a la base de datos
		listaDao.persistir(lista1);//se agrega una lista a la base de datos
		itemDao.persistir(item1);//se agrega un item a la base de datos 
		comentarioDao.persistir(comentario1);//se agrega un comentario a la base de datos 
		
		//relaciones entre modelos
		  user1.setProyectos(proyectos);//se agrega un nuevo listado de proyectos al usuario
		  user1.setTarjetas(tarjetas);//se agrega un nuevo listado de tarjetas al usuario
		  tarjeta1.setUsuarios(usuarios);// se agrega un nuevo listado de usuarios a la tarjeta 
		  tarjeta1.setComentarios(comentarios);//se agrega un nuevo listado de comentarios a la tarjeta
		  tarjeta1.setItems(items);//se agrega un nuevo listado de items a la tarjeta 
		  tarjeta1.setUsuarios(usuarios);
		  proyecto1.setListas(listas);//se agrega un nuevo listado de listas a la tarjeta 
		  proyecto1.setUsuarios(usuarios);//se agrega un nuevo listado de usuarios al proyecto
		  lista1.setTarjetas(tarjetas);//se agrega un nuevo listado de tarjetas a la lista  
		  
		  //persistir relaciones a la base de datos 
	      userDao.actualizar(user1); //se actualiza cambio en la base de datos
	      tarjetaDao.actualizar(tarjeta1);//se actualiza el cambio en la base de datos
	      proyectoDao.actualizar(proyecto1);//se actualiza el cambio en la base de datos
	      listaDao.actualizar(lista1);//se actualiza el cambio en la base de datos
		  itemDao.actualizar(item1);//se actualiza el cambio en la base de datos 
		  comentarioDao.actualizar(comentario1);//se actualiza el cambio en la base de datos
	
  }
}
