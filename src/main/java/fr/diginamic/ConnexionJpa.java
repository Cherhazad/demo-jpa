package fr.diginamic;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Region region1 = new Region();
		region1.setNom("Occitanie");
		
		//em.persist(region1); 
		
		// extraire une région unique
		
		region1 = em.find(Region.class, 2);
		if (region1 != null) {
			System.out.println(region1);
		}
		
		//extraire une liste
		
		TypedQuery<Region> query = em.createQuery("select r from Region r", Region.class); // r est un alias comme en SQL, ici c'est du JPQL qui fonctionne en orienté objet et non SQL, le * n'est pas accepté, on le remplace par un alias créé arbitrairement
		List<Region> listesRegion =query.getResultList();
		
		for (Region r: listesRegion) {
			System.out.println(r);
		}
		
		transaction.commit();
		em.close();
	

	}

}
