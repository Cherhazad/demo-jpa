package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Region region1 = new Region();
		region1.setNom("Occitanie");
		
		//em.persist(region1); 
		
		// extraire une région
		
		region1 = em.find(Region.class, 2);
		if (region1 != null) {
			System.out.println(region1);
		}
		
		transaction.commit();
		em.close();
	

	}

}
