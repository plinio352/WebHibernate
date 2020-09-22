package principal;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	
	private static EntityManagerFactory emf = null;

	public EntityManagerFactory getEntityManager(){
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("mysql");
			//emf = Persistence.createEntityManagerFactory("sqlserver");
		}
		
		return emf;
	}
	
	public DAO() {
		
	}
}
