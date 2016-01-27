package persistence;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Util {

	public static void main(String[] args) {
		
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      System.out.println("Is opened connection :: "+ emfactory.createEntityManager().isOpen());
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Contact c = new Contact();
	      c.setEmail("yo@yo.com");
	      c.setFirstname("John");	      
	      c.setLastname("Smith");
	      c.setTelephone("12345");
	      
	      System.out.println("object created");
	      	      
	      entitymanager.persist( c );
	      entitymanager.getTransaction( ).commit( );

	      System.out.println("commited");
	      
	      entitymanager.close( );
	      emfactory.close( );
	      
	      System.out.println("done");

	}

}
