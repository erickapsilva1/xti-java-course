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
	
	double sum(double number1, double number2) {
		return number1 + number2;
	}
	
}
