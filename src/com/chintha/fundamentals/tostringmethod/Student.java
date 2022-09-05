
//defining the package name
package com.chintha.fundamentals.tostringmethod;

//define class name with declaration
class Student {
	private int rollno;
	private String name;
	private String city;

	
	//define the Constructer to Assign the while we calling object creation
	Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	//define the getter and stter methods
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return rollno + " " + name + " " + city;
	}

	//define main method
	public static void main(String args[]) {
		Student s1 = new Student(511, "chintha", "Tirupati");
		System.out.println(s1);
	}

}