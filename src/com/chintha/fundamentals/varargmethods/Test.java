package com.chintha.fundamentals.varargmethods;

//var arg parameters are used from 1.5version onwards
//var arg method has least priority while compared to the general method
//var arg intially it convert int a single dimensional array
// we can mix with  genral method with var arg method but, var arg declared at last only why because it gives complile time error
//
public class Test {

	public static void methodone(int... x) {
//		System.out.println("var-arg method");
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];
		}
		System.out.println("sum =" + total);

	}

	public static void main(int x, int... y) {
		System.out.println("mixed with general method and var arg method");
	}
//	public static void main(int...x,int...y) {
//		System.out.println("mixed with general method and var arg method");  
	//here we declare both var arg method so it gives eror
//	} 
//	public static void main(int...x,int y) {
//		System.out.println("mixed with general method and var arg method"); 
	// here we start with start with var arg method so it shows errorf
//	}
	/*
	 * public static void m1(int...x) {
		System.out.println("var arg method");
	} 
	In class we not able to declare both single dimension array and var arg 
	public static void m1(int[] x) {
		System.out.println("general method");
	}
*?
	 */

	public static void main(String... args) {

		methodone();
		methodone(12, 23);
		methodone(12, 23, 23);
		methodone(12, 23, 23, 67);
		methodone(12, 23, 23, 9, 90);
	}
}
