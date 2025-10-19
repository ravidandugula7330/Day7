package com.codegnan.operatorsexample;

import java.util.Scanner;

public class HourOfTheDayAndGreetings {

	public static void main(String[] args) {
		/*Q4) Hour of the Day Greeting
	Problem:
	 Write a Java program to print a greeting based on the hour of the day using ternary operators:

	"Good Morning" if the hour is between 5 AM and 12 PM
	"Good Afternoon" if the hour is between 12 PM and 5 PM
	"Good Evening" if the hour is between 5 PM and 10 PM
	"Good Night" if the hour is between 10 PM and 5 AM*/
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter Hours");
		
		int hour = scanner.nextInt();
		
		String greeting = (hour >=5 && hour <12) ? "Good Morning":
			(hour >=12 && hour <17) ? "Good Afternoon":
				(hour >=17 && hour <22) ? "Good Evening": "Good night";
		System.out.println(greeting);
			
		
	}

}
