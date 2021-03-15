package com.class5;

import java.util.Scanner;

public class NumberThreeTask {

	public static void main(String[] args) {
		
		//Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
      
		Scanner scan;
		int num1, num2;
		char operator;
		double result = 0;
		
		scan=new Scanner(System.in);
		System.out.println("Enter your first number");
		num1=scan.nextInt();
		
		System.out.println("Enter your second number");
		num2=scan.nextInt();
		
		System.out.println("Enter any operator(+, -, *, /)");
		operator=scan.next().charAt(0);
		
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("It is wrong number, please enter correct number");
		}
       System.out.println(num1+" "+operator+" "+num2+"="+result);
       
	}

}
