package br.com.fiap.smarthealth.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smarthealth.domain.Membro;

public class MembroDAO {

	EntityManager em = null;
	
	public void Insert(Membro membro) {
		
		try { 
			
			em = Persistence.createEntityManagerFactory("smart-health").createEntityManager();		
			
			em.persist(membro);
			em.getTransaction().begin();
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}
	
}
