package com.codegnan.operatorsexample;

import java.util.Scanner;

public class TemparatureCalculation {

	public static void main(String[] args) {
		/*Q6)
	Temperature Classification
	Problem:
	 Write a program using a ternary operator to classify the temperature:
	If the temperature is above 30°C, print "Hot".
	If the temperature is between 15°C and 30°C, print "Moderate".
	Otherwise, print "Cold".*/	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Temparature");
		
		
		int Temparature =scanner.nextInt();
		String clasiffication =(Temparature >30) ? "Hot":
			(Temparature  <30) ? "Moderate":"Cold";
		System.out.println("The clasiffication is :" +clasiffication);
		scanner.close();
	}

}
