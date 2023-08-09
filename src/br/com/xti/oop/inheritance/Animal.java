package br.com.xti.oop.inheritance;

public class Animal {
	
	protected int serial;
	double weight;
	String food;
	
	public Animal(double weight, String food) {
		this.weight = weight;
		this.food = food;
	}
	
	void sleep() {
		System.out.println("It slept");
	}
	
	void makeNoise() {
		System.out.println("It's making noise");
	}

}
