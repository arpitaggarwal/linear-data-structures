package com.test.linkedlist.singly;

public class GetLength {
	private Node head;

	public static void main(String[] args) {
		GetLength list = new GetLength();
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
		System.out.println("\nLength of a linked list : "
				+ list.getLength(list.head));
	}

	public int getLength(Node head) {
		if (head == null)
			return -1;
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
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
