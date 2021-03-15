package com.class5;

public class Review {

	public static void main(String[] args) {
		
		int num=1000;
		if(num>=0) {
			if(num<=100) {
				System.out.println("0 to 100");
			}
		}else {
			System.out.println("Out of Range");
		}
		
		if(num>=0 && num<=100) {
			System.out.println("0 to 100");
		}else {
			System.out.println("Out of range");
		}
		
		if(num>=0 && num<=100) {
			System.out.println("Checking");
			System.out.println("Checking");
		}
	}

}
