package com.practice.feb2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[][] input = {{1,4,7},{2,6,8}};
		Integer[] result = merge(input);
		System.out.println(Arrays.asList(result));
	}
	
	private static Integer[] merge(int[][] input){
		List<Integer> list = new ArrayList<>();
		
		int[] arr1 = input[0];
		int[] arr2 = input[1];
		
		int i = 0;
		int j = 0;
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]>arr2[j]){
				list.add(arr2[j++]);
			}else{
				list.add(arr1[i++]);
			}
		}
		
		while(i<arr1.length){
			list.add(arr1[i++]);
		}
		
		while(j<arr2.length){
			list.add(arr2[j++]);
		}
		
		return list.toArray(new Integer[list.size()]);
	}

}
