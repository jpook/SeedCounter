package com.seedcounter.presenter;

import com.seedcounter.db.entities.Seedbag;
import com.seedcounter.db.services.SeedbagModel;

public class SeedbagPresenter {

	SeedbagModel service;

	public SeedbagPresenter() {
		super();
		service = SeedbagModel.getInstance();
	}

	public void doSomething() {
		Seedbag s = new Seedbag("XYZ-10001", "test");
		service.persist(s);
	}
}
