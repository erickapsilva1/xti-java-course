package br.com.xti.oop.polymorphism;

public class Cube implements CalculableVolume, CalculableArea {
	
	double side;
	public Cube(double side) {
		this.side = side;
	}
	
	@Override
	public double calculateVolume() {
		return side * side * side;
	}

	@Override
	public double calculateArea() {
		return 6 * side * side;
	}

}
