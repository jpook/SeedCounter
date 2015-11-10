package com.seedcounter.ui;

import com.seedcounter.presenter.AbstractPresenter;

public abstract class AbstractView<P extends AbstractPresenter> {

	private final P presenter;

	public AbstractView(P presenter) {
		this.presenter = presenter;
		this.initializePresenter();
	}

	@SuppressWarnings("unchecked")
	private void initializePresenter() {
		if (this.presenter == null) {
			System.out.println("presenter is null");
			return;
		}
		this.presenter.setView(this);
	}

	protected P getPresenter() {
		return this.presenter;
	}
}
