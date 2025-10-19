package com.codegnan.operatorsexample;

import java.util.Scanner;

public class CategoriesOfAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age of a person");
		int age = scanner.nextInt();
		
		String ageGroup = (age<12)?"Child":
						(age<=19) ? "Teenager":	
						(age<=64) ? "Audult":	
									"senior";
		System.out.println("The person is:" + ageGroup);
			
	}

}
