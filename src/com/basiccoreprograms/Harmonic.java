package com.basiccoreprograms;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		System.out.println("Welcome To Harmonic Number Program");

		// INPUT Nth number which have to calculate Harmonic Number
		Scanner scanner = new Scanner(System.in);
		int nth = 0;
		while (nth == 0) {
			System.out.print("Enter positive number : ");
			nth = scanner.nextInt();
			if (nth < 0) {
				nth = -nth;
			}	
		}
		
		System.out.println("You have to show "+nth+"s Harmonic Number");
		
	}

}
