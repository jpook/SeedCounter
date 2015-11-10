package com.seedcounter.db.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Genotype {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String generation;
}
