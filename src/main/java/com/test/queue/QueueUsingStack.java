package com.test.queue;

import java.util.Stack;

public class QueueUsingStack<E> {

	private Stack<E> inbox = new Stack<E>();
	private Stack<E> outbox = new Stack<E>();

	/**
	 * Queue:- Push the new element onto inbox
	 * 
	 */
	public void queue(E item) {
		inbox.push(item);
	}

	/**
	 * - If outbox is empty, refill it by popping each element from inbox and
	 * pushing it onto outbox - Pop and return the top element from outbox
	 * 
	 */
	public E dequeue() {
		if (outbox.isEmpty()) {
			while (!inbox.isEmpty()) {
				outbox.push(inbox.pop());
			}
		}
		return outbox.pop();
	}
}
