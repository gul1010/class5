package com.class5;

import java.util.Scanner;

public class NumberTwoTask {

	public static void main(String[] args) {

		//Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user with explanation. 
        Scanner input;
        char grade;
        String explanation;
        
        input=new Scanner(System.in);
        System.out.println("Please enter your grade");
        grade=input.next().charAt(0);
        
        switch (grade) {
        case 'A':
        	explanation="Excellent";
        	break;
        case 'B':
        	explanation="Good";
        	break;
        case 'C':
        	explanation="Average";
        	break;
        case 'D':
        	explanation="Bad";
        	break;
        default:
        	explanation="N/A";
        	break;	
        }
        System.out.println("Based on your current grade, you are "+explanation+" student");
	}

}
