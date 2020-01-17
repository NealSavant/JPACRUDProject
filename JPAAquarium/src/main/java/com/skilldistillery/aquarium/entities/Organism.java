package com.skilldistillery.aquarium.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//class name matches table name in db

@Entity
public class Organism {

	// F I E L D S
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;

	// C O N S T R U C T O R
	public Organism(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Organism() {

	}

	// G E T T E R S / S E T T E R S
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aquarium [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}

}
