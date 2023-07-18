package br.com.xti.oop.polymorphism;

public class Hen extends Animal {
	
	public Hen() {
		super(2, "Corn grain");
		this.serial = 12;
	}
	
	void makeNoise() {
		System.out.println("Cluck, cluck!");
	}
	
}
