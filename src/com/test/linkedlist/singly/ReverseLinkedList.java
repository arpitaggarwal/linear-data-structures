package com.test.linkedlist.singly;

public class ReverseLinkedList {
	private Node head;

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		list.head = node1;
		node1.next = node2;
		node2.next = node3;

		list.printList();

		list.reverseList();
		System.out.println("\nAfter Reverse");
		list.printList();
	}

	private void reverseList() {
		if (head == null) {
			return;
		}
		Node previous = null;
		Node current = head;
		while (current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	/* This function prints contents of linked list starting from head */
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
}
