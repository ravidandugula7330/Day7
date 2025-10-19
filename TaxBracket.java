package com.codegnan.operatorsexample;
 
import java.util.Scanner;

public class TaxBracket {

	public static void main(String[] args) {
		
		/*If income is less than 300,000, the tax rate is 5%.
		If income is between 300,000 and 1,000,000, the tax rate is 10%.
		If income is above 1,000,000, the tax rate is 15%.
		Additionally, if the income is over 2,000,000, 
		apply a special bonus of 1% on the total tax amount.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total amount: ");
		double income= scanner.nextDouble();
		
		double taxRate = (income < 300000) ? 0.05 :
            (income <= 1000000) ? 0.10 :
            0.15;

		double tax = income * taxRate;


		double bonus = (income > 2000000) ? tax * 0.01 : 0.0;

		double totalTax = tax + bonus;


		System.out.println("Income: " + income);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Tax: " + tax);
        System.out.println("Bonus (1% on tax if income > 2M): " + bonus);
        System.out.println("Total Tax Payable: " + totalTax);

        scanner.close();
		


	}

}