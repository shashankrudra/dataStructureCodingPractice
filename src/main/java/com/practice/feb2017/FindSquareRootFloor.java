package com.practice.feb2017;

public class FindSquareRootFloor {

	public static void main(String[] args) {
		int n = 82;
		System.out.println(findSquareRootfloor(n));
		
		System.out.println(findSquareRootfloorBinarySearch(n,0,n));
	}

	private static int findSquareRootfloor(int n) {
		int result = -1;
		for(int i=0;i<=n;i++){
			if(i*i==n)
				return i;
			if(i*i<n)
				result = i;
				
		}
		return result;
	}
	
	private static int findSquareRootfloorBinarySearch(int n, int start, int end) {
		if(start>=end)
			return start;
		
		int m = (start+end)/2;
		if(m*m==n){
			return m;
		}
		else if(m*m<n){
			if((m+1)*(m+1)>n)return m;
			return findSquareRootfloorBinarySearch(n, m+1, end);
		}
		else if(m*m>n){
			if((m+1)*(m+1)<n)return m;
			return findSquareRootfloorBinarySearch(n, start, m+1);
		}
		return -1;
	}
}
