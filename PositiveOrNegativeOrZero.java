package com.codegnan.operatorsexample;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {

	public static void main(String[] args) {
		/*Q5) Checking Whether a Number is Positive, Negative, or Zero
	Problem:
	 Write a Java program to check if a given number is positive, negative, or zero using a ternary operator.

	Q6)*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A number");
		
		
		int Number =scanner.nextInt();
		String result =(Number >0) ? "positive":
			(Number  <0) ? "negative":"zero";
		System.out.println("Given Number is :" +result);
		scanner.close();
		
				
		

	}

}
