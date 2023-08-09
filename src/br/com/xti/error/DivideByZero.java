package br.com.xti.error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
	
	public static void divide(Scanner scanner) 
		throws InputMismatchException, ArithmeticException
	{
		
		System.out.print("Number: ");
		int a = scanner.nextInt();
		
		System.out.print("Divider: ");
		int b = scanner.nextInt();
		
		System.out.println(a / b);
	}
	
	
	public static void main(String[] args) {
		
		// int x = 1/0;   ArithmeticException
		
		Scanner scanner = new Scanner(System.in);
		boolean goAhead = true;
		
		do {
			try {
				
				divide(scanner);
				goAhead = false;
				
			} 
			catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Invalid number");
				e1.getMessage();
				scanner.nextLine(); // clean input
			}
			finally {
				System.out.println("Finally!");
			}
		}while(goAhead);
		
		scanner.close();
		
	}

}
