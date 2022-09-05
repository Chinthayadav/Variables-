package com.chintha.fundamentals.localvariables;

//local variables are declared inside the block or method or constructer
// jvm will not provide defalut values to the local variable 
//At time declaration we must assign value as duplicate otherwise it shows the error
//local variable are stored stack area so it called as static variables
//local variables are also know as temporary variables or automatic variables or stack variables
//local will be created at the time of block execution or method loading or constructer loading
//Only applicable modifier for local variables is final, other than final we declare other modifer it shows error
//local variable are accesed at one time and threads are safe

public class Test {

	public static void main(String[] args) {
		 int y; 
		//System.out.println(y); it shows the error local variable is not initialized 
		int x=0;//local variables inside method we declared
		System.out.println(x);
		System.out.println("hello"); // it will be print why? because we declared hello inside the string
		//public int z =10; error:illegal modifier
		final int z =10;
		System.out.println(z);
	}
     
}

//output:
//0
//hell0
//10
