package com.test.linkedlist.doubly;

public class CreateDoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public CreateDoublyLinkedList() {
		size = 0;
	}

	public void addFirst(T element) {
		Node<T> node = new Node<T>(element, head, null);
		if (head != null) {
			head.prev = node;
		}
		head = node;
		if (tail == null) {
			tail = node;
		}
		size++;
		System.out.println("adding: " + element);
	}

	public static void main(String[] args) {
	}
}
