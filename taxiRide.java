package com.codegnan.operatorsexample;

import java.util.Scanner;

public class taxiRide {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Distance");
		int distance=scanner.nextInt();
		double fare=(distance <= 2) ? 50 
			: (distance <= 10) ? (50 + (distance - 2) * 15) :
				(50 + (8 * 15) + (distance - 10) * 10);
		fare = (distance > 20) ? fare * 0.95 : fare;
		System.out.println(fare);
		scanner.close();
				
			

	}

}
