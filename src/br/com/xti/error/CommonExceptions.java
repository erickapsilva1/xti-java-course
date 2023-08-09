package br.com.xti.error;

import br.com.xti.oop.inheritance.Animal;
import br.com.xti.oop.inheritance.Dog;
import br.com.xti.oop.inheritance.Hen;

public class CommonExceptions {
	
	static int[] nullArray;
	static int[] nullArrayPos = new int[0];

	public static void main(String[] args) {
		
		// NullPointerException
		//System.out.println(nullArray.length);
		
		// ArithmeticException
		//int x = 5 / 0;
		
		// ArrayIndexOutOfBoundsException
		//System.out.println(nullArrayPos[2]);
		
		// ClassCastException
		Animal animal = new Hen();
		Hen hen = (Hen) animal;  // ok
		// Dog dog = (Dog) hen;  // cast error
		
		// NumberFormatException
		int integer = Integer.parseInt("x");
		
	}

}
