package com.class5;

import java.util.Scanner;

public class Hmwork {

	public static void main(String[] args) {
		 
		Scanner input;
		String name;
		int age;

		input=new Scanner(System.in);
				System.out.println("Please enter your name");
		       name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if(age>=1 && age<3) {
			System.out.println(name+" you are a baby");
		}else if (age>=3 && age<5) {
			System.out.println(name+" you are a higher baby");
		}else if(age>=5 && age<12) {
			System.out.println(name+" you are kid");
		}else if(age>=13 && age<19) {
			System.out.println(name+" you are teenager");
		}else
			System.out.println(name+" you are an adult");
	}

}
