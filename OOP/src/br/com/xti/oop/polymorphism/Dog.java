package br.com.xti.oop.polymorphism;

public class Dog extends Animal {
	
	public Dog() {
		super(5, "Dog food");
	}
	
	void makeNoise() {
		System.out.println("Wof, wof!");
	}
	
}
