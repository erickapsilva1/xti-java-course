package br.com.xti.oop;

public class Car {
	
	String model;
	int maxSpeed;
	double fromZeroToHundred;
	Engine engine;
	
	public Car() {
		
	}
	
	public Car(String model, int maxSpeed, double fromZeroToHundred) {
		this(model, maxSpeed, fromZeroToHundred, null);
	}
	
	public Car(String model, int maxSpeed, double fromZeroToHundred, Engine engine) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.fromZeroToHundred = fromZeroToHundred;
		this.engine = engine;
	}
	
}
