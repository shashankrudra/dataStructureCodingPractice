package com.practice.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ComparatorGenericSolution {

	public static void main(String[] args) {
		Collection<Interval<Integer>> intervals = new ArrayList<>();
		intervals.add(new Interval<Integer>(11, 15));
		intervals.add(new Interval<Integer>(18, 21));
		intervals.add(new Interval<Integer>(24, 26));

		int val = 10;
		System.out.println("--for 10 --");
		findIntervals(intervals, val).stream().forEach(System.out::println);
		
		val = 12;
		System.out.println("--for 12 --");
		findIntervals(intervals, val).stream().forEach(System.out::println);
		
		val = 25;
		System.out.println("--for 25 --");
		findIntervals(intervals, val).stream().forEach(System.out::println);
	}

	private static <T extends Comparable<T>> Collection<Interval<T>> findIntervals(Collection<Interval<T>> intervals, T value){
		//Collection<Interval<T>> result = new ArrayList<>();
		return intervals.stream().filter(t -> t.contains(value)).collect(Collectors.toList());
		//return result;
	}

	private static class Interval<T extends Comparable<T>>{
		T start;
		T end;

		public Interval(T st, T ed){
			start = st;
			end = ed;
		}

		@Override
		public int hashCode(){
			return super.hashCode() + start.hashCode() + end.hashCode();
		}

		@Override
		public boolean equals(Object o){
			return true;
		}
		
		@Override
		public String toString(){
			return "Interval[" + start + ", " + end + "]"; 
		}

		public boolean contains(T value){
			return start.compareTo(value) <=0 && end.compareTo(value) >=0;
		}
	}
}
