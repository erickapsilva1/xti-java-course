package br.com.xti.oop;

public class DogTest {

	public static void main(String[] args) {
		
		Dog pitbull = new Dog();
		pitbull.breed = "Pit Bull";
		pitbull.size = 40;
		pitbull.bark();
		
		Dog mutt = new Dog();
		mutt.breed = "Mutt";
		mutt.size = 30;
		mutt.bark();

	}

}
