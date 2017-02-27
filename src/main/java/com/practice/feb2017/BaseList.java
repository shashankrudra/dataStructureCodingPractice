package com.practice.feb2017;

public class BaseList {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = new Node(5);
		n1.print();
		
		
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
