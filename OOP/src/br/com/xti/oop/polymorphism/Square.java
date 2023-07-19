package br.com.xti.oop.polymorphism;

public class Square implements CalculableArea {
	
	double side;
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}

}
