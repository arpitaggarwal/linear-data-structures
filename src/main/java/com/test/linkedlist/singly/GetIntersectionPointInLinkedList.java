package com.test.linkedlist.singly;

/**
 * Given Two linked list, check whether both list inter­sect each other, if yes
 * then find the start­ing node of the intersection.
 * 
 * Inter­sec­tion point means end of one linked list is linked with some node in
 * another linked list and it forms a Y shape.
 * 
 * Reference -
 * http://www.geeksforgeeks.org/write-a-function-to-get-the-intersection
 * -point-of-two-linked-lists/
 * 
 * @author ArpitAggarwal
 *
 */
public class GetIntersectionPointInLinkedList {

	public static void main(String[] args) {
		GetIntersectionPointInLinkedList list = new GetIntersectionPointInLinkedList();
		Node node1 = new Node(3);
		Node node2 = new Node(6);
		Node node3 = new Node(9);
		Node node4 = new Node(15);
		Node node5 = new Node(30);

		// First List
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		// Second List
		Node node21 = new Node(10);
		Node node22 = new Node(15);
		Node node23 = new Node(30);
		node21.next = node22;
		node22.next = node23;

		Node intersectionNode = list.getIntersectionNode(node1, node21);
		System.out.println(intersectionNode.data);
	}

	public Node getIntersectionNode(Node headA, Node headB) {

		int lengthA = 0;
		int lengthB = 0;

		Node tempA = headA, tempB = headB;
		// If both are null, return null
		if (tempA == null || tempB == null)
			return null;

		// Calculate length of first list
		while (tempA != null) {
			lengthA++;
			tempA = tempA.next;
		}

		// Calculate length of second list
		while (tempB != null) {
			lengthB++;
			tempB = tempB.next;
		}

		int diff = 0;

		tempA = headA;
		tempB = headB;

		if (lengthA > lengthB) {
			// Calculate difference of both the list
			diff = lengthA - lengthB;
			int i = 0;
			// traverse first list till difference
			while (i < diff) {
				tempA = tempA.next;
				i++;
			}
		} else {
			diff = lengthB - lengthA;
			int i = 0;

			while (i < diff) {
				tempB = tempB.next;
				i++;
			}
		}

		// start from traversed point till end and check data equality
		while (tempA != null && tempB != null) {
			if (tempA.data == tempB.data) {
				return tempA;
			} else {

			}
			tempA = tempA.next;
			tempB = tempB.next;
		}
		return null;
	}

}
