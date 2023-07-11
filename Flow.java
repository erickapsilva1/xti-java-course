public class Flow {
	public static void main(String[] args){
		int age = 10;
		if(age < 11){
			System.out.println("It's a child");
		}
		
		boolean passed = true;
		if(passed){
			System.out.println("Hired");
		}
		
		// even or odd
		int number = 15;
		if((number % 2) == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		
		// multi-criteria
		int nAge = 87;
		if(nAge <= 11){
			System.out.println("It's a child");
		}else if(nAge <= 18){
			System.out.println("It's a teenage");
		}else if(nAge <= 60){
			System.out.println("It's an adult");
		}else{
			System.out.println("It's a elderly");
		};
		
		// nasted ifs
		double grade = 6.5;
		if(grade >= 7){
			System.out.println("Passed!");
		}else{
			System.out.println("Failed");
			if(grade >= 6){
				System.out.println("But you can try again...");
			}
		}
		
		
	}
}