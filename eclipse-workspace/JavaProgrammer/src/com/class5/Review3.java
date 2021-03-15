package com.class5;

import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scan.next();
		
		if(pass.equals("pass123")) {
			System.out.println("Enter true to check ur balance and false to close the application");
			boolean nextOp=scan.nextBoolean();
			if(nextOp) {
				System.out.println("Hello Gul");
			}
		}else {
			System.out.println("Password is not correct");
		}

	}

}
