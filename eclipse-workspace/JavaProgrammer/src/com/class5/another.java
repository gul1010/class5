package com.class5;

import java.util.Scanner;

public class another {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String month, season;
		System.out.println("Enter your birth month");
		month=scan.nextLine();
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			season="Winter";
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";	
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else {
			season="Invalid";
		}
		
		System.out.println("You were born in season "+season);

	}

}
