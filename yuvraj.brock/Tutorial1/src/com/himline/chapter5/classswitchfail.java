package com.himline.chapter5;

public class classswitchfail {
	static int temp = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switch(temp) {
		case 80 : System.out.println("80");
		//case 80 : System.out.println("80"); // won't compile!
		case 90 : System.out.println("90");
		default : System.out.println("default");
		}
		

	}

}
