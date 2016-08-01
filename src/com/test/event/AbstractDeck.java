package com.test.event;

abstract public class AbstractDeck {
	protected IDeckListener listener = null;
	
	abstract void start();
	
	protected void prepareCards() {
		System.out.println("prepareCards!");
		if (listener != null) {
			listener.onPrepareCards();
		}
	}
	
	public void setListener(IDeckListener listener) {
		this.listener = listener;		
	}
}
