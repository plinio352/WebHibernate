package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControleDao extends DAO {
	private EntityManager em;

	public void salvar(Padrao p){
		em = getEntityManager().createEntityManager();
		try{
			if(!em.getTransaction().isActive()){
				System.out.println("Ativo");
				em.getTransaction().begin();
				
			}
			
			em.persist(p);
			em.getTransaction().commit();
			em.close();
		}catch (Exception e) {
			System.out.println("PPS: " + e.getMessage());
			em.getTransaction().rollback();
			em.close();
		}
	}
	
	public List<Padrao> exibir(String sql){
		em = getEntityManager().createEntityManager();
		try{
			Query q = em.createQuery(sql);
			return q.getResultList();
			
		} finally{
			em.close();
		}

	}

}
