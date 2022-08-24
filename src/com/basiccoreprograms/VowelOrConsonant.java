package com.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		System.out.println("Welcome To Vowel Or Consonant Program");
		
		Scanner scanner = new Scanner(System.in);
		// INPUT character
		String character;
		System.out.print("Enter character : ");
		character = scanner.nextLine();
		
		System.out.println("You entered character "+character);

	}

}
