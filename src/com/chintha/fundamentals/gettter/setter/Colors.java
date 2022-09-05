package com.chintha.fundamentals.gettter.setter;


// explanation about the getter and setter methods
//getter used to get value
//setters are used to set value
public class Colors {

	@Override
	public String toString() {
		return "Colors [color=" + color + "]";
	}
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public static void main(String[] args) {
		
		Colors c = new Colors();
		 c.setColor("red");
		 System.out.println(c.getColor());
	}

}
