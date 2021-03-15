package com.class5;

import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scanner.next();
		System.out.println("Enter amount that will transfer");
		double transferAmount=scanner.nextDouble();
		if(pass.equals("pass123")&& transferAmount<1000){
				System.out.println("Amount transferes");
		}else {
			System.out.println("Either password incorrect or not enough balance");
		}
		if(pass.equals("pass123")) {
			System.out.println("Enter amount that will transfer");
			transferAmount=scanner.nextDouble();
			if(transferAmount<1000) {
				System.out.println("Amount transfered");
			}else {
				System.out.println("Not enough balance");
			}
		}else {
			System.out.println("Password not correct");
		}
	}

}
