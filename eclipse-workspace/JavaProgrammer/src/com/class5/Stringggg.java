package com.class5;

import java.util.Scanner;

public class Stringggg {

	public static void main(String[] args) {
		Scanner scan;
		int time;
		String timeOfTheDay=null;//"invalid";
		
		scan=new Scanner(System.in);
		System.out.println("enter time in 24 hour format");
		time=scan.nextInt();
		
		if (time>=1 && time<=11) {
			timeOfTheDay="Morning";
		}else if(time>=12 && time<=13) {
			timeOfTheDay="Noon";
		}else if(time>=14 && time<=17) {
			timeOfTheDay="Afternoon";
		}else if(time>=18 && time<=21) {
			timeOfTheDay="Evening";
		}else if(time>=22 && time<=24) {
			timeOfTheDay="Night";
		}
        System.out.println("Based on entered time, time of the day "+timeOfTheDay);
        
        double d=10;
        System.out.println(d);//10.0
        
        
        System.out.println("---------------------------------------------------------------");
        
        String str="Hello";
        String str1="hello";
        
        boolean yesOrNo=str.equals(str1);//false
        System.out.println(yesOrNo);
        
        boolean yesOrNo1=str.equalsIgnoreCase(str1);//true
        System.out.println(yesOrNo1);
	}

}
