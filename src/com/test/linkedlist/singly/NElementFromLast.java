package com.test.linkedlist.singly;

import java.util.Scanner;

public class NElementFromLast {
	private Node head;

	public static void main(String[] args) {
		NElementFromLast list = new NElementFromLast();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(19);
		Node node6 = new Node(16);
		Node node7 = new Node(20);
		list.head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		list.printList();
		System.out.println("\nEnter Number: ");
		Scanner scanner = new Scanner(System.in);
		int nodeFromLast = scanner.nextInt();
		list.printNthFromLast(nodeFromLast);
		scanner.close();

	}

	/**
	 * References :
	 * http://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
	 *
	 */
	private void printNthFromLast(int n) {
		if (head == null)
			return;
		Node nthNode = head;
		Node headNode = head;
		int counter = 1;
		while (counter < n) {
			nthNode = nthNode.next;
			counter++;
		}

		while (nthNode.next != null) {
			headNode = headNode.next;
			nthNode = nthNode.next;
		}
		System.out.println("\n" + n + " Node in list from last : "
				+ headNode.data);

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
