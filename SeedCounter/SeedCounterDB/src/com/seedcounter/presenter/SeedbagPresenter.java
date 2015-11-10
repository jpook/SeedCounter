package com.seedcounter.presenter;

import com.seedcounter.db.entities.Seedbag;
import com.seedcounter.db.services.SeedbagModel;
import com.seedcounter.ui.SeedCounterView;

public class SeedbagPresenter extends AbstractPresenter<SeedCounterView, SeedbagModel> {


	public SeedbagPresenter() {
		super();
		setModel(SeedbagModel.getInstance());
	}

	public void doSomething() {
		Seedbag s = new Seedbag("XYZ-10001", "test");
		model.persist(s);
	}
}
