package br.com.xti.error;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 10: ");
		int number = scanner.nextInt();
		
		assert(number >= 0 && number <= 10);
		System.out.println("You entered: " + number);

	}

}
