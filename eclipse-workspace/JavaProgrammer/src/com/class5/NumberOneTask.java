package com.class5;

import java.util.Scanner;

public class NumberOneTask {

	public static void main(String[] args) {
		
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
         Scanner scan;
         String country, language;
         
         scan=new Scanner(System.in);
         System.out.println("Enter your country");
         country=scan.nextLine();
         
         switch(country) {
         
         case "Uzbekistan":
        	 language="uzbek";
        	 break;
         case "Russia":
        	 language="russian";
        	 break;
         case "Turkey":
        	 language="turkish";
        	 break;
         case "Morocco":
        	 language="arabic";
        	 break;
         case "China":
        	 language="chinese";
        	 break;
         default:
        	 language="unknown";
        	 break;
         }
         System.out.println("Your native language is "+language);
	}

}
