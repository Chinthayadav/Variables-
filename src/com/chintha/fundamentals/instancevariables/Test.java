package com.chintha.fundamentals.instancevariables;

/*
 * instance variables are varied from object to object
 * every object reference we have to seperate copy of instance variables
 * instance will be created at the time of object creation and  at the time of object destruction instance variable will destroy
 * instance variables are stored at heap memory
 * instance variable are known as object level reference or atrributes
 * instance variables will access from the instance ares but not static area
 * instance variables has exact scope of the objects
 * instance variable will created inside the class and outside of the method or block or constructer
 * instance variable has define with defalut values by the jvm
 * */

public class Test {
	int x; // x has value by defalut jvm will provide 0, Instance variable declaration
	int y = 10; // Instance variable declaration with assign value

	public static void main(String[] args) {

		Test t1 = new Test();
		System.out.println(t1.y);
		//System.out.println(y);  it shows error
		t1.methodone();

	}
	public void methodone() {
		System.out.println(y);
	}

}
