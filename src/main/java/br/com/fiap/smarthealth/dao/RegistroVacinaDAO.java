package br.com.fiap.smarthealth.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smarthealth.domain.RegistroVacina;

public class RegistroVacinaDAO {

	EntityManager em = null;
	
	public void Insert(RegistroVacina registroVacina) {
		
		try { 
			
			em = Persistence.createEntityManagerFactory("smart-health").createEntityManager();		
			
			em.persist(registroVacina);
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
