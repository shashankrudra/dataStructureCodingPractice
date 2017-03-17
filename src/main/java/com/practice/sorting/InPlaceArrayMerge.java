package com.practice.sorting;

import java.util.Arrays;

public class InPlaceArrayMerge {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		arr1[0] = 10;
		arr1[1] = 18;
		arr1[2] = 1;
		arr1[3] = 2;
		arr1[4] = 4;
		
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 18;
		arr2[2] = 1;
		arr2[3] = 2;
		arr2[4] = 4;
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		mergeSortedArrays(arr1, arr2);
		System.out.println(Arrays.toString(arr1));
	}

	private static void mergeSortedArrays(int[] arr1, int[] arr2) {
		
	}

}
