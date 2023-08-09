package br.com.xti.oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car ferrari = new Car();
		ferrari.model = "Ferrari Enzo";
		ferrari.maxSpeed = 349;
		ferrari.fromZeroToHundred = 3.2;
		Engine v12 = new Engine();
		v12.type = "V12";
		v12.enginePower = 660;
		ferrari.engine = v12;   // add a Engine to a Car
		
		Car koenigsegg = new Car("Koenigsegg CCXR", 430, 3.1);
		Engine v8 = new Engine("V8", 1018);
		koenigsegg.engine = v8;
		
		System.out.println(koenigsegg.engine.enginePower);
		
		Car bugatti = new Car("Bugatti Veyron", 430, 2.2, new Engine("W16", 1200));
		System.out.println(bugatti.engine.enginePower);
		
	}

}
