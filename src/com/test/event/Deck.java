package com.test.event;

public class Deck extends AbstractDeck {
	void start() {
		System.out.println("start!");
		prepareCards();
	}
}
