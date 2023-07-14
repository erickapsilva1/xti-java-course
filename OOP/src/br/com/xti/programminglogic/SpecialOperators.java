package br.com.xti.programminglogic;

public class SpecialOperators {
	public static void main(String[] args){
		
		// ternary operator
		int age = 6;
		String ageResult = age >= 18 ? "Over eighteen" : "under age";
		
		System.out.println(ageResult);
		
		// separator
		String gender = "F", country = "Japan";
		System.out.println("Gender: " + gender + ", " + "Country: " + country);
		
		// calculating the diameter of a circle --> 2r
		double radious = 10;
		double diameter = 2 * radious;
		
		System.out.println(diameter);

		// calculating the circumference of a circle --> 2 PI r
		double pi = Math.PI;
		double circumference = 2 * pi * radious;
		
		System.out.println(circumference);
		
		// calculating the area of a circle --> 2 r2
		double area = pi * (radious * radious);
		
		System.out.println(area);

		
	}
}