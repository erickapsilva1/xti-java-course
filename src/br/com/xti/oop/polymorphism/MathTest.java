package br.com.xti.oop.polymorphism;

public class MathTest {
	
	public static void myCalculate(Math math, double x, double y) {
		System.out.println(math.calculate(x, y));
	}

	public static void main(String[] args) {
		
		myCalculate(new Sum(), 2, 2);
		myCalculate(new Multiplication(), 9, 9);
		
	}

}
