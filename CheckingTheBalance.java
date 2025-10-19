package com.codegnan.operatorsexample;

import java.util.Scanner;

public class CheckingTheBalance {

	/*Q3)
Bank Account Status Check
Problem:
Write a Java program to check the account balance and classify it:
"Good Standing" if the balance is greater than or equal to $1000
"Low Balance" if the balance is between $500 and $999
"Account Overdrawn" if the balance is less than $500*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the balance");
		double balance=scanner.nextDouble();
		
		String status = (balance>=1000) ? "Good Standing":
			(balance >=500) ? "Low Balance": "Account Overdrawn";
		System.out.println("Account balance " +balance);
		System.out.println("Account status " +status);
		scanner.close();

	}

}
