package br.com.xti.oop.polymorphism;

public class Hen extends Animal implements CalculableArea {
	
	double side;
	
	public Hen() {

	}

	public Hen(double side) {
		this.side = side;
	}
	
	void makeNoise() {
		System.out.println("Cluck, cluck!");
	}

	@Override
	public double calculateArea() {
		return side * 2.5;
	}
	
}
