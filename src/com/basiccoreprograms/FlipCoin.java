package com.basiccoreprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Welcome to Flip Coin Problem");
		Coin coin = new Coin();
		
		// INPUT number of times to flip the coin user should have to enter positive integer greater than ZERO
		Scanner scanner = new Scanner(System.in);
		int numberOfTimes = 0;
		while (numberOfTimes <= 0) {
			System.out.print("Enter number fo times to flip the coin : ");
			numberOfTimes = scanner.nextInt();
			if (numberOfTimes < 0) {
				System.out.println("Please enter positive number");
			}
		}
		
		System.out.println(numberOfTimes+" times have to flip the coin");
		
		System.out.println("Coin flip got " + coin.flip());
		
	}

}
