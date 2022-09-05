package com.chintha.fundamentals.arrays;

public class Array {
	public static void main(String[] args) {
		
    String []chr = {"balu","china"};//array in single line initialization ,creatin ,assign values
	int[][] b= new int[23][34];
	System.out.println(b.length);
	System.out.println(b[7].length);
    int[]q = new int[9876] ;
    int[][] m = new int[2][];
   
    int[][]as = new int[8][];
    String s = "chintha chinnayya";
    //length is final variable will assign to  array objective types
    //returns only the size of the array
    System.out.println(q.length);
    //length is final method will assign to String objectives
    //returns no.of characters involve in their name mention
    System.out.println(s.length());
    System.out.println(chr);
     
	}

	
}
