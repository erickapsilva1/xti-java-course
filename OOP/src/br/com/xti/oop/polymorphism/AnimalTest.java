package br.com.xti.oop.polymorphism;

public class AnimalTest {
	
	public static void noise(Animal animal) {
		animal.makeNoise();
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.food = "Dog food";
		dog.makeNoise();
		
		Hen hen = new Hen();
		hen.food = "Corn grain";
		hen.makeNoise();
		
		// Animal animal = new Animal(); error
		// animal.makeNoise();
		
		noise(dog);
		noise(hen);
		
	}

}
