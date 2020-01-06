package edu.kis.vh.nursery.list;

/**
 * Klasa odpowiadająca za reprezentację węzła. Jest ona składową klasy IntLinkedList.
 */
public final class Node {
	/**
	 * value - zmienna przechowywująca wartość węzła.
	 * prev - zmienna odpowiadająca za przechowywanie informacji o położeniu poprzedniego węzła
	 * next - zmienna odpowiadająca za przechowywanie informacji o położeniu kolejnego węzła
	 */
	int value;
	public Node prev, next;

	/**
	 * Konstruktor
	 * @param i - zmienna przypisywana do klasy
	 */
	public Node(int i) {
		value = i;
	}
	
}
