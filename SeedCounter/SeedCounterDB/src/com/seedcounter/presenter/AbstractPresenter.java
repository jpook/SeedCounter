package com.seedcounter.presenter;

public abstract class AbstractPresenter<V, M> implements IPresenter<V, M> {

	protected M model;
	protected V view;

	protected final V getView() {
		return this.view;
	}

	public final void setView(V view) {
		if (view == null) {
			System.out.println("view parameter is null !");
			return;
		} else if (this.view != null) {
			System.out.println("view already set");
			return;
		}
		this.view = view;
	}

	@Override
	public final M getModel() {
		return this.model;
	}

	protected final void setModel(M model) {
		if (model == null) {
			System.out.println("model cant be null");
			return;
		}
		this.model = model;
	}

}
