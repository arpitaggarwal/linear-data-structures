package com.test.linkedlist.singly;

public class MiddleElementInLinkedList {

	private Node head;

	public static void main(String[] args) {
		MiddleElementInLinkedList list = new MiddleElementInLinkedList();
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
		list.printList();

		list.printMiddleElement();
	}

	private void printMiddleElement() {
		if (head == null)
			return;
		Node temp = head;
		Node oneHop, twoHop;
		oneHop = twoHop = temp;
		while (twoHop != null && twoHop.next != null) {
			oneHop = oneHop.next;
			twoHop = twoHop.next.next;

		}
		System.out.println("\nMiddle Element : " + oneHop.data);
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
