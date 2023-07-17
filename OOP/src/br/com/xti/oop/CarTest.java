package br.com.xti.oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car ferrari = new Car();
		ferrari.model = "Ferrari Enzo";
		ferrari.maxSpeed = 349;
		ferrari.fromZeroToHundred = 3.2;
		
		Car koenigsegg = new Car("Koenigsegg CCXR", 430, 3.1);
		
		System.out.println(koenigsegg.model);
	}

}
