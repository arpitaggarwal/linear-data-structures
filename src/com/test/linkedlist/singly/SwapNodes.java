package com.test.linkedlist.singly;

public class SwapNodes {
	private Node head;

	public static void main(String[] args) {
		SwapNodes list = new SwapNodes();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		list.head = node1;
		node1.next = node2;
		node2.next = node5;
		node5.next = node6;
		node6.next = node7;

		list.printList();

		list.swapNodes(2, 6);
		System.out.println("\nSwaping Node Without changing data..");
		list.printList();
	}

	/*
	 * Function to swap Nodes x and y in linked list by changing links. The idea
	 * it to first search x and y in given linked list. If any of them is not
	 * present, then return. While searching for x and y, keep track of current
	 * and previous pointers. First change next of previous pointers, then
	 * change next of current pointers. Following are C and Java implementations
	 * of this approach.
	 */
	public void swapNodes(int x, int y) {
		// Nothing to do if x and y are same
		if (x == y)
			return;

		// Search for x (keep track of prevX and CurrX)
		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else
			// make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else
			// make x the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
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
