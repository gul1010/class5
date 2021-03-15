package com.class5;

import java.util.Scanner;

public class Review5 {

	public static void main(String[] args) {
		
		char op;
		int num1;
		int num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first number");
		System.out.println("Enter your second number");
		System.out.println("Enter the operations");
        num1=scan.nextInt();
        num2=scan.nextInt();
        op=scan.next().charAt(0);
        
        if(op=='+') {
        	System.out.println(num1+num2);
        
        }else if(op=='-') {
        	System.out.println(num1-num2);
        }else {
        	System.out.println("Unknown");
        }
        
        
        
        
        switch(op) {
        case '+':
           System.out.println(num1+num2);
           break;
        case '-':
        	System.out.println(num1-num2);
            break;
        default:
        	System.out.println("Unknown");
        	
        }
	}

}
