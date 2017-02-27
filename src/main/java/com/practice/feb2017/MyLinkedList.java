package com.practice.feb2017;

public class MyLinkedList<T> {
	
	private static class MyNode<T>{
		private MyNode<T> next;
		private MyNode<T> previous;
		private T data;
		
		public MyNode(T data2) {
			data = data2;
		}
	}
	
	private MyNode<T> head;
	private MyNode<T> tail;
	
	public void add(T data){
		MyNode<T> newNode = new MyNode<T>(data);
		if(head==null){
			head = newNode;
		}else{
			MyNode<T> tNode = head;
			while((tNode = tNode.next)!=null)
			tNode.next = newNode;
		}
		
		if(tail==null){
			tail = newNode;
		}else{
			MyNode<T> tNode = tail;
			while((tNode = tNode.previous)!=null)
			tNode.previous = newNode;
		}
	}
	
}
