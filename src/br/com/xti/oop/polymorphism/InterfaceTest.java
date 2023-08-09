package br.com.xti.oop.polymorphism;

public class InterfaceTest {
	
	public static void area(CalculableArea calculableArea) {
		System.out.println(calculableArea.calculateArea());
	}
	
	public static void volume(CalculableVolume calculableVolume) {
		System.out.println(calculableVolume.calculateVolume());
	}
	
	public static void main(String[] args) {
		
		area(new Square(2));
		area(new Cube(56));
		area(new Hen(5));
		volume(new Cube(87));

	}

}
