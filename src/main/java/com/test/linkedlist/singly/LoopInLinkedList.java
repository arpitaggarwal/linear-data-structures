package com.test.linkedlist.singly;

public class LoopInLinkedList {

	private Node head;

	public static void main(String[] args) {
		LoopInLinkedList list = new LoopInLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(5);
		Node node4 = new Node(6);
		Node node7 = new Node(7);
		list.head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node7;
		node4.next = node2;
		System.out.println("Linked List has loop : " + list.hasLoop(node1));
	}

	boolean hasLoop(Node first) {
		if (first == null) // list does not exist..so no loop either.
			return false;

		Node slow, fast; // create two references.

		slow = fast = first; // make both refer to the start of the list.

		while (true) {

			slow = slow.next; // 1 hop.

			if (fast.next != null)
				fast = fast.next.next; // 2 hops.
			else
				return false; // next node null => no loop.

			if (slow == null || fast == null) // if either hits null..no loop.
				return false;

			if (slow == fast) // if the two ever meet...we must have a loop.
				return true;
		}
	}

}
