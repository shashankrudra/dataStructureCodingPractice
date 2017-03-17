package com.practice.feb2017;

public class ReverseList {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = new Node(5);
		n1.print();
		
		System.out.println();
		Node y = reverseList(n1);
		y.print();
		
		System.out.println();
		Node z = reverseListRec(y, null);
		z.print();
	}
	
	static Node reverseList(Node head){
		Node newHead = null;
	    while (head != null) {
	        Node next = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = next;
	        System.out.print("");
	    }
	    return newHead;
	}

	static Node reverseListRec(Node head, Node newHead) {
	    if (head == null)
	        return newHead;
	    Node next = head.next;
	    head.next = newHead;
	    return reverseListRec(next, head);
	}
	
	private static class Node{
		Node next;
		int value;
		
		Node(int v){
			value = v;
		}
		
		void print(){
			Node t = this;
			while (t!=null){
				System.out.print(t.value + " -> ");
				t = t.next;
			}
		}
	}
}
