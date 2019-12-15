package com.app.test;

public class MainTest {

	public  static void addData(String data) {
		if(data==null) {
			System.out.println("No any Work");
		}
		
	}
	public MainTest() {
	System.out.println("This is no parameterized constructor");
	}
	public static void main(String[] args) {
		addData("Data");
     System.out.println("Mian Method");
	}
}
