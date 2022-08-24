package com.basiccoreprograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Power Of 2 Program");
		
		// INPUT Nth number up to which calculate Power Of 2 Table
		Scanner scanner = new Scanner(System.in);
		int nth = 0;
		System.out.print("Enter positive number : ");
		nth = scanner.nextInt();
		if (nth < 0) {
			nth = -nth;
		}
		
		System.out.println("You want show power of 2 table upto "+nth);
	}

}
