package com.practice.feb2017;

public class ReverseInteger {

	public static void main(String[] args) {
		int n = 1234;
		int reverse = reverseNumber(n);
		System.out.println(reverse);
	}

	private static int reverseNumber(int x) {
	    int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	 
	    return rev;
	}

}
