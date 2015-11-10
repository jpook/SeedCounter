package com.seedcounter.db.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seedbag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String idt;
	String name;

	public Seedbag() {
		super();
	}

	public Seedbag(String idt, String name) {
		super();
		this.idt = idt;
		this.name = name;
	}

	public String getIdt() {
		return idt;
	}

	public void setIdt(String idt) {
		this.idt = idt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

}
