package com.skilldistillery.aquarium.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrganismTest {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private Organism organism;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("AquariumPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		organism = em.find(Organism.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		organism = null;
	}
	
	@DisplayName("test organism entity map")
	@Test
	void test() {
		assertNotNull(organism);
		assertEquals("SCOBY", organism.getName());
	}

}
