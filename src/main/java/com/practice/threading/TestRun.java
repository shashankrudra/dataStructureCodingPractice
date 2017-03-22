package com.practice.threading;
public class TestRun {

	public static void main(String[] args) {
		Thread t1 = new Thread(()-> System.out.println(1));

		Thread t2 = new Thread(()-> System.out.println(2));

		t1.start();
		t2.start();
	}

}