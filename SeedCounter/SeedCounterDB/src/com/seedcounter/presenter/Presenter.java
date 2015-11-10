package com.seedcounter.presenter;

import com.seedcounter.db.entities.Seedbag;
import com.seedcounter.db.services.SeedbagService;

public class Presenter {

	SeedbagService service;

	public Presenter() {
		super();
		service = SeedbagService.getInstance();
	}

	public void doSomething() {
		Seedbag s = new Seedbag("XYZ-10001", "test");
		service.persist(s);
	}
}
