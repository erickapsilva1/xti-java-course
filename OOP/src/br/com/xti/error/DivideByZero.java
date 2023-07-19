package br.com.xti.error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		// int x = 1/0;   ArithmeticException
		
		Scanner scanner = new Scanner(System.in);
		boolean goAhead = true;
		
		do {
			try {
				
				System.out.print("Number: ");
				int a = scanner.nextInt();
				
				System.out.print("Divider: ");
				int b = scanner.nextInt();
				
				System.out.println(a / b);
				goAhead = false;
				
			} 
			catch(InputMismatchException e1) {
				System.err.println("Numbers must be integers.");
				scanner.nextLine(); // clean input
			}
			catch(ArithmeticException e2) {
				System.err.println("Divider must be different from zero.");
				scanner.nextLine(); // clean input
			}
			finally {
				System.out.println("Finally!");
			}
		}while(goAhead);
		
		scanner.close();
		
	}

}
