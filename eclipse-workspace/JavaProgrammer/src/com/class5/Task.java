package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner input;
		int height;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your height");
		height=input.nextInt();
		
		if(height>=60 && height<60) {
			System.out.println("You are short");
		}else if(height>=60 && height<72) {
			System.out.println("You are medium");
		}else {
			System.out.println("Your tall");
			
		}

	
	System.out.println("---------------------------------------------------------------------");
	
	String day="Wednesday";
	if (day.equals("Monday") || day.equals("Tuesday")) {
		System.out.println("Weekday");
	}else if(day.equals("Wednesday") || day.equals("Thursday"))	{
		System.out.println("Weekday");
	}else if(day.equals("Saturday") || day.equals("Sunday")) {
	     System.out.println("Weekened");
	
	}else {
		System.out.println("Invalid day");
	}
	}

}
