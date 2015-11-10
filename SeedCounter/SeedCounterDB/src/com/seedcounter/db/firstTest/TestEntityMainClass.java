package com.seedcounter.db.firstTest;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.seedcounter.db.entities.TestEntity;

public class TestEntityMainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
//		TestEntity t = new TestEntity("name", "firstName");
//		em.getTransaction().begin();
//		em.persist(t);
//		em.getTransaction().commit();
		Query query = em.createQuery("SELECT e FROM TestEntity e");
		Collection<TestEntity> tec = query.getResultList();
		if (tec == null) {
			System.out.println("te is null");
		} else {
			System.out.println("te is not null, length " + tec.size());
			for (TestEntity te : tec)
				System.out.println(te);
		}
		em.close();
		emf.close();
	}

}
