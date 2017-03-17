package com.practice.feb2017;

public class ReverseInteger {

	public static void main1(String[] args) {
		int n = 1234;
		int reverse = reverseNumber(n);
		System.out.println(reverse);
		
		reverse = reverseRecNumber(n);
		System.out.println(reverse);
	}

	private static int reverseRecNumber(int n) {
		if(n/10==0)
			return 0;
		return 0;
	}

	private static int reverseNumber(int x) {
	    int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	 
	    return rev;
	}
	
	
	public static void main(String[] args) {
		String s = "Raman";
		System.out.println(reverseRec2String(s));
	}
	
	private static String reverseString(String s){
		if(s==null)
			return null;
		if(s.trim().length()<2)
			return s;

		char charAt = s.charAt(s.length()-1);
		return new StringBuilder(String.valueOf(charAt))
				.append(reverseString(s.substring(0, s.length()-1))).toString();
	}
	
	 public static String reverseRec1String(String s){
        char c = s.charAt(s.length()-1);
        if(s.length() == 1) return Character.toString(c);   

        return c + reverseString(s.substring(0,s.length()-1));
    }
	
	public static String reverseRec2String(String s){
		if(s==null || s.length() < 2) 
	         return s;

	    return reverseString(s.substring(1)) + s.charAt(0);
	}
}
