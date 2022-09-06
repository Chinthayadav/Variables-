package com.chintha.fundamentals.varargmethods;

public class Test1 {

	public static void m1(int...x) {
		System.out.println("var arg method");
	}
	public static void m1(int x) {
		System.out.println("general method");
	}

	public static void main(String[] args) {
		
		m1(); // var arg method
		m1(12,12,23,5467);// var arg method
		m1(12,12,23);// var arg method
		m1(12,23);// var arg method
		m1(12);// general method
	}

}
