package com.practice.feb2017;

public class FindIfPerfectSquare {

	public static void main(String[] args) {
		int n = 11;
		System.out.println("is " + n + " a perfect square: " + isPerfectSquare(n));
		
		 n = 16;
		 System.out.println("is " + n + " a perfect square: " + isPerfectSquare(n));
	
		 n = 9;
		 System.out.println("is " + n + " a perfect square: " + isPerfectSquare(n));
		 
		 n = 49;
		 System.out.println("is " + n + " a perfect square: " + isPerfectSquare(n));
		 
		 n = 256;
		 System.out.println("is " + n + " a perfect square: " + isPerfectSquare(n));
	}

	private static boolean isPerfectSquare(int n) {
		int sum = 1;
		for(int i=3;i<n-3;){
			sum+=i;
			if(sum==n)
				return true;
			i+=2;
		}
		return false;
	}

}
