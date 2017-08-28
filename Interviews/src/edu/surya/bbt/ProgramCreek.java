package edu.surya.bbt;

import java.util.Arrays;
import java.util.Comparator;

public class ProgramCreek {
	//	Given a list of non negative integers, arrange them such that they form the largest number.
	//	For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330. 
	//	(Note: The result may be very large, so you need to return a string instead of an integer.)
	public static void largestNumberCombination(int[] numarray){
		String [] strArray = new String[numarray.length];
		for(int i=0;i<numarray.length;i++){
			System.out.println("in>>"+numarray[i]);
			strArray[i] = String.valueOf(numarray[i]);
			System.out.println(strArray[i] );
		}
		Arrays.sort(strArray,0,strArray.length- 1, new CustomComparator());
		
		StringBuilder s = new StringBuilder();
		for(int i =0;i<strArray.length;i++){
			s.append(strArray[i]);
		}
		System.out.println("largest number>>"+s.toString());
	}

	private static class CustomComparator implements Comparator<String>{
		public int compare(String a, String b) {
			return ((b+a).compareTo(a+b));
		}

	}
}
