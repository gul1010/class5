package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner score;
		int quiz, midTerm, finalScore, gpa;
		char grade;
		score=new Scanner(System.in);
		
		System.out.println("Please enter quiz score");
		quiz=score.nextInt();
		
		System.out.println("enter your mid term");
		midTerm=score.nextInt();
		
		System.out.println("enter your final score");
		finalScore=score.nextInt();
		
		gpa=(quiz+midTerm+finalScore)/3;
		
		if(gpa>=90) {
			grade = 'A';
	    }else if (gpa>=70 && gpa<90) {
	    	grade = 'B';
	    	
	    }else if (gpa>=50 && gpa<70) {
	    	grade = 'C';
	    }else {
	    	grade ='F';
	    }
		System.out.println("your grade is "+grade);
		if (grade == 'A' || grade == 'B') {
			System.out.println("I am happy !!!");
		}

}
}