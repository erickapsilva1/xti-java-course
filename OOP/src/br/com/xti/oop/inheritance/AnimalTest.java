package br.com.xti.oop.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.food = "Dog food";
		dog.sleep();
		
		Hen hen = new Hen();
		hen.food = "Corn grain";
		hen.makeNoise();
		
		System.out.println(dog instanceof Dog);
		System.out.println(hen instanceof Animal);


	}

}
