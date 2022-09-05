package com.chintha.fundamentals.staticvariables;

// static variables are class level or fields

//static variables are not varies from object to the another object and for entire class one copy will be created
//it will assign to all objects
//static variables are stored in method area
//static variables will created at the time of class loading and destroy at the time of class unloading
//static variable has exact scope of .class file
// static will be access through 3 ways
// class name , reference object,variable name
// with in the class only we access static variable through variable name
//Static variable are created inside the class and outside of method or block...etc
/*
 * Java Test process:
 * first start the JVM
 * create and start main method by JVM
 * locate .class file by main method  // static variable created 
 * execution of main method
 * unload test class  // static variable destroy
 * terminate main method
 * shutdown jvm
 * */
public class Test {

	static int x = 10; // static variable declaration

	public static void main(String[] args) {

		Test t1 = new Test();
		System.out.println(t1.x); // calling static variable through reference object
		System.out.println(Test.x);// calling static variable through class name
		System.out.println(x);// calling directly with variable name we asssign

	}

}
