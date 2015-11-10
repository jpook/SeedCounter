package com.seedcounter.db.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.seedcounter.db.entities.Seedbag;

/*
 * Singleton
 * Service class for all db operations with Seedbag class
 */
public class SeedbagModel {

	private EntityManagerFactory emf;
	private EntityManager em;

	private static SeedbagModel instance;

	/*
	 * EntityManagerFactory and EntityManager should be created only once due to
	 * performance
	 */
	protected SeedbagModel() {
		emf = Persistence.createEntityManagerFactory("persistence");
		em = emf.createEntityManager();
	}

	/*
	 * access method to access SeedbagModel as Singleton
	 */
	public static SeedbagModel getInstance() {
		if (instance == null) {
			instance = new SeedbagModel();
		}
		return instance;
	}

	/*
	 * should be called before ending the program
	 */
	public void closeService() {
		em.close();
		emf.close();
	}

	/*
	 * persist seedbag in database --> should be transferred to generic abstract
	 * class like all common db functions
	 */
	public void persist(Seedbag s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
	}

}
