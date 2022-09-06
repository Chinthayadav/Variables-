package com.chintha.fundamentals.varargmethods;

public class Tset2 {
	public static void m1(int[]...x) {
		for(int []x1:x) {
			System.out.println(x1[0]);
			
		}
		
	}

	public static void main(String[] args) {
   int[] a= {6,7,9,8};
   int[] b= {67,77,8,86,79,8};
   m1(a,b);
   
		
	}

}
