package com.class5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double num1, num2, num3;
		System.out.println("Enter the first number");
		num1=scan.nextDouble();
		System.out.println("Enter the second number");
		num2=scan.nextDouble();
		System.out.println("Enter the third number");
		num3=scan.nextDouble();
		
		
		if(num1>=num2 && num1>=num3) {
           System.out.println("It is largest number");
		}else if(num2>=num1 && num2>=num3) {
			System.out.println("It is second largest number");
		}else if (num3>=num1 && num3>=num2){
			System.out.println("It is third largest number");
		}
		
	}
}