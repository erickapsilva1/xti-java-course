package br.com.xti.programminglogic;

import java.util.Scanner;

public class SpecialOperatorsII {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, type the value for the radious: ");
		double radious = scanner.nextDouble();
		
		// calculating the diameter of a circle --> 2r
		double diameter = 2 * radious;
		
		System.out.println("Diameter: " + diameter);

		// calculating the circumference of a circle --> 2 PI r
		double pi = Math.PI;
		double circumference = 2 * pi * radious;
		
		System.out.println("Circumference: " + circumference);
		
		// calculating the area of a circle --> 2 r2
		double area = pi * (radious * radious);
		
		System.out.println("Area: " + area);

		
	}
}