package com.skilldistillery.aquarium.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	private String type;

	@Column(name = "life_span_years")
	private int lifeSpan;

	private String color;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	// C O N S T R U C T O R

	public Organism() {

	}

	public Organism(String name, String type, int lifeSpan, String color, Gender gender) {
		super();
		this.name = name;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.color = color;
		this.gender = gender;
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
		builder.append("Organism [id=").append(id).append(", name=").append(name).append(", type=").append(type)
				.append(", lifeSpan=").append(lifeSpan).append(", color=").append(color).append(", gender=")
				.append(gender).append("]");
		return builder.toString();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
