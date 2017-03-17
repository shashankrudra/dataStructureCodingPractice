package com.practice.sorting;

import java.lang.String;
import java.lang.System;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {1,2,6,7,9,4,5,8,3};

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		arr = new int[]{1,2,6,7,9,4,5,8,3};
		System.out.println(Arrays.toString(arr));
		repalceInline(arr);

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

	private static void repalceInline(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(arr[j]<arr[i]){
					swap(arr,i,j);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int index) {
		int t = arr[i];
		arr[i] = arr[index];
		arr[index] = t;
	}

}
