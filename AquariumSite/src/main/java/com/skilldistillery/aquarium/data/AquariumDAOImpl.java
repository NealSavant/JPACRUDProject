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

}
