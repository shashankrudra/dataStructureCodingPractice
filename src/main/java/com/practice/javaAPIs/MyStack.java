package com.practice.javaAPIs;

public class MyStack<E> {

	private int top = -1;

	private Object[] arr;
	
	private static final int DEFAULT_SIZE = 16;
	
	public MyStack(){
		arr = new Object[DEFAULT_SIZE];
	}
	
	public MyStack(int size){
		arr = new Object[size];
	}

	private void ensureCapacity() {
		Object[] newArray = arr;
		if(top+1>=arr.length){
			assert(arr.length==16);
			System.out.println("capacity being doubled");
			newArray = new Object[arr.length*2];
			System.arraycopy(arr,0,newArray,0,arr.length);
		}
		arr = newArray;
	}

	public void push(E e){
		ensureCapacity();
		arr[++top] = e;
	}

	/**
	 * do we retract size on deletion
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public E pop(){
		if(top<0)
			throw new IllegalStateException("no data in stack");
		return (E)arr[top--];
	}
	
	public int size(){
		return top;
	}
	
	public boolean isEmpty(){
		return top<0;
	}
	
	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStack<>();
		int i=1;
		for(;i<32;i++)
		ms.push(i);
		
		assert(ms.size()==30);
		 
		assert(ms.pop()==31);
		
		assert(ms.size()==29);
		
		ms.push(i);
		assert(ms.pop()==31);
	}
}
