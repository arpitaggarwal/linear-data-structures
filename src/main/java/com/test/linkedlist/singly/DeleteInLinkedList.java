package com.test.linkedlist.singly;

public class DeleteInLinkedList {
	private Node head;

	public static void main(String[] args) {
		DeleteInLinkedList list = new DeleteInLinkedList();
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

		list.deleteNode(node2);
		System.out.println("\nDeleting Node..");
		list.printList();
		System.out.println("\nDeleting Node for position..");
		list.deleteNodeOnPosition(0);
		list.printList();
		System.out.println("\nDeleting Node for position using while loop..");
		list.deleteNodeOnPositionWhileLoop(2);
		list.printList();

	}

	private Node deleteNode(Node node) {
		if (head == null) {
			return null;
		}
		Node tmp = null;
		if (head.data == node.data) {
			tmp = head;
			head = null;
			return tmp;
		}
		while (head.next != null) {
			if (head.next.data == node.data) {
				// tmp = head.next;
				head.next = head.next.next;
				break;
			}
			tmp = head.next;
		}
		return tmp;
	}

	/**
	 * Reference :
	 * http://geeksquiz.com/delete-a-linked-list-node-at-a-given-position/
	 * 
	 * @param position
	 * @return
	 */
	private Node deleteNodeOnPosition(int position) {
		if (head == null) {
			return null;
		}
		Node tmp = head;
		if (position == 0) {
			tmp = head.next;
			head = tmp;
			return tmp;
		}

		for (int i = 0; i < position - 1; i++) {
			tmp = tmp.next;
		}

		// If position is more than number of nodes
		if (tmp == null || tmp.next == null)
			return null;

		Node next = tmp.next.next;
		tmp.next = next;
		return tmp;
	}

	private Node deleteNodeOnPositionWhileLoop(int position) {
		if (head == null) {
			return null;
		}
		Node tmp = head;
		if (position == 0) {
			tmp = head.next;
			head = tmp;
			return tmp;
		}
		int count = 0;
		Node previous = null;
		while (tmp != null && count != position) {
			previous = tmp;
			tmp = tmp.next;
			count++;
		}
		previous.next = tmp.next;
		return tmp;
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
