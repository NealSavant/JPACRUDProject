package com.skilldistillery.aquarium.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.aquarium.entities.Organism;

@Transactional
@Service
public class AquariumDAOImpl implements AquariumDAO {
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
	public void updateOrganism(Organism o, int id) {
//		String jpql = "UPDATE Organism o SET o.name = :bindName, o.type = :bindType, o.lifeSpan = :bindLifeSpan, o.color = :bindColor, o.gender = :bindGender WHERE o.id = :bindId";
//		em.createQuery(jpql, Organism.class).setParameter("bindName", o.getName()).setParameter("bindType", o.getType())
//				.setParameter("bindLifeSpan", o.getLifeSpan()).setParameter("bindColor", o.getColor())
//				.setParameter("bindGender", o.getGender()).setParameter("bindId", o.getId()).getResultList();
		String jpql = "SELECT o FROM Organism o WHERE o.id = :bindId";
		List<Organism> managedO = em.createQuery(jpql, Organism.class).setParameter("bindId", id).getResultList();
		managedO.get(0).setName(o.getName());
		managedO.get(0).setType(o.getType());
		managedO.get(0).setLifeSpan(o.getLifeSpan());
		managedO.get(0).setColor(o.getColor());
		managedO.get(0).setGender(o.getGender());
//		em.merge(managedO);
		em.flush();
		
		
	}

}
