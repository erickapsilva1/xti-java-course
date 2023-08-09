package br.com.xti.oop.polymorphism;

public abstract class Animal {
	
	protected int serial;
	double weight;
	String food;
	
	final void sleep() {
		System.out.println("it slept");
	}
	
	abstract void makeNoise();

}
