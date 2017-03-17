package com.practice.sorting;

import java.lang.String;
import java.lang.System;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2,6,7,9,1,4,5,8,3};
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			int min = arr[i];
			int index = i;
			boolean flag = false;
			for(int j=i+1;j<len;j++){
				if(arr[j]<min){
					min = arr[j];
					index = j;
					flag = true;
				}
			}
			if(flag){
				swap(arr, i, index);
			}
		}
	}

	private static void swap(int[] arr, int i, int index) {
		int t = arr[i];
		arr[i] = arr[index];
		arr[index] = t;
	}

}
