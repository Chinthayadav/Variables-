package com.chintha.fundamentals.indentifiers;

public class Indentifier {

	public static void main(String[] args) {

		//identifiers are name of the java class name ,method name,variable name
		//the allowed character are the  a to z , A to Z ,$,_ other than these characters it show error
		int  _a = 123;
		int $a = 123;
		boolean $_Aa = true;
		
		
		System.out.println("x = " +_a );
		System.out.println("x = " +$a);
		System.out.println("x = " +$_Aa );
	}

}
