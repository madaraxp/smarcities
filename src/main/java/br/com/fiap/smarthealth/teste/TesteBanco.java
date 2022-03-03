package br.com.fiap.smarthealth.teste;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smarthealth.domain.Medico;

public class TesteBanco {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("smart-health").createEntityManager();
		
		em.getTransaction().begin();

		Medico med = new Medico(1, "William", "45086023807", "SP", "SP", "12312312", "12312321", "SP", "40156456", LocalDate.of(1995, 4, 9));
		
		em.persist(med);
		
		em.getTransaction().commit();
		
		em.close();
	}

}
