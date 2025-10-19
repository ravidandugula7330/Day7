package com.codegnan.operatorsexample;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter total shopping Amount");
	
	double totalAmount = scanner.nextDouble();
	double discount;
	
	discount = (totalAmount >= 10000) ? (totalAmount*0.20):
		(totalAmount >= 500) ? (totalAmount*0.10): 0;
	double FinalAmount = totalAmount-discount;
	
	System.out.println("original amount is:" + totalAmount);
	System.out.println("Discount appled is:"  +discount);
		System.out.println("Final payable Amount is:" + FinalAmount);
		scanner.close();
		
		
	}

}
