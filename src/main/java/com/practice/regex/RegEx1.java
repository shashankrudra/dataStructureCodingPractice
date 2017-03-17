package com.practice.regex;

import java.util.StringTokenizer;

public class RegEx1<T1, T2>{

	public static void main(String[] args) {
		//String token = "/\.";
		String s = "I / am \\.";
		StringTokenizer st = new StringTokenizer(s, "/\\.");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}

}
