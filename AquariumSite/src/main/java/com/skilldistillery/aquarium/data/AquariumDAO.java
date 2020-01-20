package com.skilldistillery.aquarium.data;

import java.util.List;

import com.skilldistillery.aquarium.entities.Organism;

public interface AquariumDAO {
	Organism findById(int id);
	List<Organism> findAll();
	void addOrganism(Organism o);
	void deleteOrganism(Organism o);
	void updateOrganism(Organism o, int id);
}
