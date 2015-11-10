package com.seedcounter.db.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String firstName;

	public TestEntity() {
		super();
	}

	public TestEntity(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String toString() {
		return "User : " + firstName + " " + name;
	}

}
