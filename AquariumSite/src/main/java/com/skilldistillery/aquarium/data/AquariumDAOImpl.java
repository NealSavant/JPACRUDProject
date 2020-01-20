package com.skilldistillery.aquarium.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.aquarium.entities.Organism;

@Transactional
@Service
public class AquariumDAOImpl implements AquariumDAO{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Organism findById(int id) {
		return em.find(Organism.class, id);
	}

	@Override
	public List<Organism> findAll() {
		String jpql = "SELECT organism FROM Organism organism";
		List<Organism> organisms = em.createQuery(jpql, Organism.class).getResultList();
		return organisms;
	}

	@Override
	public void addOrganism(Organism o) {
		System.out.println("Begin adding new organism");
		em.persist(o);
		em.flush();
		System.out.println("Addition completed");
	}

	@Override
	public void deleteOrganism(Organism o) {
		System.out.println("Deleting " + o);
		em.remove(o);
		em.flush();
	}

	@Override
	public Organism updateOrganism(Organism o) {
		//TODO
		return null;
	}

}
