package com.seedcounter.db.em;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfFactory {
	private static EntityManagerFactory emf;

	protected EmfFactory() {
		super();
	}

	public EntityManagerFactory getInstance() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory("persistence");
		return emf;
	}
}
