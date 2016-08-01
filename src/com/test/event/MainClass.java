package com.test.event;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("enter!!");
		
		AbstractDeck deck = new Deck();
		
		deck.setListener(new IDeckListener() {			
			@Override
			public void onPrepareCards() {
				System.out.println("onPrepareCards in the MainClass");
			}
		});
		deck.start();
	}
}
