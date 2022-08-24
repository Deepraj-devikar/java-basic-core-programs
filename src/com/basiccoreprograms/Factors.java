package com.basiccoreprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		System.out.println("Welcome to Factors Program");

		// INPUT Nth number which have to calculate Factors
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		while (number == 0) {
			System.out.print("Enter positive number : ");
			number = scanner.nextInt();
			if (number < 0) {
				number = -number;
			}	
		}
		
		System.out.println("You have to show "+number+"s Factors");

	}
}
