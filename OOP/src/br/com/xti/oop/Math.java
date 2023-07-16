package br.com.xti.oop;

public class Math {
	
	/**
	 * @param number1
	 * @param number2
	 * @return the biggest of the two numbers
	 */
	int biggest(int number1, int number2) {
		if(number1 > number2) {
			return number1;
		}else {
			return number2;
		}
	}
	
	// to implement methods that accept "n" arguments, use "..." or "[]"
	double sum(String title, double ... numbers) {
		System.out.print(title);
		double totalSum = 0;
		
		for(double number : numbers) {
			totalSum += number;
		}
		return totalSum;
	}
	
	/**
	 * 
	 * @param number
	 * @return square root according to Pell's equation
	 */
	int root(int number) {
		
		int count = 0;
		int j = 1;
		
		do {
			number -= j;
			count += 1;
			j+=2;
		}while(number >= j);
		
		return count;
	}
	
	double average(double number1, double number2) {
		System.out.println("Assingment: average(double number1, double number2)");
		return (number1 + number2) / 2;
	}
	
	double average(double number1, double number2, double number3) {
		System.out.println("Assingment: average(double number1, double number2, double number3)");
		return (number1 + number2 + number3) / 3;
	}
	
	double average(double ... numbers) {
		System.out.println("Assingment: average(double ... numbers)");
		double numberSum = 0;
		
		for(double number : numbers) {
			numberSum += number;
		}
		return numberSum / numbers.length;
	}
	
	double average(String number1, String number2) {
		System.out.println("Assingment: average(String number1, String number2)");
		Float f1 = Float.parseFloat(number1);
		Float f2 = Float.parseFloat(number2);
		return (f1 + f2) / 2;
	}
	
}
